package com.infsis.Blog.Controllers;

import com.infsis.Blog.DTOs.RoleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rol")
public class RolController {
    @GetMapping()
    public ResponseEntity<RoleDTO> getRol(){
        RoleDTO roleDTO= new RoleDTO(1,"rol1");
        return ResponseEntity.ok().body(roleDTO);
    }
    @GetMapping("/{idRol}")
    public ResponseEntity<RoleDTO> getRol(@PathVariable Integer idRol){
        RoleDTO roleDTO= new RoleDTO(1,"rol1");
        return ResponseEntity.ok().body(roleDTO);
    }
    @PostMapping
    public ResponseEntity<RoleDTO> saveRol(@RequestBody RoleDTO roleDTO){

        return ResponseEntity.ok().body(roleDTO);
    }

    @PutMapping("/{idRol}")
    public ResponseEntity<RoleDTO> updateRol(@PathVariable Integer idRol,@RequestBody RoleDTO roleDTO){
        return ResponseEntity.ok().body(roleDTO);
    }
    @DeleteMapping("/{idRol}")
    public void deleteRol(@PathVariable Integer idRol){

    }
}
