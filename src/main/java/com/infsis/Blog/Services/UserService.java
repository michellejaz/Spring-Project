package com.infsis.Blog.Services;

import com.infsis.Blog.DTOs.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
public interface UserService {
    /*
   Lista de servicios que serán implementados es decir
   aqui van los métodos que proporcionaran la funcionalidad a nuestra aplicación
   */
    List<UserDTO> getUsers();
    UserDTO getUserById(Integer userId);
    UserDTO saveUser(UserDTO userDTO);
    UserDTO updateUser(Integer userId, UserDTO userDTO);
    void delete(Integer userId);
}
