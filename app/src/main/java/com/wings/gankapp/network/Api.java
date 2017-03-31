package com.wings.gankapp.network;

import com.wings.gankapp.entity.TestBean;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by wings on 2017/3/29.
 */

public interface Api {

    @GET("data/{category}/{number}/{page}")
    Observable getCategoryDate(@Path("category") String category, @Path("number") int number, @Path("page") int page);

    @GET("random/data/福利/{number}")
    Observable<TestBean> getRandomBeauties(@Path("number") int number);

    @GET("search/query/{key}/category/all/count/{count}/page/{page}")
    Observable getSearchResult(@Path("key") String key, @Path("count") int count, @Path("page") int page);

}
