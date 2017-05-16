package com.pattern.thai.mvpapplication.models.api.request;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import io.reactivex.Observable;

/**
 * Created by ggttoo44 on 2017/2/13.
 */

public interface DTUserLoginQuery{
    String Query = "User Login";
    @POST("/")
    @Headers("Cache-Control: no-cache")
    Observable<String> sendRequest(@Body Map<String,String> body);
}
