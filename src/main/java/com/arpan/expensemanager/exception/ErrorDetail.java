package com.arpan.expensemanager.exception;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class ErrorDetail {
    private String description;
    private LocalDateTime timestamp;
    private String code;
}
