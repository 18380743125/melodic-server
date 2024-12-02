package com.tangl.auth.application.exception;

import com.tangl.auth.common.exception.MelodicBusinessException;
import com.tangl.auth.common.response.R;
import com.tangl.auth.common.response.ResponseCode;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */
@RestControllerAdvice
public class WebExceptionHandler {
    @ExceptionHandler(value = MelodicBusinessException.class)
    public R<?> businessExceptionHandler(MelodicBusinessException e) {
        return R.fail(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R<?> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        ObjectError objectError = e.getBindingResult().getAllErrors().stream().findFirst().get();
        return R.fail(ResponseCode.ERROR_PARAM.getCode(), objectError.getDefaultMessage());
    }

    @ExceptionHandler(value = ConstraintViolationException.class)
    public R<Object> constraintDeclarationExceptionHandler(ConstraintViolationException e) {
        ConstraintViolation<?> constraintViolation = e.getConstraintViolations().stream().findFirst().get();
        return R.fail(constraintViolation.getMessage());
    }

    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    public R<?> missingServletRequestParameterExceptionHandler(MissingServletRequestParameterException e) {
        return R.fail(ResponseCode.ERROR_PARAM);
    }

    @ExceptionHandler(value = IllegalStateException.class)
    public R<?> illegalStateExceptionHandler(IllegalStateException e) {
        return R.fail(ResponseCode.ERROR_PARAM);
    }

    @ExceptionHandler(value = BindException.class)
    public R<?> bindExceptionHandler(BindException e) {
        FieldError fieldError = e.getBindingResult().getFieldErrors().stream().findFirst().get();
        return R.fail(ResponseCode.ERROR_PARAM.getCode(), fieldError.getDefaultMessage());
    }

    @ExceptionHandler(value = RuntimeException.class)
    public R<?> runtimeExceptionHandler(RuntimeException e) {
        return R.fail(ResponseCode.ERROR.getCode(), e.getMessage());
    }
}
