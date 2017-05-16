package com.pattern.thai.mvpapplication.models.api.request;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import io.reactivex.Observable;

/**
 * Created by ggttoo44 on 2017/3/13.
 */

public interface VoidDTHistory {
    String Query = "Void DT History";
    @POST("/")
    @Headers("Cache-Control: no-store")
    Observable<String> sendRequest(@Body Map<String,String> body);
}
