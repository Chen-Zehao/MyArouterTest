package com.scnu.libbase;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;

import androidx.annotation.Nullable;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by ChenZehao
 * on 2019/12/19
 */
public abstract class BaseActivity extends Activity {
    /**
     * 上下文对象
     */
    protected Context mContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        //加载布局
        setContentView(getLayoutId());
        //注册butterknife
        ButterKnife.bind(this);
        initLayoutParams();
        initData();
    }

    protected abstract void initLayoutParams();


    /**
     * 获取当前layouty的布局ID,用于设置当前布局
     * 交由子类实现
     * @return
     */
    protected abstract int getLayoutId();

    /**
     * 初始化数据
     * 子类可以复写此方法初始化子类数据
     */
    protected abstract void initData();

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
