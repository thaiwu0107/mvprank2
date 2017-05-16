package com.pattern.thai.mvpapplication.models.api.request;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by ggttoo44 on 2017/2/21.
 */

public interface GetDTHistory {
    String Query = "Get DT History";
    @Headers("Cache-Control: no-store")
    @POST("/")
    Observable<String> sendRequest(@Body Map<String,String> body);
}
