package com.infsis.Blog.DTOs;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ArticleDTO {
    private Integer IdArticle;
    private String Title;
    private String reference;

    public ArticleDTO(Integer idArticle, String title, String reference) {
        IdArticle = idArticle;
        Title = title;
        this.reference = reference;
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
}
