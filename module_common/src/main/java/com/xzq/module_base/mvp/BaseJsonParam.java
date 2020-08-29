package com.xzq.module_base.mvp;


import com.xzq.module_base.bean.DeleteCartBean;
import com.xzq.module_base.bean.EvaluatesBean;
import com.xzq.module_base.bean.SettleCartBean;
import com.xzq.module_base.utils.EntitySerializerUtils;

import java.util.List;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * BaseJsonParam
 * Created by xzq on 2020/7/20.
 */
public class BaseJsonParam {

//    public List<Integer> cartIds = new ArrayList<>();

    //    public static RequestBody getCartIds(int[] ints) {
//
//        BaseJsonParam param = new BaseJsonParam();
//        for (int i = 0; i < ints.length; i++) {
//            param.cartIds.add(ints[i]);
//        }
//        List<Integer> cartIds = new ArrayList<>();
////        String str = EntitySerializerUtils.serializerEntity(param);
//        String str = EntitySerializerUtils.serializerList(cartIds);
//        return RequestBody.create(MediaType.parse("application/json"), str);
//    }
    public static RequestBody getCartIds(DeleteCartBean cartIds) {

        String str = EntitySerializerUtils.serializerEntity(cartIds);
        return RequestBody.create(MediaType.parse("application/json"), str);
    }

    public static RequestBody getEvaluate(List<EvaluatesBean.EvaluateBean> evaluates) {

        String str = EntitySerializerUtils.serializerList(evaluates);
//        String str = EntitySerializerUtils.serializerEntity(evaluates);
        return RequestBody.create(MediaType.parse("application/json"), str);
    }

    public static RequestBody getSettles(SettleCartBean cartIds) {

        String str = EntitySerializerUtils.serializerEntity(cartIds);
        return RequestBody.create(MediaType.parse("application/json"), str);
    }


    public RequestBody create() {
        return create(EntitySerializerUtils.serializerEntity(this));
    }

    public static RequestBody create(String json) {
        return RequestBody.create(MediaType.parse("application/json"), json);
    }
}
