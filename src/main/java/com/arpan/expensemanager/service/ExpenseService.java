package com.arpan.expensemanager.service;

import com.arpan.expensemanager.data.dto.ExpenseDto;

import java.util.List;

public interface ExpenseService {

    List<ExpenseDto> getUserExpenses(final long userId);
}
