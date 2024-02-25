package com.infsis.Blog.Controllers;

import com.infsis.Blog.DTOs.UserDTO;
import com.infsis.Blog.Models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping()
    public ResponseEntity<UserDTO> getUsers(){
        UserDTO userDTO= new UserDTO(1,"users", "users@users");
        return ResponseEntity.ok().body(userDTO);
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Integer id){
        UserDTO userDTO= new UserDTO(1,"users", "users@users");
        return ResponseEntity.ok().body(userDTO);
    }
    @PostMapping
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body(userDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Integer id,@RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body(userDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){

    }
}
