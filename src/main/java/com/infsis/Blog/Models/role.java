package com.infsis.Blog.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdRole;
    private String nameRole;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;
    public role(){

    }

    public role(Integer idRole, String nameRole) {
        IdRole = idRole;
        this.nameRole = nameRole;
    }

    public Integer getIdRole() {
        return IdRole;
    }

    public void setIdRole(Integer idRole) {
        IdRole = idRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }
}
