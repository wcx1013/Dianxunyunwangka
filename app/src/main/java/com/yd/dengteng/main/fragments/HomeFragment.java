package com.yd.dengteng.main.fragments;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;

import com.bumptech.glide.Glide;
import com.xzq.module_base.User;
import com.xzq.module_base.base.BasePresenterFragment;
import com.xzq.module_base.bean.BannerBean;
import com.xzq.module_base.mvp.MvpContract;
import com.xzq.module_base.mvp.MvpContract.BannerView;
import com.xzq.module_base.utils.MyToast;
import com.xzq.module_base.views.DrawableTextView;
import com.yd.dengteng.R;
import com.yd.dengteng.main.login.LoginActivity;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import am.widget.shapeimageview.BuildConfig;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;

/**
 * HomeFragment
 * Created by xzq on 2020/8/4.
 */
public class HomeFragment extends BasePresenterFragment<MvpContract.CommonPresenter> implements BannerView,View.OnTouchListener {

    @BindView(R.id.banner)
    Banner banner;
    @BindView(R.id.cpu)
    DrawableTextView cpu;
    @BindView(R.id.xianka)
    DrawableTextView xianka;
    @BindView(R.id.neicui)
    DrawableTextView neicui;
    @BindView(R.id.peizhi)
    ConstraintLayout peizhi;
    @BindView(R.id.time)
    DrawableTextView time;
    @BindView(R.id.kefu)
    DrawableTextView kefu;
    @BindView(R.id.qq_qun)
    DrawableTextView qqQun;
    @BindView(R.id.gongzhonghao)
    DrawableTextView gongzhonghao;
    @BindView(R.id.competr_adress)
    DrawableTextView competrAdress;
    @BindView(R.id.paidui)
    ImageView paidui;
    @BindView(R.id.shangji)
    DrawableTextView shangji;
    private PopupWindow popupWindow;
    private ArrayList<Integer> bannerlist;
    private int sx;
    private int sy;
    private SharedPreferences sp;
    private View redio2;
    private View redio1;

    @Override
    protected void loadData() {
        presenter.getBannerlist(User.getToken(),3);
    }

    @Override
    protected int getLayoutId(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return R.layout.fragment_home;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
       paidui.setVisibility(View.VISIBLE);
        Banners();
        sp = getActivity().getSharedPreferences("config", Context.MODE_PRIVATE);
        paidui.setOnTouchListener(this);
    }

    private void Banners() {
        bannerlist = new ArrayList<>();
        bannerlist.add(R.mipmap.rb);
        bannerlist.add(R.mipmap.rb2);
        bannerlist.add(R.mipmap.rb3);
        banner.setImages(bannerlist).setImageLoader(new Glige()).start();
    }

    @Override
    public void onGetBannerSucceed(List<BannerBean> list) {

    }

