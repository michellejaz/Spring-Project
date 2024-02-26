package com.infsis.Blog.Controllers;

import com.infsis.Blog.DTOs.ArticleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Article")
public class ArticleController {
    @GetMapping()
    public ResponseEntity<ArticleDTO> getArticle(){
        ArticleDTO articleDTO= new ArticleDTO(1,"Article1","holamundo");
        return ResponseEntity.ok().body(articleDTO);
    }
    @GetMapping("/{idArticle}")
    public ResponseEntity<ArticleDTO> getArticle(@PathVariable Integer idArticle){
        ArticleDTO articleDTO= new ArticleDTO(1,"Article1","holamundo");
        return ResponseEntity.ok().body(articleDTO);
    }
    @PostMapping
    public ResponseEntity<ArticleDTO> saveArticle(@RequestBody ArticleDTO articleDTO){

        return ResponseEntity.ok().body(articleDTO);
    }

    @PutMapping("/{idArticle}")
    public ResponseEntity<ArticleDTO> updateArticle(@PathVariable Integer idArticle,@RequestBody ArticleDTO articleDTO){
        return ResponseEntity.ok().body(articleDTO);
    }
    @DeleteMapping("/{idArticle}")
    public void deleteArticle(@PathVariable Integer idArticle){

    }
}
