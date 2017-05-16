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
 *
 *
 *   @Inject注入分成三種:
 *   1.建構子注入:直接在建構子上做注入的動作可以多個依賴一起建置完成,可惜對Activity無法使用這個方式(Fragment可用)
 *   2.參數注入:多個@Inject注入,但是他需要被inject手動調用(Activity,Fragment可以用這個方式取得多個注入依賴)
 *   3.方法注入:可以利用在方法上加@Inject來注入依賴的實例
 *   Activity跟Fragment都是採用2.參數注入的方式
 *
 *   類似我們現在使用的這個Activity一次調用了appComponent跟自己本身的${NAME}Module兩個依賴
 *   所以需要手動調用inject來一次注入兩個依賴
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