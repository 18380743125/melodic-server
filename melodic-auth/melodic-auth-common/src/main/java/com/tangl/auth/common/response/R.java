package com.tangl.auth.common.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/**
 * 公用响应类
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class R<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 7013995255753090605L;

    /**
     * 状态码
     */
    private final Integer code;

    /**
     * 状态说明文案
     */
    private String message;

    /**
     * 数据体
     */
    private T data;

    private R(Integer code) {
        this.code = code;
    }

    private R(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private R(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    @JsonIgnore
    @JSONField(serialize = false)
    public boolean isSuccess() {
        return Objects.equals(this.code, ResponseCode.SUCCESS.getCode());
    }

    /**
     * 操作成功返回: 默认形式返回(不带数据)
     */
    public static <T> R<T> success() {
        return new R<T>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDesc());
    }

    /**
     * 操作成功返回: 自定义返回描述信息(不带数据)
     */
    public static <T> R<T> success(String message) {
        return new R<>(ResponseCode.SUCCESS.getCode(), message);
    }

    /**
     * 操作成功返回: 默认形式返回(带数据)
     */
    public static <T> R<T> data(T data) {
        return new R<T>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDesc(), data);
    }

    /**
     * 操作成功返回: 自定义返回描述信息(带数据)
     */
    public static <T> R<T> success(String message, T data) {
        return new R<>(ResponseCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 系统内部错误(返回默认描述信息)
     */
    public static <T> R<T> fail() {
        return new R<>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getDesc());
    }

    /**
     * 系统内部错误(返回自定义描述信息)
     */
    public static <T> R<T> fail(String message) {
        return new R<>(ResponseCode.ERROR.getCode(), message);
    }


    public static <T> R<T> fail(Integer code, String message) {
        return new R<T>(code, message);
    }

    /**
     * 未登录
     */
    public static <T> R<T> needLogin() {
        return new R<>(ResponseCode.NEED_LOGIN.getCode(), ResponseCode.NEED_LOGIN.getDesc());
    }

    /**
     * 未登录
     */
    public static <T> R<T> needLogin(String message) {
        return new R<>(ResponseCode.NEED_LOGIN.getCode(), message);
    }

    /**
     * 其他错误(非系统性错误)
     */
    public static <T> R<T> fail(ResponseCode responseCode) {
        return new R<>(responseCode.getCode(), responseCode.getDesc());
    }
}
