package com.tangl.oss.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 文件类
 */
@Setter
@Getter
public class FileInfo {

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 是否是文件夹
     */
    private Boolean directoryFlag;

    /**
     * etag
     */
    private String etag;

}
