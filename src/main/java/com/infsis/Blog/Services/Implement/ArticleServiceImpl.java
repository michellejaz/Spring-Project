package com.infsis.Blog.Services.Implement;

import com.infsis.Blog.DTOs.ArticleDTO;
import com.infsis.Blog.Models.Article;
import com.infsis.Blog.Services.ArticleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public Optional<ArticleDTO> getArticleById(Integer articleId){
        return Optional.empty();
    }
    @Override
    public ArticleDTO saveArticle(ArticleDTO articleDTO){
        return null;
    }
    @Override
    public ArticleDTO updateArticle(Integer articleId, ArticleDTO userDTO){
        return null;
    }
    @Override
    public void deleteArticle(Integer articleId){

    }
    private ArticleDTO ArticletoDto(Article article){
        ArticleDTO articleDTO=new ArticleDTO(
                article.getIdArticle(),
                article.getTitle(),
                article.getReference()
        );
        return articleDTO;
    }
    private Article DtoToArticle(ArticleDTO articleDTO) {
        Article article = new Article();
        article.setTitle(articleDTO.getTitle());
        article.setReference(articleDTO.getReference());

        return article;
    }
}
