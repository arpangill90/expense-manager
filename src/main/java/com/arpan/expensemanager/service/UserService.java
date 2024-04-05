package com.arpan.expensemanager.service;

import com.arpan.expensemanager.data.dto.UserDto;
import com.arpan.expensemanager.data.entity.AppUser;

public interface UserService {

    UserDto retrieveUserDto(long userId);
    AppUser getUserById(long userId);
    UserDto addUser(UserDto userDTO);
    void deleteUser(long userId);
}
