package com.wings.gankapp.network;


import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wings on 2017/3/29.
 */

public class NetWork {
    private static Api api;

    public static Api getApi() {
        if (api == null) {
            api = new Retrofit.Builder()
                    .client(new OkHttpClient())
                    .baseUrl("http://gank.io/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build()
                    .create(Api.class);
        }
        return api;
    }

}