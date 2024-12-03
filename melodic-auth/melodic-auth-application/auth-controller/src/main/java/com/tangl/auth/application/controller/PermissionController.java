package com.tangl.auth.application.controller;

import com.google.common.base.Preconditions;
import com.tangl.auth.application.converter.AuthPermissionDTOConverter;
import com.tangl.auth.application.dto.AuthPermissionDTO;
import com.tangl.auth.common.response.R;
import com.tangl.auth.domain.entity.AuthPermissionBO;
import com.tangl.auth.domain.service.AuthPermissionDomainService;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/permission")
public class PermissionController {

    @Resource
    private AuthPermissionDomainService permissionDomainService;

    @Resource
    private AuthPermissionDTOConverter permissionDTOConverter;

    @PostMapping("/add")
    public R<?> add(@RequestBody AuthPermissionDTO permissionDTO) {
        Preconditions.checkArgument(!StringUtils.isBlank(permissionDTO.getName()), "权限名称不能为空");

        AuthPermissionBO permissionBO = permissionDTOConverter.permissionDTO2PermissionBO(permissionDTO);
        permissionDomainService.add(permissionBO);
        return R.success();
    }

    @PutMapping("/update")
    public R<?> update(@RequestBody AuthPermissionDTO permissionDTO) {
        Preconditions.checkNotNull(permissionDTO.getId(), "权限ID不能为空");

        AuthPermissionBO permissionBO = permissionDTOConverter.permissionDTO2PermissionBO(permissionDTO);
        permissionDomainService.update(permissionBO);
        return R.success();
    }

    @DeleteMapping("/delete")
    public R<?> delete(@RequestBody AuthPermissionDTO permissionDTO) {
        Preconditions.checkNotNull(permissionDTO.getId(), "权限ID不能为空");

        AuthPermissionBO permissionBO = permissionDTOConverter.permissionDTO2PermissionBO(permissionDTO);
        permissionDomainService.delete(permissionBO);
        return R.success();
    }

}
