package com.arpan.expensemanager.rest;

import com.arpan.expensemanager.data.dto.ExpenseDto;
import com.arpan.expensemanager.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/expense/")
@RequiredArgsConstructor
public class RestExpenseV1 {

    private final ExpenseService expenseService;

    @GetMapping("{user}")
    public ResponseEntity<List<ExpenseDto>> getAllExpenses(@PathVariable long user) {
        return new ResponseEntity<>(expenseService.getUserExpenses(user), HttpStatus.OK);
    }

}
