package com.arpan.expensemanager.exception;

import com.arpan.expensemanager.data.dto.BaseResponse;

import java.time.LocalDateTime;

public class ErrorResponse extends BaseResponse {

    public ErrorResponse(Object data, String status, String message, LocalDateTime timeStamp) {
        super(data, status, message, timeStamp);
    }
}
