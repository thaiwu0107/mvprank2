package com.pattern.thai.mvpapplication.delegates;

import com.google.gson.Gson;

import android.app.Application;

import com.jess.arms.di.scope.ActivityScope;
import com.pattern.thai.mvpapplication.mvp.loginactivity.LogInContract;
import com.pattern.thai.mvpapplication.mvp.loginactivity.LogInModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ggttoo44 on 2017/5/9.
 */

@Module
public class LogInModule {
    private LogInContract.View view;

    /**
     * 構建LogInModule時，將View的實現類傳進來，這樣就可以提供View的實現類給presenter
     *
     * @param view
     */
    public LogInModule(LogInContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    LogInContract.View provideLogInView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    LogInContract.Model provideLogInModel(LogInModel model) {
        return model;
    }
}