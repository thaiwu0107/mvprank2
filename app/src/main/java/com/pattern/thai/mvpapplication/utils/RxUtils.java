package com.pattern.thai.mvpapplication.utils;

import com.jess.arms.mvp.IView;
import com.trello.rxlifecycle2.LifecycleTransformer;
import com.trello.rxlifecycle2.components.RxFragment;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by ggttoo44 on 2017/5/9.
 */

public class RxUtils {
    public static <T> ObservableTransformer<T, T> applySchedulers(final IView view) {
        return (Observable<T> observable) -> observable.subscribeOn(Schedulers.io())
                .doOnSubscribe((Disposable disposable) -> view.showLoading())
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doAfterTerminate(view::hideLoading)
                .compose(RxUtils.bindToLifecycle(view));
    }


    public static <T> LifecycleTransformer<T> bindToLifecycle(IView view) {
        if (view instanceof RxAppCompatActivity) {
            return ((RxAppCompatActivity) view).bindToLifecycle();
        } else if (view instanceof RxFragment) {
            return ((RxFragment) view).bindToLifecycle();
        } else {
            throw new IllegalArgumentException("view isn't activity or fragment");
        }

    }
}
