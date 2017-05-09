package com.pattern.thai.mvpapplication.defines;

import android.os.Environment;

/**
 * Created by ggttoo44 on 2017/5/8.
 */

public interface DefineCode {

    interface EventBusTags {

    }

    interface Utils{
        String APPLICATION_ID = "tw.com.gama.ml.agent";
    }

    interface SPCodes{
        String SP_TAG_DEFINE = "SP_TAG_DEFINE";
        String SP_CLIENT_IMIE = "SP_CLIENT_IMIE";
    }

    interface FileDirectorys{
        String PHOTOROOT = Environment.getExternalStorageDirectory().toString() + "/image";
    }

    interface FlagFragments{
    }

    interface FlagActivitys{
    }

    interface NotificationReceivers{
    }

    interface BudleCodes{
    }

    interface ActionEventKeys{
    }

    interface ResultCodes{
    }
}
