package com.arpan.expensemanager.service.impl;

import com.arpan.expensemanager.data.mapper.UserMapper;
import com.arpan.expensemanager.data.dto.UserDto;
import com.arpan.expensemanager.data.entity.AppUser;
import com.arpan.expensemanager.data.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private UserMapper userMapper;

    @InjectMocks
    private UserServiceImpl userService;

    //just a very simple test, need enhancement as logic is updated
    @Test
    void retrieveUser() {
        when(userRepository.findUserWithId(anyLong())).thenReturn(new AppUser());
        when(userMapper.appUserToUserDto(any())).thenReturn(new UserDto());

        userService.retrieveUserDto(1);

        verify(userRepository, atMostOnce()).findUserWithId(anyLong());
    }

    @Test
    void addUser() {
//        when(userRepository.save(any())).thenReturn(new AppUser());

        userService.addUser(new UserDto());

        verify(userRepository, atMostOnce()).saveEntity(any());
    }

    @Test
    void deleteUser() {
    }
}
