package com.infsis.Blog.Services.Implement;

import com.infsis.Blog.DTOs.BlogUDTO;
import com.infsis.Blog.Models.BlogU;
import com.infsis.Blog.Services.BlogService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {
    @Override
    public Optional<BlogUDTO> getBlogUById(Integer IdBlog){
        return Optional.empty();
    }
    @Override
    public BlogUDTO saveBlogU(BlogUDTO blogUDTO){
        return null;
    }
    @Override
    public BlogUDTO updateBlogU(Integer IdBlog, BlogUDTO blogUDTO){
        return null;
    }
    @Override
    public void deleteBlog(Integer IdBlog){

    }
    private BlogUDTO BlogUtoDto(BlogU blogU){
        BlogUDTO blogUDTO=new BlogUDTO(
                blogU.getIdBlog(),
                blogU.getNameBlog()
        );
        return blogUDTO;
    }
    private BlogU DtoToblogU(BlogUDTO blogUDTO) {
        BlogU blogU = new BlogU();
        blogU.setNameBlog(blogUDTO.getNameBlog());

        return blogU;
    }
}
