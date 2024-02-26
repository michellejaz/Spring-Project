package com.infsis.Blog.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import com.infsis.Blog.Models.User;

@Entity
public class BlogU {
    //se uso el nombre de BlogU para que no haya una confusion con el nombre del proyecto
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdBlog;
    private String nameBlog;
    private LocalDateTime createdAtBlog;


    public BlogU(Integer idBlog, String nameBlog, LocalDateTime createdAtBlog) {
        IdBlog = idBlog;
        this.nameBlog = nameBlog;
        this.createdAtBlog = createdAtBlog;

    }
    public BlogU(){

    }
    public Integer getIdBlog() {
        return IdBlog;
    }

    public void setIdBlog(Integer idBlog) {
        IdBlog = idBlog;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public LocalDateTime getCreatedAtBlog() {
        return createdAtBlog;
    }

    public void setCreatedAtBlog(LocalDateTime createdAtBlog) {
        this.createdAtBlog = createdAtBlog;
    }

}