package com.arpan.expensemanager.service.impl;

import com.arpan.expensemanager.data.UserMapper;
import com.arpan.expensemanager.data.dto.UserDto;
import com.arpan.expensemanager.data.entity.AppUser;
import com.arpan.expensemanager.data.repository.UserRespository;
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
    private UserRespository userRespository;

    @Mock
    private UserMapper userMapper;

    @InjectMocks
    private UserServiceImpl userService;

    //just a very simple test, need enhancement as logic is updated
    @Test
    void retrieveUser() {
        when(userRespository.findUserWithId(anyLong())).thenReturn(new AppUser());
        when(userMapper.appUserToUserDto(any())).thenReturn(new UserDto());

        userService.retrieveUser(1);

        verify(userRespository, atMostOnce()).findUserWithId(anyLong());
    }

    @Test
    void addUser() {
    }

    @Test
    void deleteUser() {
    }
}
