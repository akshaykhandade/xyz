package com.retrofitdemo.com.retrodemo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    //@GET("/getApi")
    @GET("/api/unknown/2")

    Call<String> getNameApi();
}
