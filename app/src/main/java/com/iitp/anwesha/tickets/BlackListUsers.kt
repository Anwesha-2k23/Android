package com.iitp.anwesha.tickets

val blackListUsers = arrayListOf(
    "user1@example.com",
    "user2@example.com",
    "user3@example.com",
    "himanshu_2101mm09@iitp.ac.in",
    "satyam_2101mm27@iitp.ac.in",
    "vikas_2101mm38@iitp.ac.in",
    "yash_2101mm40@iitp.ac.in",
    "falendra_2000MM03@iitp.ac.in",
    "ade_2101me04@iitp.ac.in",
    "anil_2101me09@iitp.ac.in",
    "anubhav_2101me10@iitp.ac.in",
    "arun_2101me13@iitp.ac.in",
    "ashish_2101me15@iitp.ac.in",
    "ashraf_2101me16@iitp.ac.in",
    "awantika_2101me17@iitp.ac.in",
    "desetti_2101me21@iitp.ac.in",
    "gaganjot_2101me22@iitp.ac.in",
    "gorla_2101me24@iitp.ac.in",
    "harsh_2101me26@iitp.ac.in",
    "harshita_2101me27@iitp.ac.in",
    "jahnavi_2101me30@iitp.ac.in",
    "kshitij_2101me37@iitp.ac.in",
    "mahiba_2101me38@iitp.ac.in",
    "nishant_2101me45@iitp.ac.in",
    "piyusha_2101me48@iitp.ac.in",
    "pragati_2101me49@iitp.ac.in",
    "priyanshu_2101me51@iitp.ac.in",
    "saurabh_2101me61@iitp.ac.in",
    "shivam_2101me62@iitp.ac.in",
    "shivani_2101me64@iitp.ac.in",
    "shudhanshu_2101me66@iitp.ac.in",
    "sigilipalli_2101me68@iitp.ac.in",
    "suryansh_2101me72@iitp.ac.in",
    "swabnam_2101me74@iitp.ac.in",
    "vaibhav_2101me77@iitp.ac.in",
    "vinay_2101me79@iitp.ac.in",
    "anjali_2101mc05@iitp.ac.in",
    "aryandeep_2101mc12@iitp.ac.in",
    "chaudhari_2101mc15@iitp.ac.in",
    "harshit_2101mc20@iitp.ac.in",
    "harshit_2101mc21@iitp.ac.in",
    "himanshu_2101mc22@iitp.ac.in",
    "tushar_2101mc43@iitp.ac.in",
    "pulkit_2101mc48@iitp.ac.in",
    "anurag_2101ai04@iitp.ac.in",
    "chindaluru_2101ai12@iitp.ac.in",
    "medikonda_2101ai18@iitp.ac.in",
    "mukund_2101ai19@iitp.ac.in",
    "polimetla_2101ai22@iitp.ac.in",
    "rakesh_2101ai26@iitp.ac.in",
    "ramavath_2101ai27@iitp.ac.in",
    "rangapuram_2101ai28@iitp.ac.in",
    "sai_2101ai29@iitp.ac.in",
    "aman_2101ai37@iitp.ac.in",
    "toshit_2101ai39@iitp.ac.in",
    "abhay_2101cb01@iitp.ac.in",
    "abhishek_2101cb03@iitp.ac.in",
    "aditi_2101cb05@iitp.ac.in",
    "alisha_2101cb09@iitp.ac.in",
    "anushree_2101cb11@iitp.ac.in",
    "arun_2101cb13@iitp.ac.in",
    "avinash_2101cb16@iitp.ac.in",
    "deepak_2101cb23@iitp.ac.in",
    "kona_2101cb30@iitp.ac.in",
    "ankita_2101cb33@iitp.ac.in",
    "latu_2101cb35@iitp.ac.in",
    "mrinal_2101cb38@iitp.ac.in",
    "nandan_2101cb39@iitp.ac.in",
    "parshant_2101cb41@iitp.ac.in",
    "pradeep_2101cb42@iitp.ac.in",
    "rohit_2101cb48@iitp.ac.in",
    "sahini_2101cb49@iitp.ac.in",
    "shaaz_2101cb53@iitp.ac.in",
    "yogesh_2101cb61@iitp.ac.in",
    "manisha_2000CB04@iitp.ac.in",
    "aditya_2101ce03@iitp.ac.in",
    "alekh_2101ce04@iitp.ac.in",
    "areeba_2101ce11@iitp.ac.in",
    "ashish_2101ce12@iitp.ac.in",
    "ayush_2101ce14@iitp.ac.in",
    "chandan_2101ce15@iitp.ac.in",
    "garima_2101ce20@iitp.ac.in",
    "harsh_2101ce24@iitp.ac.in",
    "himanshi _2101ce26@iitp.ac.in",
    "jagdish_2101ce27@iitp.ac.in",
    "jallipalli_2101ce28@iitp.ac.in",
    "kuldeep_2101ce33@iitp.ac.in",
    "aditya_2101ce34@iitp.ac.in",
    "lakshya_2101ce35@iitp.ac.in",
    "manish_2101ce37@iitp.ac.in",
    "prakash_2101ce39@iitp.ac.in",
    "prashant_2101ce41@iitp.ac.in",
    "priyanshu_2101ce44@iitp.ac.in",
    "rajkamal_2101ce46@iitp.ac.in",
    "ramprasad_2101ce48@iitp.ac.in",
    "shashikant_2101ce50@iitp.ac.in",
    "shlok_2101ce51@iitp.ac.in",
    "shruti_2101ce53@iitp.ac.in",
    "subham_2101ce55@iitp.ac.in",
    "sudhanshu_2101ce56@iitp.ac.in",
    "swarnendu_2101ce57@iitp.ac.in",
    "vansh_2101ce60@iitp.ac.in",
    "varikuti_2101ce61@iitp.ac.in",
    "yash_2101ce62@iitp.ac.in",
    "yuvraj_2101ce63@iitp.ac.in",
    "aakash_2101ee01@iitp.ac.in",
    "akash_2101ee06@iitp.ac.in",
    "amisha_2101ee07@iitp.ac.in",
    "anushka_2101ee11@iitp.ac.in",
    "archita_2101ee12@iitp.ac.in",
    "arjun_2101ee14@iitp.ac.in",
    "arvind_2101ee16@iitp.ac.in",
    "aryan_2101ee17@iitp.ac.in",
    "aryan_2101ee18@iitp.ac.in",
    "bata_2101ee19@iitp.ac.in",
    "bollikonda_2101ee20@iitp.ac.in",
    "burri_2101ee21@iitp.ac.in",
    "chitraksh_2101ee25@iitp.ac.in",
    "dowleswarapu_2101ee27@iitp.ac.in",
    "gaurang_2101ee29@iitp.ac.in",
    "gaurav_2101ee31@iitp.ac.in",
    "gaurav_2101ee32@iitp.ac.in",
    "gujjula_2101ee33@iitp.ac.in",
    "harsh_2101ee35@iitp.ac.in",
    "heet_2101ee36@iitp.ac.in",
    "hridyanshu_2101ee38@iitp.ac.in",
    "kaur_2101ee41@iitp.ac.in",
    "kethavath_2101ee43@iitp.ac.in",
    "nikhil_2101ee46@iitp.ac.in",
    "partha_2101ee50@iitp.ac.in",
    "piyush_2101ee51@iitp.ac.in",
    "pokala_2101ee52@iitp.ac.in",
    "praveen_2101ee54@iitp.ac.in",
    "shrihari_2101ee68@iitp.ac.in",
    "thanneeru_2101ee74@iitp.ac.in",
    "tripti_2101ee75@iitp.ac.in",
    "udita_2101ee77@iitp.ac.in",
    "vaibhav_2101ee80@iitp.ac.in",
    "aditya_2101ee87@iitp.ac.in",
    "divyansh_2101ee89@iitp.ac.in",
    "ayush_2101ee90@iitp.ac.in",
    "abhishek_2101ee92@iitp.ac.in",
    "aditya_2101ee93@iitp.ac.in",
    "debashish_2101ee95@iitp.ac.in",
    "mihir_2101ee99@iitp.ac.in",
    "aman_2101ph05@iitp.ac.in",
    "aniket_2101ph08@iitp.ac.in",
    "aryan_2101ph11@iitp.ac.in",
    "ayesha_2101ph12@iitp.ac.in",
    "chandan_2101ph15@iitp.ac.in",
    "kommunuri_2101ph18@iitp.ac.in",
    "nitish_2101ph22@iitp.ac.in",
    "sanjana_2101ph29@iitp.ac.in",

    "poornash_2101cs01@iitp.ac.in",
    "abhijeet_2101cs02@iitp.ac.in",
    "amisha_2101cs08@iitp.ac.in",
    "amit_2101cs09@iitp.ac.in",
    "anshu_2101cs10@iitp.ac.in",
    "asif_2101cs13@iitp.ac.in",
    "ayush_2101cs15@iitp.ac.in",
    "bellamkonda_2101cs17@iitp.ac.in",
    "bollampalli_2101cs19@iitp.ac.in",
    "dasari_2101cs22@iitp.ac.in",
    "deepanker_2101cs23@iitp.ac.in",
    "devarasetty_2101cs24@iitp.ac.in",
    "dhruv_2101cs25@iitp.ac.in",
    "dhruv_2101cs26@iitp.ac.in",
    "divit_2101cs27@iitp.ac.in",
    "ganji_2101cs29@iitp.ac.in",
    "gurubelli_2101cs30@iitp.ac.in",
    "kalpit_2101cs34@iitp.ac.in",
    "kasula_2101cs35@iitp.ac.in",
    "kethavath_2101cs36@iitp.ac.in",
    "priya_2101cs40@iitp.ac.in",
    "mailaram_2101cs41@iitp.ac.in",
    "marupaka_2101cs44@iitp.ac.in",
    "nagireddy_2101cs48@iitp.ac.in",
    "naitik_2101cs49@iitp.ac.in",
    "niraj_2101cs51@iitp.ac.in",
    "ponnada_2101cs57@iitp.ac.in",
    "prashik_2101cs60@iitp.ac.in",
    "prince_2101cs62@iitp.ac.in",
    "rayudu_2101cs65@iitp.ac.in",
    "sagar_2101cs68@iitp.ac.in",
    "sampreety_2101cs71@iitp.ac.in",
    "satyam_2101cs72@iitp.ac.in",
    "shubham_2101cs73@iitp.ac.in",
    "sravyasri_2101cs74@iitp.ac.in",
    "tatiparthi_2101cs77@iitp.ac.in",
    "tejas_2101cs78@iitp.ac.in",
    "vardhan_2101cs80@iitp.ac.in",
    "vineet_2101cs83@iitp.ac.in",
    "gonnabattula_2000CS02@iitp.ac.in",
    "mohammed_2000CS03@iitp.ac.in",
    "asmit_2101cs87@iitp.ac.in",
)