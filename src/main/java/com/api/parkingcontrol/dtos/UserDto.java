package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;

public class UserDto {

    @NotBlank
    String name;

    @NotBlank
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

