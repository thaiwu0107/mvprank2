package com.pattern.thai.mvpapplication.delegates;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.pattern.thai.mvpapplication.mvp.loginactivity.LogInActivity;

import dagger.Component;

/**
 * Created by ggttoo44 on 2017/5/9.
 */

@ActivityScope
@Component(modules = LogInModule.class, dependencies = AppComponent.class)
public interface LogInComponent {
    void inject(LogInActivity activity);
}