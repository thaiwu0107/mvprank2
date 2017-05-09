package com.pattern.thai.mvpapplication.models.api;

import com.pattern.thai.mvpapplication.models.entitys.AData;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.rx_cache2.DynamicKey;
import io.rx_cache2.EvictProvider;
import io.rx_cache2.LifeCache;
import io.rx_cache2.Reply;

/**
 * Created by ggttoo44 on 2017/5/9.
 */

public interface CommonCache {
    @LifeCache(duration = 2, timeUnit = TimeUnit.MINUTES)
    Observable<Reply<List<AData>>> getDatas(Observable<List<AData>> users, DynamicKey idLastUserQueried, EvictProvider evictProvider);
}
