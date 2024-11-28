package com.tangl.song.common.enums;

import lombok.Getter;

/**
 * 删除标识枚举类
 */
@Getter
public enum IsDeletedFlagEnum {

    DELETED(1, "已删除"),

    UN_DELETED(0, "未删除");

    private final int code;

    private final String desc;

    IsDeletedFlagEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
