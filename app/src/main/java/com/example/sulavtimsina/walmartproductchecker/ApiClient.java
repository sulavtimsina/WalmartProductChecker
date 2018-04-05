package com.example.sulavtimsina.walmartproductchecker;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
//    public static final String BASE_URL = "https://api.myjson.com/bins/";
//    public static final String BASE_URL = "http://api.walmartlabs.com/v1/items/";
    public static final String BASE_URL = "https://api.myjson.com/bins/";
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){
        if(retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return  retrofit;
    }
}

