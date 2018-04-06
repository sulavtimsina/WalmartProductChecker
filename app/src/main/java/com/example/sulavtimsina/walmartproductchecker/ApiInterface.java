package com.example.sulavtimsina.walmartproductchecker;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

//    @GET("860521932?apiKey=xfsk5b37m9nczburwdkgvdat&format=json")
    @GET("echoJson1.php")
    Call<List<Contact>> getContacts();
}
