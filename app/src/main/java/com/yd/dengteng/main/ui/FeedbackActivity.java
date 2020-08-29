package com.yd.dengteng.main.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.gyf.immersionbar.ImmersionBar;
import com.xzq.module_base.base.BasePresenterActivity;
import com.yd.dengteng.R;


import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FeedbackActivity extends BasePresenterActivity {
    @BindView(R.id.fanhui)
    Toolbar fanhui;
    @BindView(R.id.problem)
    TextView problem;
    @BindView(R.id.riqis)
    TextView riqis;
    @BindView(R.id.yijian)
    EditText yijian;
    @BindView(R.id.jiahao)
    ImageView jiahao;
    private PopupWindow popupWindow;

    @Override
    protected int getLayoutId() {
        return R.layout.layout_feedback;
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

    @OnClick({R.id.fanhui, R.id.problem, R.id.riqis, R.id.yijian, R.id.jiahao, R.id.tijiao})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fanhui:
                break;
            case R.id.problem:
                break;
            case R.id.riqis:
                break;
            case R.id.yijian:
                break;
            case R.id.jiahao:
                break;
            case R.id.tijiao:
                Popupwindow();
                break;
        }
    }

    public void Popupwindow() {
        View view = LayoutInflater.from(this).inflate(R.layout.layout_reminder, null);
        View redio1 = view.findViewById(R.id.redio1);
        View redio2 = view.findViewById(R.id.redio2);
        popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT,true);
        popupWindow.setTouchable(true);
        //  popupWindow.setAnimationStyle(R.style.lala);
        popupWindow.setOutsideTouchable(true);
        popupWindow.showAtLocation(jiahao, Gravity.CENTER, 0, 0);
        redio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
        redio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
    }
}
