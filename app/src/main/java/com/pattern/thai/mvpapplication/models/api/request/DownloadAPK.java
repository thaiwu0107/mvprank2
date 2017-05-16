package com.pattern.thai.mvpapplication.models.api.request;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import io.reactivex.Observable;

/**
 * Created by ggttoo44 on 2017/4/10.
 */

public interface DownloadAPK {
    String Query = "Download APK";
    @Headers("Cache-Control: no-cache")
    @POST("/")
    Observable<String> sendRequest(@Body Map<String,String> body);
}
