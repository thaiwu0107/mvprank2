package com.pattern.thai.mvpapplication.delegates;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.pattern.thai.mvpapplication.mvp.startavtivity.StartActivity;

import dagger.Component;

/**
 * 初始設定溝通介面
 * Created by ggttoo44 on 2017/5/9.
 */

@ActivityScope
@Component(modules = StartModule.class, dependencies = AppComponent.class)
public interface StartComponent {
    void inject(StartActivity activity);
}