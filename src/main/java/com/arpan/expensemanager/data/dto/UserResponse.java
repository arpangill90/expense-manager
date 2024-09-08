package com.arpan.expensemanager.data.dto;

import java.time.LocalDateTime;


public class UserResponse extends BaseResponse<UserDto> {

    public UserResponse(UserDto data, String status, String message, LocalDateTime timeStamp) {
        super(data, status, message, timeStamp);
    }
}
