package com.arpan.expensemanager.service.impl;

import com.arpan.expensemanager.data.mapper.UserMapper;
import com.arpan.expensemanager.data.dto.UserDto;
import com.arpan.expensemanager.data.entity.AppUser;
import com.arpan.expensemanager.data.repository.UserRepository;
import com.arpan.expensemanager.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDto retrieveUserDto(long userId) {
        AppUser appuser = userRepository.findUserWithId(userId);
        return userMapper.appUserToUserDto(appuser);
    }

    @Override
    public AppUser getUserById(long userId) {
        return userRepository.findUserWithId(userId);
    }

    @Override
    @Transactional
    public UserDto addUser(UserDto userDTO) {
        //make the ID null for auto generate to work
        userDTO.setUserId(null);
        AppUser appUser = userRepository.saveEntity(userMapper.userDtoToAppUser(userDTO));
        return userMapper.appUserToUserDto(appUser);
    }

    @Override
    @Transactional
    public void deleteUser(long userId) {
        userRepository.deleteById(userId);
    }
}
