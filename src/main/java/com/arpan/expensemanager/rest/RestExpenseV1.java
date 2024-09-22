package com.arpan.expensemanager.rest;

import com.arpan.expensemanager.data.dto.BaseResponse;
import com.arpan.expensemanager.data.dto.ExpenseDto;
import com.arpan.expensemanager.data.dto.ExpenseResponse;
import com.arpan.expensemanager.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.arpan.expensemanager.common.Constants.FAILURE;
import static com.arpan.expensemanager.common.Constants.SUCCESS;

@RestController
@RequestMapping("/api/expense/")
@RequiredArgsConstructor
public class RestExpenseV1 {

    private final ExpenseService expenseService;

    @GetMapping("{user}")
    public ResponseEntity<ExpenseResponse> getAllExpenses(@PathVariable long user) {

        try {
            List<ExpenseDto> userExpenses = expenseService.getUserExpenses(user);
            return new ResponseEntity<>(new ExpenseResponse(userExpenses,
                    HttpStatus.OK.toString(), SUCCESS),
                    HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(
                    new ExpenseResponse(new ArrayList<>(),
                            HttpStatus.INTERNAL_SERVER_ERROR.toString(), FAILURE),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
