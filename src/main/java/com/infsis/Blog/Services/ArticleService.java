package com.infsis.Blog.Services;

import com.infsis.Blog.DTOs.ArticleDTO;


import java.util.Optional;

public interface ArticleService {
    Optional<ArticleDTO> getArticleById(Integer articleId);
    ArticleDTO saveArticle(ArticleDTO articleDTO);
    ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO);
    void deleteArticle(Integer articleId);

}
