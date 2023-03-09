package com.college.anwesha2k23.profile


import android.content.Context
import com.college.anwesha2k23.AddCookiesInterceptor
import com.college.anwesha2k23.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


interface ProfileApi {

    @GET("user/editprofile")
    suspend fun getProfile() : Response<ProfileResponse>

    @GET("event/myevents")
    suspend fun getMyEvents() : Response<MyEvents>

}

class UserProfileApi(val context: Context) {
    val profileApi: ProfileApi
    init {

        val client = OkHttpClient.Builder().addInterceptor(AddCookiesInterceptor(context)).build()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
        profileApi = retrofit.create(ProfileApi::class.java)
    }
}