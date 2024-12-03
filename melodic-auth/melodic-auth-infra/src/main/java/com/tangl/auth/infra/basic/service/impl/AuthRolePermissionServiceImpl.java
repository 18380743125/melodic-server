package com.tangl.auth.infra.basic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangl.auth.infra.basic.entity.AuthRolePermission;
import com.tangl.auth.infra.basic.service.AuthRolePermissionService;
import com.tangl.auth.infra.basic.mapper.AuthRolePermissionMapper;
import org.springframework.stereotype.Service;

/**
 * 角色权限关联表(AuthRolePermission)表服务实现类
 */
@Service
public class AuthRolePermissionServiceImpl extends ServiceImpl<AuthRolePermissionMapper, AuthRolePermission>
    implements AuthRolePermissionService{

}
