package com.pattern.thai.mvpapplication.mvp.loginactivity;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import static com.jess.arms.utils.Preconditions.checkNotNull;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

/**
 * Model實現
 */

/**
 * Created by ggttoo44 on 2017/5/9.
 */

@ActivityScope
public class LogInModel extends BaseModel implements LogInContract.Model {
    private Gson mGson;
    private Application mApplication;

    @Inject
    public LogInModel(IRepositoryManager repositoryManager, Gson gson, Application application) {
        super(repositoryManager);
        this.mGson = gson;
        this.mApplication = application;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

}