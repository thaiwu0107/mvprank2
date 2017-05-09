package com.pattern.thai.mvpapplication.mvp.components;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.pattern.thai.mvpapplication.mvp.activitys.StartActivity;
import com.pattern.thai.mvpapplication.mvp.modules.StartModule;

import dagger.Component;

/**
 * Created by ggttoo44 on 2017/5/9.
 */

@ActivityScope
@Component(modules = StartModule.class, dependencies = AppComponent.class)
public interface StartComponent {
    void inject(StartActivity activity);
}