package com.tangl.auth.domain.service;

import com.tangl.auth.domain.entity.AuthPermissionBO;

public interface AuthPermissionDomainService {

    /**
     * 新增权限
     */
    void add(AuthPermissionBO permissionBO);

    /**
     * 更新权限
     */
    void update(AuthPermissionBO permissionBO);

    /**
     * 删除权限
     */
    void delete(AuthPermissionBO permissionBO);
}
