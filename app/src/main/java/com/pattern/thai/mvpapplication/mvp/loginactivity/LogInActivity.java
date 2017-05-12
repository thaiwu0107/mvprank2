package com.pattern.thai.mvpapplication.mvp.loginactivity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.UiUtils;
import com.pattern.thai.mvpapplication.R;
import com.pattern.thai.mvpapplication.delegates.DaggerLogInComponent;
import com.pattern.thai.mvpapplication.delegates.LogInModule;

import static com.jess.arms.utils.Preconditions.checkNotNull;
/**
 *   @Inject在初始化的過程中,經過inject建造過程之後
 *   @Inject:inject();之後就可以透過已經標示@Inject的物件拿到實例
 */
/**
 * Created by ggttoo44 on 2017/5/9.
 */

public class LogInActivity extends BaseActivity<LogInPresenter> implements LogInContract.View {


    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        DaggerLogInComponent
                .builder()
                .appComponent(appComponent)
                //請將LogInModule()第一個首字母改為小寫
                .logInModule(new LogInModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView() {
        return R.layout.activity_login;
    }

    @Override
    public void initData() {

    }


    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        UiUtils.SnackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        UiUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }


}