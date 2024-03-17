package com.arpan.expensemanager.service;

import com.arpan.expensemanager.data.dto.UserDTO;

public interface UserService  {

    UserDTO retrieveUser(long userId);
    UserDTO addUser(UserDTO userDTO);
    void deleteUser(long userId);
}
