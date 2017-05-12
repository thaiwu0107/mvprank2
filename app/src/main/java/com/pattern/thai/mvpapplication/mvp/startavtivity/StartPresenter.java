package com.pattern.thai.mvpapplication.mvp.startavtivity;

import android.app.Application;
import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.widget.imageloader.ImageLoader;
import com.pattern.thai.mvpapplication.mvp.startavtivity.StartContract;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import javax.inject.Inject;

/**
 *   Presenter實現
 *
 *   @Inject注入分成三種:
 *   1.建構子注入:直接在建構子上做注入的動作可以多個依賴一起建置完成,可惜對Activity無法使用這個方式(Fragment可用)
 *   2.參數注入:多個@Inject注入,但是他需要被inject手動調用(Activity,Fragment可以用這個方式取得多個注入依賴)
 *   3.方法注入:可以利用在方法上加@Inject來注入依賴的實例
 *   Presenter採用1.建構子注入一次取得需要用到的實例
 *
 */
/**
 * Presenter的實現
 * Created by ggttoo44 on 2017/5/9.
 */

@ActivityScope
public class StartPresenter extends BasePresenter<StartContract.Model,StartContract.View> {
    private RxErrorHandler mErrorHandler;
    private Application mApplication;
    private ImageLoader mImageLoader;
    private AppManager mAppManager;

    @Inject
    public StartPresenter(StartContract.Model model, StartContract.View rootView
            , RxErrorHandler handler, Application application
            , ImageLoader imageLoader, AppManager appManager) {
        super(model, rootView);
        this.mErrorHandler = handler;
        this.mApplication = application;
        this.mImageLoader = imageLoader;
        this.mAppManager = appManager;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
    }

}