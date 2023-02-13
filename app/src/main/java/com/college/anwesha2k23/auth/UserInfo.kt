package com.college.anwesha2k23.auth

data class UserLoginInfo(
    val username: String,
    val password: String
)

data class UserRegisterInfo(
    val email_id: String,
    val password: String,
    val full_name: String,
    val phone_number: String
)

data class LoginResponse(
    val success: String,
    val name: String
)

data class RegisterResponse(
    val message: String
)