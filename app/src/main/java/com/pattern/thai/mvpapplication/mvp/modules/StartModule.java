package com.pattern.thai.mvpapplication.mvp.modules;

import com.jess.arms.di.scope.ActivityScope;
import com.pattern.thai.mvpapplication.mvp.contracts.StartContract;
import com.pattern.thai.mvpapplication.mvp.models.StartModel;
import dagger.Module;
import dagger.Provides;

/**
 * Created by ggttoo44 on 2017/5/9.
 */

@Module
public class StartModule {
    private StartContract.View view;

    /**
     * 构建StartModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     * @param view
     */
    public StartModule(StartContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    StartContract.View provideStartView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    StartContract.Model provideStartModel(StartModel model) {
        return model;
    }
}