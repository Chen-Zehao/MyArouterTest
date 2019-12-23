package com.scnu.main;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.scnu.libbase.BaseActivity;
import com.scnu.util.Constance;

/**
 * Created by ChenZehao
 * on 2019/12/20
 */
@Route(path = Constance.ACTIVITY_URL_MAIN)
public class MainActivity extends BaseActivity {
    @Override
    protected void initLayoutParams() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.main_activity;
    }

    @Override
    protected void initData() {

    }

}
