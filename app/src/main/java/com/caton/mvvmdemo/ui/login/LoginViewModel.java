package com.caton.mvvmdemo.ui.login;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.databinding.ObservableField;

/**
 * Created by saisai on 2019/4/22 0022.
 */

public class LoginViewModel extends ViewModel implements LifecycleObserver {

    public ObservableField<String> username = new ObservableField<>();
    public ObservableField<String> password = new ObservableField<>();

    public LoginViewModel(){

    }

}
