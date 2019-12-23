package com.scnu.login;

import android.os.Bundle;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.scnu.libbase.BaseActivity;
import com.scnu.util.Constance;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@Route(path = Constance.ACTIVITY_URL_LOGIN)
public class LoginActivity extends BaseActivity {

    @BindView(R2.id.bt_login)
    Button btLogin;

    @Override
    protected void initLayoutParams() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.login_activity;
    }

    @Override
    protected void initData() {
    }

    /**
     * Activity跳转，跳转到MainActivity
     */
    @OnClick(R2.id.bt_login)
    void btnLoginClicked() {
        ARouter.getInstance().build(Constance.ACTIVITY_URL_MAIN).navigation();
    }

}
