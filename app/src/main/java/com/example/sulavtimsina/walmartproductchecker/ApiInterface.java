package com.example.sulavtimsina.walmartproductchecker;

import com.example.sulavtimsina.walmartproductchecker.Product.ProductModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("vwxn7")
    Call<List<Contact>> getContacts();
}
