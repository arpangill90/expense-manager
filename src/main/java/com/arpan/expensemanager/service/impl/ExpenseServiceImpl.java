package com.arpan.expensemanager.service.impl;

import com.arpan.expensemanager.data.dto.ExpenseDto;
import com.arpan.expensemanager.service.ExpenseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    @Override
    public List<ExpenseDto> getUserExpenses(long userId) {
        return new ArrayList<>();
    }
}
