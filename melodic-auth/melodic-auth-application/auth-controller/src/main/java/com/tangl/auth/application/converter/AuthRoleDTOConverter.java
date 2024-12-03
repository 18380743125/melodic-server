package com.tangl.auth.application.converter;

import com.tangl.auth.application.dto.AuthRoleDTO;
import com.tangl.auth.domain.entity.AuthPermissionBO;
import com.tangl.auth.domain.entity.AuthRoleBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthRoleDTOConverter {

    AuthRoleBO roleDTO2RoleBO(AuthRoleDTO roleDTO);

}
