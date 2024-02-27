package com.infsis.Blog.Services;


import com.infsis.Blog.DTOs.RoleDTO;

import java.util.Optional;

public interface RolService {
    Optional<RoleDTO> getRoleById(Integer idRole);
    RoleDTO saveRole(RoleDTO roleDTO);
    RoleDTO updateRole(Integer idRole, RoleDTO roleDTO);
    void deleteRole(Integer idRole);
}
