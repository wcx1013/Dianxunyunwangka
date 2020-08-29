package com.yd.dengteng.main.ui;

import android.os.Build;
import android.os.Bundle;

import com.blankj.utilcode.util.ResourceUtils;
import com.gyf.immersionbar.ImmersionBar;
import com.xzq.module_base.base.BasePresenterActivity;
import com.yd.dengteng.R;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import butterknife.BindView;

public class MessagecenterActivity extends BasePresenterActivity {
    @BindView(R.id.fanhui)
    Toolbar mToolbar;
    @Override
    protected int getLayoutId() {
        return R.layout.layout_message;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {

   hideToolbar();
        ImmersionBar.with(this)
                .fitsSystemWindows(true)
                .statusBarColorInt(ContextCompat.getColor(this, R.color.color_2A2721))
                .statusBarDarkFont(false).init();
        mToolbar.setNavigationOnClickListener(v -> {
            onBackClick();
        });
    }
}
