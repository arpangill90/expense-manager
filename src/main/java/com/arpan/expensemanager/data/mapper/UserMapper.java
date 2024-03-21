package com.arpan.expensemanager.data.mapper;

import com.arpan.expensemanager.data.dto.UserDto;
import com.arpan.expensemanager.data.entity.AppUser;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserDto appUserToUserDto(AppUser appUser);
    AppUser userDtoToAppUser(UserDto userDto);
}
