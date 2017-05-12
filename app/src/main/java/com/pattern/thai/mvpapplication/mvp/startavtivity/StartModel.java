package com.pattern.thai.mvpapplication.mvp.startavtivity;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import static com.jess.arms.utils.Preconditions.checkNotNull;
import com.jess.arms.di.scope.ActivityScope;
import com.pattern.thai.mvpapplication.mvp.startavtivity.StartContract;
import javax.inject.Inject;

/**
 *   Model實現
 *
 *   @Inject注入分成三種:
 *   1.建構子注入:直接在建構子上做注入的動作可以多個依賴一起建置完成,可惜對Activity無法使用這個方式(Fragment可用)
 *   2.參數注入:多個@Inject注入,但是他需要被inject手動調用(Activity,Fragment可以用這個方式取得多個注入依賴)
 *   3.方法注入:可以利用在方法上加@Inject來注入依賴的實例
 *   Model採用3.方法注入來取得Gson跟Application這兩個實例
 */
/**
 * Model的實現
 * Created by ggttoo44 on 2017/5/9.
 */

@ActivityScope
public class StartModel extends BaseModel implements StartContract.Model {
    private Gson mGson;
    private Application mApplication;

    @Inject
    public StartModel(IRepositoryManager repositoryManager, Gson gson, Application application) {
        super(repositoryManager);
        this.mGson = gson;
        this.mApplication = application;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

}