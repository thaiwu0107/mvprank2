package com.pattern.thai.mvpapplication.mvp.loginactivity;

import com.jess.arms.mvp.IView;
import com.jess.arms.mvp.IModel;

/**
 * 定義兩邊的接口
 */

/**
 * Created by ggttoo44 on 2017/5/9.
 */

public interface LogInContract {
    //對於經常使用的關於用戶界面的方法可以定義到基本視點中，如顯示隱藏進度條，和顯示文字消息
    interface View extends IView {
    }

    //Model層定義接口，外部只需關心模型返回的數據，無需關心內部細節，及是否使用緩存
    interface Model extends IModel {

    }
}