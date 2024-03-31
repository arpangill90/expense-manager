package com.arpan.expensemanager.rest;

import com.arpan.expensemanager.data.dto.CategoryDto;
import com.arpan.expensemanager.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/category/")
@RequiredArgsConstructor
public class RestCategoryV1 {

    private final CategoryService categoryService;

    @GetMapping("{user}")
    public ResponseEntity<List<CategoryDto>> getAllExpenses(@PathVariable long user) {
        return new ResponseEntity<>(categoryService.findCategoriesForUser(user), HttpStatus.OK);
    }


}
