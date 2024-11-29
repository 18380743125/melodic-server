package com.tangl.song.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 账号状态枚举类
 */
@AllArgsConstructor
@Getter
public enum StatusEnum {

    ENABLE(0, "正常"),

    DISABLE(1, "停用");

    private final Integer code;

    private final String desc;
}
