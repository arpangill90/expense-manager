package com.arpan.expensemanager.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.List;

@AllArgsConstructor
@Builder
public class BaseResponse<T> {
    private T data;
    private List<String> errors;

}
