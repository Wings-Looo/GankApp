package com.wings.gankapp.network;

import com.wings.gankapp.entity.TestBean;

import rx.Observable;
/**
 * Created by wings on 2017/3/29.
 */

public class GetRandomBeautiesRequest extends BaseRequest<TestBean> {

    private int num;

    public GetRandomBeautiesRequest(int num) {
        super();
        this.num = num;
    }

    @Override
    public Observable<TestBean> createObservable() {
        return api.getRandomBeauties(num);
    }


}