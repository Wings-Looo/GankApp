package com.wings.gankapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.wings.gankapp.entity.TestBean;
import com.wings.gankapp.network.BaseRequest;
import com.wings.gankapp.network.GetRandomBeautiesRequest;
import rx.Observer;

/**
 * Created by wings on 2017/3/15.
 */

public class MainActivity extends Activity{

    private static final String TAG = "MainActivity";
    private BaseRequest<TestBean> enqueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enqueue = new GetRandomBeautiesRequest(1).enqueue(new Observer<TestBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: " + e.toString());
            }

            @Override
            public void onNext(TestBean s) {
                Log.e(TAG, "onNext: " + s.toString());
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        enqueue.unSubscribe();
    }

}
