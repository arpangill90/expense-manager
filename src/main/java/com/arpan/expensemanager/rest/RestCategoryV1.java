package com.arpan.expensemanager.rest;

import com.arpan.expensemanager.data.dto.BaseResponse;
import com.arpan.expensemanager.data.dto.CategoryDto;
import com.arpan.expensemanager.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/category/")
@RequiredArgsConstructor
public class RestCategoryV1 {

    private final CategoryService categoryService;

    @GetMapping("{user}")
    public ResponseEntity<BaseResponse> getAllExpenses(@PathVariable long user) {
        List<CategoryDto> categoriesForUser = categoryService.findCategoriesForUser(user);

        return new ResponseEntity<>(new BaseResponse(categoriesForUser,
                HttpStatus.OK.toString(), "SUCCESS", LocalDateTime.now()),
                HttpStatus.OK);
    }


}
