package com.pattern.thai.mvpapplication.mvp.presenters;

import android.app.Application;

import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.widget.imageloader.ImageLoader;
import com.pattern.thai.mvpapplication.mvp.contracts.StartContract;

import me.jessyan.rxerrorhandler.core.RxErrorHandler;

import javax.inject.Inject;


/**
 * Created by ggttoo44 on 2017/5/9.
 */

@ActivityScope
public class StartPresenter extends BasePresenter<StartContract.Model,StartContract.View> {
    private RxErrorHandler mErrorHandler;
    private Application mApplication;
    private ImageLoader mImageLoader;
    private AppManager mAppManager;

    @Inject
    public StartPresenter(StartContract.Model model, StartContract.View rootView
            , RxErrorHandler handler, Application application
            , ImageLoader imageLoader, AppManager appManager) {
        super(model, rootView);
        this.mErrorHandler = handler;
        this.mApplication = application;
        this.mImageLoader = imageLoader;
        this.mAppManager = appManager;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
    }

}