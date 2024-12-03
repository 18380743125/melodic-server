package com.tangl.auth.domain.service;

import com.tangl.auth.domain.entity.AuthRoleBO;

public interface AuthRoleDomainService {

    /**
     * 新增角色
     */
    void add(AuthRoleBO roleBO);

    /**
     * 更新角色
     */
    void update(AuthRoleBO roleBO);

    /**
     * 删除角色
     */
    void delete(AuthRoleBO roleBO);
}
