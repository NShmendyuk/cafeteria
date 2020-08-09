package ru.sevenseven.cafeteria.service;

import ru.sevenseven.cafeteria.model.User;
import ru.sevenseven.cafeteria.repository.UserRepository;

import java.util.List;

public class UserService implements IUserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User add(User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
