package com.RESTAPI.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {

    private int id;
    private String email;
    private String username;

    public UserResponseDTO(int id, String email, String username) {
        this.id = id;
        this.email = email;
        this.username = username;
    }
}
