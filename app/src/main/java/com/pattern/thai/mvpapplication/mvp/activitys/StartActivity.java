package com.pattern.thai.mvpapplication.mvp.activitys;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.UiUtils;
import com.pattern.thai.mvpapplication.R;
import com.pattern.thai.mvpapplication.mvp.components.DaggerStartComponent;
import com.pattern.thai.mvpapplication.mvp.contracts.StartContract;
import com.pattern.thai.mvpapplication.mvp.modules.StartModule;
import com.pattern.thai.mvpapplication.mvp.presenters.StartPresenter;
import com.tbruyelle.rxpermissions2.RxPermissions;


import static com.jess.arms.utils.Preconditions.checkNotNull;

/**
 * Created by ggttoo44 on 2017/5/9.
 */

public class StartActivity extends BaseActivity<StartPresenter> implements StartContract.View {

    private RxPermissions mRxPermissions;

    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        this.mRxPermissions = new RxPermissions(this);
        DaggerStartComponent
                .builder()
                .appComponent(appComponent)
                .startModule(new StartModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView() {
        return R.layout.activity_start;
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


    @Override
    public RxPermissions getRxPermissions() {
        return null;
    }
}