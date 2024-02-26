package com.infsis.Blog.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdRole;
    private String name;
    @Id
    @ManyToMany(mappedBy = "roles")
    private List<User> users;
    public role(){

    }
    public role(Integer idRole, String name) {
        IdRole = idRole;
        this.name = name;
    }

    public Integer getIdRole() {
        return IdRole;
    }

    public void setIdRole(Integer idRole) {
        IdRole = idRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