    class Glige extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context).load(path).into(imageView);
        }
    }

    @OnClick({R.id.banner, R.id.cpu, R.id.xianka, R.id.neicui, R.id.peizhi, R.id.time, R.id.kefu, R.id.qq_qun, R.id.gongzhonghao, R.id.competr_adress, R.id.paidui, R.id.shangji})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.banner:
                break;
            case R.id.cpu:
                break;
            case R.id.xianka:
                break;
            case R.id.neicui:
                break;
            case R.id.peizhi:
                break;
            case R.id.time:
                break;
            case R.id.kefu:
                break;
            case R.id.qq_qun:
                break;
            case R.id.gongzhonghao:
                break;
            case R.id.competr_adress:
                break;
            case R.id.paidui:
            Popupwindow();
            if(redio1.isClickable()){
                MyToast.show("继续排队");
            }else if(redio2.isClickable()) {
                popupWindow.dismiss();
               paidui.setVisibility(View.VISIBLE);
            }
                break;
            case R.id.shangji:
                Popupwindow();
                break;
        }

    }


    private void Popupwindow() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.layout_queuereminder, null);
        redio1 = view.findViewById(R.id.redio1);
        redio2 = view.findViewById(R.id.redio2);
        popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT,true);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.showAtLocation(kefu, Gravity.CENTER, 0, 0);
        redio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sdk = android.os.Build.VERSION.SDK; // SDK号
                String model = android.os.Build.MODEL; // 手机型号
                String release = android.os.Build.VERSION.RELEASE; // android系统版本号
                String brand = Build.BRAND;//手机厂商
                if (TextUtils.equals(brand.toLowerCase(), "redmi") || TextUtils.equals(brand.toLowerCase(), "xiaomi")) {
                    gotoMiuiPermission();//小米
                } else if (TextUtils.equals(brand.toLowerCase(), "meizu")) {
                    gotoMeizuPermission();
                } else if (TextUtils.equals(brand.toLowerCase(), "huawei") || TextUtils.equals(brand.toLowerCase(), "honor")) {
                    gotoHuaweiPermission();
                } else {
                    startActivity(getAppDetailSettingIntent());
                }
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

    /**
     * 跳转到miui的权限管理页面
     */
    private void gotoMiuiPermission() {
        try { // MIUI 8
            Intent localIntent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            localIntent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
            localIntent.putExtra("extra_pkgname", getActivity().getPackageName());
            getActivity().startActivity(localIntent);
        } catch (Exception e) {
            try { // MIUI 5/6/7
                Intent localIntent = new Intent("miui.intent.action.APP_PERM_EDITOR");
                localIntent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
                localIntent.putExtra("extra_pkgname", getActivity().getPackageName());
                getActivity().startActivity(localIntent);
            } catch (Exception e1) { // 否则跳转到应用详情
                startActivity(getAppDetailSettingIntent());
            }
        }
    }

    /**
     * 跳转到魅族的权限管理系统
     */
    private void gotoMeizuPermission() {
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.addCategory(Intent.CATEGORY_DEFAULT);
            intent.putExtra("packageName", BuildConfig.APPLICATION_ID);
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            startActivity(getAppDetailSettingIntent());
        }
    }

    /**
     * 华为的权限管理页面
     */
    private void gotoHuaweiPermission() {
        try {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            ComponentName comp = new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity");//华为权限管理
            intent.setComponent(comp);
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            startActivity(getAppDetailSettingIntent());
        }

    }

    /**
     * 获取应用详情页面intent（如果找不到要跳转的界面，也可以先把用户引导到系统设置页面）
     *
     * @return
     */
    private Intent getAppDetailSettingIntent() {
        Intent localIntent = new Intent();
        localIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        if (Build.VERSION.SDK_INT >= 9) {
            localIntent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            localIntent.setData(Uri.fromParts("package", getActivity().getPackageName(), null));
        } else if (Build.VERSION.SDK_INT <= 8) {
            localIntent.setAction(Intent.ACTION_VIEW);
            localIntent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
            localIntent.putExtra("com.android.settings.ApplicationPkgName", getActivity().getPackageName());
        }
        return localIntent;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId()) {
            // 如果手指放在imageView上拖动
            case R.id.paidui:
                // event.getRawX(); //获取手指第一次接触屏幕在x方向的坐标
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:// 获取手指第一次接触屏幕
                        sx = (int) event.getRawX();
                        sy = (int) event.getRawY();
                        paidui.setImageResource(R.drawable.icon_suspension);
                        break;
                    case MotionEvent.ACTION_MOVE:// 手指在屏幕上移动对应的事件
                        int x = (int) event.getRawX();
                        int y = (int) event.getRawY();
                        // 获取手指移动的距离
                        int dx = x - sx;
                        int dy = y - sy;
                        // 得到imageView最开始的各顶点的坐标
                        int l = paidui.getLeft();
                        int r = paidui.getRight();
                        int t = paidui.getTop();
                        int b = paidui.getBottom();
                        // 更改imageView在窗体的位置
                        paidui.layout(l + dx, t + dy, r + dx, b + dy);
                        // 获取移动后的位置
                        sx = (int) event.getRawX();
                        sy = (int) event.getRawY();
                        break;
                    case MotionEvent.ACTION_UP:// 手指离开屏幕对应事件
                        // 记录最后图片在窗体的位置
                        int lasty = paidui.getTop();
                        int lastx = paidui.getLeft();
                        paidui.setImageResource(R.drawable.icon_suspension);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putInt("lasty", lasty);
                        editor.putInt("lastx", lastx);
                        editor.commit();
                        break;
                }
                break;
        }
        return true;// 不会中断触摸事件的返回
    }

}
