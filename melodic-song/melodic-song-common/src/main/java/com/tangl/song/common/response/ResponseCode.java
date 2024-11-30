package com.tangl.song.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 响应状态枚举类
 */
@AllArgsConstructor
@Getter
public enum ResponseCode {

    /**
     * 成功
     */
    SUCCESS(200, "SUCCESS"),

    /**
     * 错误
     */
    ERROR(1, "ERROR"),

    /**
     * token过期
     */
    TOKEN_EXPIRE(2, "TOKEN_EXPIRE"),

    /**
     * 参数错误
     */
    ERROR_PARAM(3, "ERROR_PARAM"),

    /**
     * 无权限访问
     */
    ACCESS_DENIED(4, "ACCESS_DENIED"),

    /**
     * 需要登录
     */
    NEED_LOGIN(10, "NEED_LOGIN"),

    /**
     * 需要注册
     */
    NEED_REGISTRY(11, "NEED_REGISTRY");

    /**
     * 状态码
     */
    private final Integer code;

    /**
     * 状态描述
     */
    private final String desc;
}
