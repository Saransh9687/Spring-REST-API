package com.RESTAPI.service;

import com.RESTAPI.dto.UserRequestDTO;
import com.RESTAPI.dto.UserResponseDTO;

public interface UserService {
    UserResponseDTO createUser(UserRequestDTO dto);
    void deleteUser(Long userId);
    UserResponseDTO getUser(Long userId);

}
