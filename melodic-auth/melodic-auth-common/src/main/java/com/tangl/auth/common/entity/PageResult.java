package com.tangl.auth.common.entity;

import lombok.Data;

import java.util.Collections;
import java.util.List;

/**
 * 分页返回实体
 */
@Data
public class PageResult<T> {

    private Integer pageNo = 1;

    private Integer pageSize = 20;

    private Integer total = 0;

    private Integer totalPages = 0;

    private List<T> result = Collections.emptyList();

    private Integer start = 1;

    private Integer end = 0;

    public void setRecords(List<T> result) {
        this.result = result;
        if (result != null && !result.isEmpty()) {
            setTotal(result.size());
        }
    }

    public void setTotal(int totalCount) {
        this.total = totalCount;
        if (this.pageSize > 0) {
            this.totalPages = (totalCount / this.pageSize) + (totalCount % this.pageSize == 0 ? 0 : 1);
        } else {
            this.totalPages = 0;
        }
        this.start = (this.pageSize > 0 ? (this.pageNo - 1) * this.pageSize : 0) + 1;
        this.end = this.start - 1 + this.pageSize * (this.pageNo > 0 ? 1 : 0);
    }
}
