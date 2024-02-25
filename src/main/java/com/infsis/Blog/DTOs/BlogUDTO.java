package com.infsis.Blog.DTOs;

import java.time.LocalDateTime;

public class BlogUDTO {
    private Integer idBlog;
    private String nameBlog;

    public BlogUDTO(Integer idBlog, String nameBlog) {
        this.idBlog = idBlog;
        this.nameBlog = nameBlog;

    }

    public Integer getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(Integer idBlog) {
        this.idBlog = idBlog;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

}
