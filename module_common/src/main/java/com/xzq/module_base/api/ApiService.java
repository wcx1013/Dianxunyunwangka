package com.xzq.module_base.api;

import com.xzq.module_base.bean.BannerBean;
import com.xzq.module_base.bean.DeviceDto;
import com.xzq.module_base.bean.LoginDto;
import com.xzq.module_base.bean.RakingDto;
import com.xzq.module_base.bean.SceneDto;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * ApiService
 *
 * @author xzq
 */
public interface ApiService {

    @Multipart
    @POST("/qixing-app/app/upload/uploadImg")
    Observable<NetBean<String>> uploadImg(@Part MultipartBody.Part file);

    @FormUrlEncoded
    @POST("/qixing-app/app/user/login")
    Observable<NetBean<LoginDto>> login(
            @Field("userName") String userName,
            @Field("password") String password
    );

    @GET("/qixing-app/app/goods/goodsList")
    Observable<NetBean<List<DeviceDto>>> getDevices(@Query("token") String token,
                                                    @Query("page") int page,
                                                    @Query("limit") int limit
    );

    @GET("/qixing-app/app/goods/goodsList")
    Observable<NetBean<List<SceneDto>>> getSceneList(@Query("token") String token,
                                                     @Query("page") int page,
                                                     @Query("limit") int limit
    );

    @GET("/qixing-app/app/goods/goodsList")
    Observable<NetBean<List<RakingDto>>> getRakingGlobal(@Query("token") String token,
                                                         @Query("page") int page,
                                                         @Query("limit") int limit
    );

    @GET("/qixing-app/app/goods/goodsList")
    Observable<NetBean<List<RakingDto>>> getRakingMySelf(@Query("token") String token,
                                                         @Query("page") int page,
                                                         @Query("limit") int limit
    );

    @GET("cloud/android/index/index/banner?portType=3")
    Observable<NetBean<BannerBean>> getbannerImage(
            @Query("token") String token,
            @Query("portType") int portType);
}
