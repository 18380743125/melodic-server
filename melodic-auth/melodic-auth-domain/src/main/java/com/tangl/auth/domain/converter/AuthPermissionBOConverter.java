package com.tangl.auth.domain.converter;

import com.tangl.auth.domain.entity.AuthPermissionBO;
import com.tangl.auth.infra.basic.entity.AuthPermission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthPermissionBOConverter {

    AuthPermission permissionBO2Permission(AuthPermissionBO permissionBO);

}
