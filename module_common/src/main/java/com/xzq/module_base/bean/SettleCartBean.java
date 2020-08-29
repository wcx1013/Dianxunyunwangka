package com.xzq.module_base.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * AdDto
 * Created by xzq on 2019/8/22.
 */
public class SettleCartBean implements Parcelable {


    public ArrayList<Integer> cartIds = new ArrayList<>();
    /**
     * addressId : 0
     * cartIds : []
     * isCoupon : 0
     * isJindou : 0
     * receiveId : 0
     * userRemark :
     */

    private int addressId;
    private int isCoupon;
    private int isJindou;
    private int receiveId;
    private String userRemark;

    public SettleCartBean() {
        super();
    }

    protected SettleCartBean(Parcel in) {
        addressId = in.readInt();
        isCoupon = in.readInt();
        isJindou = in.readInt();
        receiveId = in.readInt();
        userRemark = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(addressId);
        dest.writeInt(isCoupon);
        dest.writeInt(isJindou);
        dest.writeInt(receiveId);
        dest.writeString(userRemark);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<SettleCartBean> CREATOR = new Creator<SettleCartBean>() {
        @Override
        public SettleCartBean createFromParcel(Parcel in) {
            return new SettleCartBean(in);
        }

        @Override
        public SettleCartBean[] newArray(int size) {
            return new SettleCartBean[size];
        }
    };

    public List<Integer> getCartIds() {
        return cartIds;
    }

    public void setCartIds(ArrayList<Integer> cartIds) {
        this.cartIds = cartIds;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getIsCoupon() {
        return isCoupon;
    }

    public void setIsCoupon(int isCoupon) {
        this.isCoupon = isCoupon;
    }

    public int getIsJindou() {
        return isJindou;
    }

    public void setIsJindou(int isJindou) {
        this.isJindou = isJindou;
    }

    public int getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(int receiveId) {
        this.receiveId = receiveId;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

}
