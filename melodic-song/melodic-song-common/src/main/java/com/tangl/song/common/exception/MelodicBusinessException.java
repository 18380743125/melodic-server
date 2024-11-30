package com.tangl.song.common.exception;

import com.tangl.song.common.response.ResponseCode;
import lombok.Getter;

import java.io.Serial;

/**
 * 自定义全局业务异常类
 */
@Getter
public class MelodicBusinessException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 6832569299652219812L;

    /**
     * 错误码
     */
    private final Integer code;

    /**
     * 错误信息
     */
    private final String message;

    public MelodicBusinessException(ResponseCode responseCode) {
        this.code = responseCode.getCode();
        this.message = responseCode.getDesc();
    }

    public MelodicBusinessException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public MelodicBusinessException(String message) {
        this.code = ResponseCode.ERROR_PARAM.getCode();
        this.message = message;
    }

    public MelodicBusinessException() {
        this.code = ResponseCode.ERROR_PARAM.getCode();
        this.message = ResponseCode.ERROR_PARAM.getDesc();
    }

}
