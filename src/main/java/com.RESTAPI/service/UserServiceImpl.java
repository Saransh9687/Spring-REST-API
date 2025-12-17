package com.RESTAPI.service;

import com.RESTAPI.dto.UserRequestDTO;
import com.RESTAPI.dto.UserResponseDTO;
import com.RESTAPI.entity.User;
import com.RESTAPI.repo.UserRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserResponseDTO createUser(UserRequestDTO dto) {

        User existing = userRepo.findByEmail(dto.getEmail());
        if (existing != null) {
            throw new RuntimeException("User already exists");
        }

        User user = new User();
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword()); // plain for now
        user.setUsername(dto.getUsername());

        userRepo.save(user);

        return new UserResponseDTO(
                user.getUserid(),
                user.getEmail(),
                user.getUsername()
        );
    }

    @Override
    public void deleteUser(Long userId) {

        User user = userRepo.findById(userId);
        if (user == null) {
            throw new RuntimeException("User not found");
        }

        userRepo.delete(user);
    }
}
