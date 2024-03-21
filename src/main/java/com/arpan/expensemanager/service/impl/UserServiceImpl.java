package com.arpan.expensemanager.service.impl;

import com.arpan.expensemanager.data.mapper.UserMapper;
import com.arpan.expensemanager.data.dto.UserDto;
import com.arpan.expensemanager.data.entity.AppUser;
import com.arpan.expensemanager.data.repository.UserRespository;
import com.arpan.expensemanager.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRespository userRespository;
    private final UserMapper userMapper;

    @Override
    public UserDto retrieveUser(long userId) {
        AppUser appuser = userRespository.findUserWithId(userId);
        return userMapper.appUserToUserDto(appuser);
    }

    @Override
    public UserDto addUser(UserDto userDTO) {
        AppUser appUser = userMapper.userDtoToAppUser(userDTO);
        userRespository.save(appUser); //later build method to direct save
        return userDTO;
    }

    @Override
    public void deleteUser(long userId) {
        userRespository.deleteById(userId);
    }
}
