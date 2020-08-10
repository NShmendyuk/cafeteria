package ru.sevenseven.cafeteria.service;

import ru.sevenseven.cafeteria.dto.UserDto;
import ru.sevenseven.cafeteria.model.User;
import ru.sevenseven.cafeteria.repository.UserRepository;

import java.util.List;

public class UserService implements IUserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    //TODO: spring security for user, roles
    @Override
    public User add(UserDto userDto){
        User user = new User();
        user.setSurname(userDto.getSurname());
        user.setName(userDto.getName());
        user.setLogin(userDto.getLogin());
        user.setPassword("123"); //TODO: security
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
