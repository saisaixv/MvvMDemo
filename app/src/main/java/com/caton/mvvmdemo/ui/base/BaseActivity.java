package com.caton.mvvmdemo.ui.base;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.ViewModel;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.caton.mvvmdemo.BR;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by saisai on 2019/4/22 0022.
 */

public abstract class BaseActivity<V extends ViewDataBinding, VM extends ViewModel & LifecycleObserver> extends AppCompatActivity {

    private int viewModelId;
    private VM viewModel;
    private ViewDataBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        //页面接受的参数方法
        initParam();
        //私有的初始化Databinding和ViewModel方法
        initViewDataBinding(savedInstanceState);

        //页面数据初始化
        initData();
        //页面事件监听的方法，一般用于ViewModel层转到View层的事件注册
    }

    protected void initViewDataBinding(Bundle savedInstanceState) {
        //DtaBindingUtil类需要在project的build中配置 dataBinding {enabled true},同步后会自动关联android.Databinding包
        binding = DataBindingUtil.setContentView(this, initContextView(savedInstanceState));
        viewModelId = initVariableId();

        viewModel = initViewModel();
        if(viewModel!=null){

        }

        //关联ViewModel
        binding.setVariable(viewModelId,viewModel);
        //让ViewModel拥有View的生命周期感应
        getLifecycle().addObserver(viewModel);
        //注入RxLifecycle生命周期

    }

    protected void initParam(){}

    protected abstract int initContextView(Bundle savedInstanceState);

    protected abstract int initVariableId();


    protected abstract VM initViewModel();

    protected void initData(){}
}
