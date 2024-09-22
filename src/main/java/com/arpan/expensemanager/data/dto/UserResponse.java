package com.arpan.expensemanager.data.dto;

public class UserResponse extends BaseResponse<UserDto> {

    public UserResponse(UserDto data, String status, String message) {
        super(data, status, message);
    }
}
