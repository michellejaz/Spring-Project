package com.infsis.Blog.Controllers;

import com.infsis.Blog.DTOs.RoleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rol")
public class RolController {
    @GetMapping()
    public ResponseEntity<RoleDTO> getRole(){
        RoleDTO roleDTO= new RoleDTO(1,"rol1");
        return ResponseEntity.ok().body(roleDTO);
    }
    @GetMapping("/{idRol}")
    public ResponseEntity<RoleDTO> getRole(@PathVariable Integer idRol){
        RoleDTO roleDTO= new RoleDTO(1,"rol1");
        return ResponseEntity.ok().body(roleDTO);
    }
    @PostMapping
    public ResponseEntity<RoleDTO> saveRole(@RequestBody RoleDTO roleDTO){

        return ResponseEntity.ok().body(roleDTO);
    }

    @PutMapping("/{idRol}")
    public ResponseEntity<RoleDTO> updateRole(@PathVariable Integer idRol,@RequestBody RoleDTO roleDTO){
        return ResponseEntity.ok().body(roleDTO);
    }
    @DeleteMapping("/{idRol}")
    public void deleteRole(@PathVariable Integer idRol){

    }
}
