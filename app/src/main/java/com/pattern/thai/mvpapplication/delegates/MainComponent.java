package com.pattern.thai.mvpapplication.delegates;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.pattern.thai.mvpapplication.mvp.mainactivity.MainActivity;

import dagger.Component;

/**
 * Created by ggttoo44 on 2017/5/9.
 */

@ActivityScope
@Component(modules = MainModule.class, dependencies = AppComponent.class)
public interface MainComponent {
    void inject(MainActivity activity);
}