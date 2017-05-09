package com.pattern.thai.mvpapplication.delegates;

import com.google.gson.Gson;

import android.app.Application;

import com.jess.arms.di.scope.ActivityScope;
import com.pattern.thai.mvpapplication.mvp.mainactivity.MainContract;
import com.pattern.thai.mvpapplication.mvp.mainactivity.MainModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ggttoo44 on 2017/5/9.
 */

@Module
public class MainModule {
    private MainContract.View view;

    /**
     * 構建MainModule時，將View的實現類傳進來，這樣就可以提供View的實現類給presenter
     *
     * @param view
     */
    public MainModule(MainContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    MainContract.View provideMainView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    MainContract.Model provideMainModel(MainModel model) {
        return model;
    }
}