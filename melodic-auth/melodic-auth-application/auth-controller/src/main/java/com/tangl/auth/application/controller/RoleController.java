package com.tangl.auth.application.controller;

import com.google.common.base.Preconditions;
import com.tangl.auth.application.converter.AuthPermissionDTOConverter;
import com.tangl.auth.application.converter.AuthRoleDTOConverter;
import com.tangl.auth.application.dto.AuthPermissionDTO;
import com.tangl.auth.application.dto.AuthRoleDTO;
import com.tangl.auth.common.response.R;
import com.tangl.auth.domain.entity.AuthPermissionBO;
import com.tangl.auth.domain.entity.AuthRoleBO;
import com.tangl.auth.domain.service.AuthPermissionDomainService;
import com.tangl.auth.domain.service.AuthRoleDomainService;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Resource
    private AuthRoleDomainService roleDomainService;

    @Resource
    private AuthRoleDTOConverter roleDTOConverter;

    @PostMapping("/add")
    public R<?> add(@RequestBody AuthRoleDTO roleDTO) {
        Preconditions.checkArgument(!StringUtils.isBlank(roleDTO.getRoleName()), "角色名称不能为空");
        Preconditions.checkArgument(!StringUtils.isBlank(roleDTO.getRoleKey()), "角色标识不能为空");

        AuthRoleBO permissionBO = roleDTOConverter.roleDTO2RoleBO(roleDTO);
        roleDomainService.add(permissionBO);
        return R.success();
    }

    @PutMapping("/update")
    public R<?> update(@RequestBody AuthRoleDTO roleDTO) {
        Preconditions.checkNotNull(roleDTO.getId(), "角色ID不能为空");

        AuthRoleBO permissionBO = roleDTOConverter.roleDTO2RoleBO(roleDTO);
        roleDomainService.update(permissionBO);
        return R.success();
    }

    @DeleteMapping("/delete")
    public R<?> delete(@RequestBody AuthRoleDTO roleDTO) {
        Preconditions.checkNotNull(roleDTO.getId(), "角色ID不能为空");

        AuthRoleBO permissionBO = roleDTOConverter.roleDTO2RoleBO(roleDTO);
        roleDomainService.delete(permissionBO);
        return R.success();
    }

}
