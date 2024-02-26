package com.infsis.Blog.DTOs;

public class RoleDTO {
    private Integer idRolDTO;
    private String nameRoleDTO;

    public RoleDTO(Integer idRolDTO, String nameRoleDTO) {
        this.idRolDTO = idRolDTO;
        this.nameRoleDTO = nameRoleDTO;
    }

    public Integer getIdRolDTO() {
        return idRolDTO;
    }

    public void setIdRolDTO(Integer idRolDTO) {
        this.idRolDTO = idRolDTO;
    }

    public String getNameRoleDTO() {
        return nameRoleDTO;
    }

    public void setNameRoleDTO(String nameRoleDTO) {
        this.nameRoleDTO = nameRoleDTO;
    }
}
