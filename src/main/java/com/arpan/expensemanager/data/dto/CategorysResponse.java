package com.arpan.expensemanager.data.dto;

import java.util.List;

public class CategorysResponse extends BaseResponse<CategoryDto> {
    public CategorysResponse(List<CategoryDto> data, String status, String message) {
        super(data, status, message);
    }
}
