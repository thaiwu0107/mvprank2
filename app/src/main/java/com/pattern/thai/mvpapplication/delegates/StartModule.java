package com.pattern.thai.mvpapplication.delegates;

import com.jess.arms.di.scope.ActivityScope;
import com.pattern.thai.mvpapplication.mvp.startavtivity.StartContract;
import com.pattern.thai.mvpapplication.mvp.startavtivity.StartModel;
import dagger.Module;
import dagger.Provides;

/**
 * 初始設定溝通介面
 * Created by ggttoo44 on 2017/5/9.
 */
@Module
public class StartModule {
    private StartContract.View view;

    /**
     * 構建MainModule時，將View的實現類傳進來，這樣就可以提供View的實現類給presenter
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