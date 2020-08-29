package com.yd.dengteng.main.login;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.gyf.immersionbar.ImmersionBar;
import com.xzq.module_base.base.BasePresenterActivity;
import com.yd.dengteng.R;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
public class BindphonenumberActivity extends BasePresenterActivity {
    @BindView(R.id.fanhui)
    Toolbar fanhui;
    @BindView(R.id.bind)
    TextView bind;
    @BindView(R.id.login_phone)
    ImageView loginPhone;
    @BindView(R.id.shojihao)
    EditText shojihao;
    @BindView(R.id.login_securitycode)
    ImageView loginSecuritycode;
    @BindView(R.id.code)
    EditText code;
    @BindView(R.id.verificationcode)
    ImageView verificationcode;
    @BindView(R.id.code2)
    EditText code2;
    @BindView(R.id.code3)
    TextView code3;
    @BindView(R.id.code4)
    TextView code4;
    @BindView(R.id.login_btw)
    Button loginBtw;

    @Override
    protected int getLayoutId() {
        return R.layout.layout_bind_phonenumber;
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {
        hideToolbar();
        ImmersionBar.with(this).fitsSystemWindows(false).init();
        fanhui.setNavigationOnClickListener(v -> {
            onBackClick();
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.fanhui, R.id.bind, R.id.login_phone, R.id.shojihao, R.id.login_securitycode, R.id.code, R.id.verificationcode, R.id.code2, R.id.code3, R.id.code4, R.id.login_btw})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fanhui:
                break;
            case R.id.bind:
                break;
            case R.id.login_phone:
                break;
            case R.id.shojihao:
                break;
            case R.id.login_securitycode:
                break;
            case R.id.code:
                break;
            case R.id.verificationcode:
                break;
            case R.id.code2:
                break;
            case R.id.code3:
                break;
            case R.id.code4:
                break;
            case R.id.login_btw:
                break;
        }
    }
}
