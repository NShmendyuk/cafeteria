package ru.sevenseven.cafeteria.service;

import ru.sevenseven.cafeteria.dto.UserDto;
import ru.sevenseven.cafeteria.model.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();
    User add(UserDto userDto);
    //User currentUser();
}
