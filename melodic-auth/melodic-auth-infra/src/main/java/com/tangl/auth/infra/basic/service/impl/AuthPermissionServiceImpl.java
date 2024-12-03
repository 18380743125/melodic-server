package com.tangl.auth.infra.basic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangl.auth.infra.basic.entity.AuthPermission;
import com.tangl.auth.infra.basic.service.AuthPermissionService;
import com.tangl.auth.infra.basic.mapper.AuthPermissionMapper;
import org.springframework.stereotype.Service;

/**
 * 角色权限表(AuthPermission)表服务实现类
 */
@Service
public class AuthPermissionServiceImpl extends ServiceImpl<AuthPermissionMapper, AuthPermission>
    implements AuthPermissionService{

}
