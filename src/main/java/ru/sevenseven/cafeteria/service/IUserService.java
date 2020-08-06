package ru.sevenseven.cafeteria.service;

import ru.sevenseven.cafeteria.model.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();
    User add(User user);
    //User currentUser();
}
