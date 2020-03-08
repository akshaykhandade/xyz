package com.retrofitdemo.com.retrodemo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API {

    private static RetrofitInterface retrofitInterface;

    private API(){

    }

    public static RetrofitInterface getApiClient(){
        if (retrofitInterface == null){
            Retrofit retrofit;
            retrofit = new Retrofit.Builder()
                    //.baseUrl("http://demo6804188.mockable.io/")
                    .baseUrl("https://reqres.in/")

                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            retrofitInterface = retrofit.create(RetrofitInterface.class);
        }

        return retrofitInterface;
    }
}
