package com.arpan.expensemanager.service.impl;

import com.arpan.expensemanager.data.dto.ExpenseDto;
import com.arpan.expensemanager.data.entity.Expense;
import com.arpan.expensemanager.data.mapper.ExpenseMapper;
import com.arpan.expensemanager.data.repository.ExpenseRepository;
import com.arpan.expensemanager.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final ExpenseMapper expenseMapper;

    @Override
    public List<ExpenseDto> getUserExpenses(long userId) {
        List<Expense> expenses = expenseRepository.findExpensesByUser(userId);
        return expenseMapper.entityToDtoList(expenses);
    }
}
