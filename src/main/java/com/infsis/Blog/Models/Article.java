package com.infsis.Blog.Models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdArticle;
    private String Title;
    private String reference;
    @CreatedDate
    private LocalDateTime createdAt;
    @ManyToOne()
    @JoinColumn(name= "user_id")
    private User user;
    @ManyToOne()
    @JoinColumn(name ="blog_id")
    private BlogU blog;
    public Article(){

    }
    public Article(Integer idArticle, String title, String reference, LocalDateTime createdAt) {
        IdArticle = idArticle;
        Title = title;
        this.reference = reference;
        this.createdAt = createdAt;
    }

    public Integer getIdArticle() {
        return IdArticle;
    }

    public void setIdArticle(Integer idArticle) {
        IdArticle = idArticle;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
