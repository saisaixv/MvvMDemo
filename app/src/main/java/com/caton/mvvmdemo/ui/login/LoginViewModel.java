package com.caton.mvvmdemo.ui.login;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.content.Context;
import android.databinding.ObservableField;
import android.widget.Toast;

import com.caton.mvvmdemo.app.MyApplication;

/**
 * Created by saisai on 2019/4/22 0022.
 */

public class LoginViewModel extends ViewModel {

    public ObservableField<String> username = new ObservableField<>();
    public ObservableField<String> password = new ObservableField<>();

    public void login() {

        Toast.makeText(MyApplication.app, "login", Toast.LENGTH_SHORT).show();
    }

}
