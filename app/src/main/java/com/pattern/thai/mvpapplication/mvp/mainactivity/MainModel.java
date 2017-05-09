package com.pattern.thai.mvpapplication.mvp.mainactivity;

import android.app.Application;
import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;
import static com.jess.arms.utils.Preconditions.checkNotNull;
import com.jess.arms.di.scope.ActivityScope;
import javax.inject.Inject;

/**
 * Created by ggttoo44 on 2017/5/9.
 */

@ActivityScope
public class MainModel extends BaseModel implements MainContract.Model {
    private Gson mGson;
    private Application mApplication;

    @Inject
    public MainModel(IRepositoryManager repositoryManager, Gson gson, Application application) {
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