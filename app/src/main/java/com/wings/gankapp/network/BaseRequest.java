package com.wings.gankapp.network;


import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by wings on 2017/3/29.
 */

public abstract class BaseRequest<T> {
    private CompositeSubscription mSubscriptions;
    public Api api;

    public BaseRequest() {
        mSubscriptions = new CompositeSubscription();
        api = NetWork.getApi();
    }

    public BaseRequest<T> enqueue(Observer<T> observer) {
        Subscription subscription = createObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
        mSubscriptions.add(subscription);
        return this;
    }

    public void unSubscribe() {
        mSubscriptions.clear();
    }

    public abstract Observable<T> createObservable();
}
