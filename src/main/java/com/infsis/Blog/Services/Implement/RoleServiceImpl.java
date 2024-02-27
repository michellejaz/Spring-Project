package com.infsis.Blog.Services.Implement;

import com.infsis.Blog.DTOs.RoleDTO;
import com.infsis.Blog.Models.role;
import com.infsis.Blog.Services.RolService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RolService {
    @Override
    public Optional<RoleDTO> getRoleById(Integer idRole){
        return Optional.empty();
    }
    @Override
    public RoleDTO saveRole(RoleDTO roleDTO){
        return null;
    }
    @Override
    public RoleDTO updateRole(Integer idRole, RoleDTO roleDTO){
        return null;
    }
    @Override
    public void deleteRole(Integer idRole){

    }
    private RoleDTO roletoDto(role role){
        RoleDTO roleDTO= new RoleDTO(
                role.getIdRole(),
                role.getNameRole()

        );
        return roleDTO;
    }
    private role DtoToRole(RoleDTO roleDTO) {
        role role = new role();
        role.setNameRole(roleDTO.getNameRoleDTO());

        return role;
    }
}
