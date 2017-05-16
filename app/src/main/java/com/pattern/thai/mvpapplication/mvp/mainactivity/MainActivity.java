package com.pattern.thai.mvpapplication.mvp.mainactivity;

import android.content.Intent;
import android.support.annotation.NonNull;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.UiUtils;
import com.pattern.thai.mvpapplication.R;
import com.pattern.thai.mvpapplication.delegates.DaggerMainComponent;
import com.pattern.thai.mvpapplication.delegates.MainModule;
import static com.jess.arms.utils.Preconditions.checkNotNull;
/**
 *   @Inject在初始化的過程中,經過inject建造過程之後
 *   @Inject:inject();之後就可以透過已經標示@Inject的物件拿到實例
 */
/**
 * Created by ggttoo44 on 2017/5/9.
 */

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {


    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        DaggerMainComponent
                .builder()
                .appComponent(appComponent)
                //請將MainModule()第一個首字母改為小寫
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
        onBackPressed();
    }

    @Override
    public int initView() {
        return R.layout.activity_main;
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