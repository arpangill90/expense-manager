package com.arpan.expensemanager.data.dto;

import java.util.List;

public class ExpenseResponse extends BaseResponse<ExpenseDto> {

    public ExpenseResponse(List<ExpenseDto> data, String status, String message) {
        super(data, status, message);
    }
}
