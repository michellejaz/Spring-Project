package com.infsis.Blog.Services;

import com.infsis.Blog.DTOs.UserDTO;
import org.springframework.stereotype.Service;
import java.util.Optional;
public interface UserService {
    Optional<UserDTO> getUserById(Integer userId);
    UserDTO saveUser(UserDTO userDTO);
    UserDTO updateUser(Integer userId, UserDTO userDTO);
    void delete(Integer userId);
}
