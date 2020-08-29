package com.xzq.module_base.config;

/**
 * 全局配置
 *
 * @author xzq
 */

public interface Config {
    // 缓存加密密码
    String CACHE_PASSWORD = "\u2605\u2721\u2606\u263C\u00A7\u2603";
    // 缓存加密盐
    String CACHE_SALT = "=?UTF-8?B?OSozajloY2VqbjQmZzI4Mg==?=";

    boolean DBG_STATE = false;

    String BASE_URL = "http://xxx";
}
