package com.coolweather.app.util;

/**
 * Created by S.L.Zhao on 2017/3/25.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
