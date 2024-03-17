package com.arpan.expensemanager.service.impl;

import com.arpan.expensemanager.data.dto.UserDTO;
import com.arpan.expensemanager.data.entity.AppUser;
import com.arpan.expensemanager.data.repository.UserRespository;
import com.arpan.expensemanager.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRespository userRespository;

    @Override
    public UserDTO retrieveUser(long userId) {
        AppUser appuser = userRespository.findUserWithId(userId);
        return null;
    }

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public void deleteUser(long userId) {

    }
}
