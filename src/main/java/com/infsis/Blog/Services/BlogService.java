package com.infsis.Blog.Services;

import com.infsis.Blog.DTOs.BlogUDTO;

import java.util.Optional;

public interface BlogService {
    Optional<BlogUDTO> getBlogUById(Integer IdBlog);
    BlogUDTO saveBlogU(BlogUDTO blogUDTO);
    BlogUDTO updateBlogU(Integer IdBlog, BlogUDTO blogUDTO);
    void deleteBlog(Integer IdBlog);
}
