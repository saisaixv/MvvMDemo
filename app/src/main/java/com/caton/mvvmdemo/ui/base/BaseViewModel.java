package com.caton.mvvmdemo.ui.base;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

/**
 * Created by saisai on 2019/4/22 0022.
 */

public class BaseViewModel extends AndroidViewModel {
    public BaseViewModel(@NonNull Application application) {
        super(application);
    }
}
