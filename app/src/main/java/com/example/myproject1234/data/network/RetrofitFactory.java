package com.example.myproject1234.data.network;

import com.example.myproject1234.data.NewsApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {
    private static RetrofitFactory INSTANCE;

    private RetrofitFactory() {}

    public static synchronized RetrofitFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RetrofitFactory();
        }
        return INSTANCE;
    }

    private final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.spacexdata.com/v3")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public NewsApi getNewsApi() {
        return retrofit.create(NewsApi.class);
    }
}
