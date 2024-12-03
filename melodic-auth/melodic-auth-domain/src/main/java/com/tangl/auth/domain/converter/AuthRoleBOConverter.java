package com.tangl.auth.domain.converter;

import com.tangl.auth.domain.entity.AuthRoleBO;
import com.tangl.auth.infra.basic.entity.AuthRole;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthRoleBOConverter {

    AuthRole roleBO2Role(AuthRoleBO roleBO);

}
