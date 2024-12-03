package com.tangl.auth.domain.service.impl;

import com.tangl.auth.common.enums.IsDeletedFlagEnum;
import com.tangl.auth.common.exception.MelodicBusinessException;
import com.tangl.auth.domain.converter.AuthPermissionBOConverter;
import com.tangl.auth.domain.entity.AuthPermissionBO;
import com.tangl.auth.domain.service.AuthPermissionDomainService;
import com.tangl.auth.infra.basic.entity.AuthPermission;
import com.tangl.auth.infra.basic.service.AuthPermissionService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class AuthPermissionDomainServiceImpl implements AuthPermissionDomainService {

    @Resource
    private AuthPermissionService permissionService;

    @Resource
    private AuthPermissionBOConverter permissionBOConverter;

    @Override
    public void add(AuthPermissionBO permissionBO) {
        permissionBO.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
        AuthPermission permission = permissionBOConverter.permissionBO2Permission(permissionBO);
        if (!permissionService.save(permission)) {
            throw new MelodicBusinessException("新增权限失败");
        }
    }

    @Override
    public void update(AuthPermissionBO permissionBO) {
        AuthPermission permission = permissionBOConverter.permissionBO2Permission(permissionBO);
        if (!permissionService.updateById(permission)) {
            throw new MelodicBusinessException("更新权限失败");
        }
    }

    @Override
    public void delete(AuthPermissionBO permissionBO) {
        permissionBO.setIsDeleted(IsDeletedFlagEnum.DELETED.getCode());
        AuthPermission permission = permissionBOConverter.permissionBO2Permission(permissionBO);
        if (!permissionService.updateById(permission)) {
            throw new MelodicBusinessException("删除权限失败");
        }
    }
}
