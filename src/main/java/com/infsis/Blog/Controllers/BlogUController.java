package com.infsis.Blog.Controllers;

import com.infsis.Blog.DTOs.BlogUDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BlogU")
public class BlogUController {
    public ResponseEntity<BlogUDTO> getBlogU(){
        BlogUDTO blogUDTO= new BlogUDTO(1,"Blogu");
        return ResponseEntity.ok().body(blogUDTO);
    }
}
