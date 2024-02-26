package com.infsis.Blog.Controllers;

import com.infsis.Blog.DTOs.BlogUDTO;
import com.infsis.Blog.DTOs.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogUController {
    @GetMapping()
    public ResponseEntity<BlogUDTO> getBlogU(){
        BlogUDTO blogUDTO= new BlogUDTO(1,"blog");
        return ResponseEntity.ok().body(blogUDTO);
    }
    @GetMapping("/{idBlog}")
    public ResponseEntity<BlogUDTO> getBlogU(@PathVariable Integer idBlog){
        BlogUDTO blogUDTO=new BlogUDTO(1,"nameb");
        return ResponseEntity.ok().body(blogUDTO);
    }
    @PostMapping
    public ResponseEntity<BlogUDTO> saveBlogU(@RequestBody BlogUDTO blogUDTO){

        return ResponseEntity.ok().body(blogUDTO);
    }
    @PutMapping("/{idBlog}")
    public ResponseEntity<BlogUDTO> updateUser(@PathVariable Integer idBlog, @RequestBody BlogUDTO blogUDTO){
        return ResponseEntity.ok().body(blogUDTO);
    }
    @DeleteMapping("/{idBlog}")
    public void deleteBlog(@PathVariable Integer idBlog){

    }
}
