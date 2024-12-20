package com.example.myproject1234.data;

import com.example.myproject1234.domain.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NewsApi {

    @GET("v3/history")
    Call<List<News>> getAll();

    @GET("v3/history/{id}")
    Call<News> getById(@Path("id") int id);
}
