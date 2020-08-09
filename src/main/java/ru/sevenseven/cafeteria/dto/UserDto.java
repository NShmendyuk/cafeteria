package ru.sevenseven.cafeteria.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private String login;
    private String surname;
    private String name;
}
