package com.arpan.expensemanager.service.impl;

import com.arpan.expensemanager.data.entity.Category;
import com.arpan.expensemanager.data.entity.Expense;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ExpenseServiceImplTest {

    @InjectMocks
    private ExpenseServiceImpl expenseService;

    @DisplayName("Test with filters")
    @ParameterizedTest
    @MethodSource("getExpenseData")
    void filteredExpenseByCategory(List<Expense> expenses, float minAmount) {
        Map<String, List<Expense>> result = expenseService.filteredExpenseByCategory(expenses, minAmount);
        assertNotNull(result);
    }

    static Stream<Arguments> getExpenseData() {
        Category category1 = new Category();
        category1.setCategoryName("GROCERY");

        Category category2 = new Category();
        category2.setCategoryName("TRAVEL");

        Category category3 = new Category();
        category3.setCategoryName("FOOD");

        List<Expense> expenses = new ArrayList<>();
        Expense expense1 = new Expense();
        expense1.setExpenseId(1L);
        expense1.setAmount(1000.56f);
        expense1.setCategory(category1);

        Expense expense2 = new Expense();
        expense2.setExpenseId(2L);
        expense2.setAmount(8920.56f);
        expense2.setCategory(category1);

        Expense expense3 = new Expense();
        expense3.setExpenseId(3L);
        expense3.setAmount(590.56f);
        expense3.setCategory(category2);

        Expense expense4 = new Expense();
        expense4.setExpenseId(4L);
        expense4.setAmount(454.56f);
        expense4.setCategory(category3);

        expenses.add(expense2);
        expenses.add(expense2);
        expenses.add(expense3);
        expenses.add(expense4);

        return Stream.of(
                Arguments.of(expenses, 100)
        );
    }
}
