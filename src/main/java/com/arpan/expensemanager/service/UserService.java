package com.arpan.expensemanager.service;

import com.arpan.expensemanager.data.dto.UserDto;

public interface UserService {

    UserDto retrieveUser(long userId);
    UserDto addUser(UserDto userDTO);
    void deleteUser(long userId);
}
