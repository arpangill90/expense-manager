package com.arpan.expensemanager.service.impl;

import com.arpan.expensemanager.data.dto.ExpenseDto;
import com.arpan.expensemanager.data.entity.Category;
import com.arpan.expensemanager.data.entity.Expense;
import com.arpan.expensemanager.data.mapper.ExpenseMapper;
import com.arpan.expensemanager.data.repository.ExpenseRepository;
import com.arpan.expensemanager.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

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

    public Map<String, List<Expense>> filteredExpenseByCategory(List<Expense> expenses, float minAmount) {
        return Optional.ofNullable(expenses).orElse(new ArrayList<>())
                .stream()
                .filter(expense -> expense.getAmount() >= minAmount)
                .collect(groupingBy(expense -> expense.getCategory().getCategoryName()));

    }
}
