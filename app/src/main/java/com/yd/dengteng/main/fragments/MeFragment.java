package com.yd.dengteng.main.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.xzq.module_base.base.BasePresenterFragment;
import com.xzq.module_base.views.DrawableTextView;
import com.yd.dengteng.R;
import com.yd.dengteng.main.login.LoginActivity;
import com.yd.dengteng.main.ui.AboutusActivity;
import com.yd.dengteng.main.ui.FeedbackActivity;
import com.yd.dengteng.main.ui.MessagecenterActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * MeFragment
 * Created by xzq on 2020/8/4.
 */
public class MeFragment extends BasePresenterFragment {


    @BindView(R.id.tu)
    ImageView tu;
    @BindView(R.id.touxiang)
    ImageView touxiang;
    @BindView(R.id.shichang)
    ImageView shichang;
    @BindView(R.id.mianfeishichang)
    TextView mianfeishichang;
    @BindView(R.id.weixinhao)
    ImageView weixinhao;
    @BindView(R.id.weixin)
    TextView weixin;
    @BindView(R.id.bangding)
    TextView bangding;
    @BindView(R.id.newss)
    DrawableTextView newss;
    @BindView(R.id.mesage)
    ImageView mesage;
    @BindView(R.id.viewone)
    View viewone;
    @BindView(R.id.opinions)
    DrawableTextView opinions;
    @BindView(R.id.fankui)
    ImageView fankui;
    @BindView(R.id.viewtwo)
    View viewtwo;
    @BindView(R.id.abouts)
    DrawableTextView abouts;
    @BindView(R.id.aboutme)
    ImageView aboutme;
    @BindView(R.id.viewthree)
    View viewthree;
    @BindView(R.id.tuichu)
    Button tuichu;
    private PopupWindow popupWindow;

    @Override
    protected void loadData() {

    }

    @Override
    protected int getLayoutId(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return R.layout.fragment_me;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {

    }


    private void Popupwindow() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.layout_launchreminder, null);
        View redio1 = view.findViewById(R.id.redio1);
        View redio2 = view.findViewById(R.id.redio2);
        popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);
        popupWindow.setTouchable(true);
        //  popupWindow.setAnimationStyle(R.style.lala);
        popupWindow.setOutsideTouchable(true);
        popupWindow.showAtLocation(fankui, Gravity.CENTER, 0, 0);
        redio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });
        redio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
    }


    @OnClick({R.id.tu, R.id.touxiang, R.id.shichang, R.id.mianfeishichang, R.id.weixinhao, R.id.weixin, R.id.bangding, R.id.newss, R.id.mesage, R.id.viewone, R.id.opinions, R.id.fankui, R.id.viewtwo, R.id.abouts, R.id.aboutme, R.id.viewthree, R.id.tuichu})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tu:
                break;
            case R.id.touxiang:
                break;
            case R.id.shichang:
                break;
            case R.id.mianfeishichang:
                break;
            case R.id.weixinhao:
                break;
            case R.id.weixin:
                break;
            case R.id.bangding:
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);

                break;
            case R.id.newss:
                Intent intent1 = new Intent(getActivity(), MessagecenterActivity.class);
                startActivity(intent1);
                break;
            case R.id.mesage:
                break;
            case R.id.viewone:
                break;
            case R.id.opinions:
                Intent intent2 = new Intent(getActivity(), FeedbackActivity.class);
                startActivity(intent2);
                break;
            case R.id.fankui:
                break;
            case R.id.viewtwo:
                break;
            case R.id.abouts:
                Intent intent3 = new Intent(getActivity(), AboutusActivity.class);
                startActivity(intent3);

                break;
            case R.id.aboutme:
                break;
            case R.id.viewthree:
                break;
            case R.id.tuichu:
             Popupwindow();
                break;
        }
    }
}
