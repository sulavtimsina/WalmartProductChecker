package com.example.sulavtimsina.walmartproductchecker;

import com.example.sulavtimsina.walmartproductchecker.Product.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

//    @GET("860521932?apiKey=xfsk5b37m9nczburwdkgvdat&format=json")
    @GET("items/{sku}?apiKey=xfsk5b37m9nczburwdkgvdat&format=json")
    Call<List<Product>> getProducts(@Path("sku") String sku);
}
