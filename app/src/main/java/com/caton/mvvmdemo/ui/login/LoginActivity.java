package com.caton.mvvmdemo.ui.login;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.caton.mvvmdemo.BR;
import com.caton.mvvmdemo.R;
import com.caton.mvvmdemo.ui.base.BaseActivity;
import com.caton.mvvmdemo.utils.SPUtils;

public class LoginActivity extends BaseActivity<ViewDataBinding, LoginViewModel> {

    @Override
    protected int initContextView(Bundle savedInstanceState) {
        return R.layout.activity_login;
    }

    @Override
    protected LoginViewModel initViewModel() {
        LoginViewModel viewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        return viewModel;
    }

    @Override
    protected int initVariableId() {
        return BR.viewModel;
    }

}
