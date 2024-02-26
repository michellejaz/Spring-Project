package com.infsis.Blog.Models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

import com.infsis.Blog.Models.User;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class BlogU {
    //se uso el nombre de BlogU para que no haya una confusion con el nombre del proyecto
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdBlog;
    private String nameBlog;
    @CreatedDate
    private LocalDateTime createdAtBlog;
    @OneToMany(fetch =  FetchType.LAZY, mappedBy = "blog")
    private List<Article> articles;
    @OneToOne
    @JoinColumn(name = "user_id")

    private User user;

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