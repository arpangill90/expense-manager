package com.arpan.expensemanager.data.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BaseResponse {
    private Object data;
    private String status;
    private String message;
    private LocalDateTime timeStamp;

}
