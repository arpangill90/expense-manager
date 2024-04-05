package com.arpan.expensemanager.service;

import com.arpan.expensemanager.data.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> findCategoriesForUser(long userId);

    CategoryDto addCategory(CategoryDto categoryDto, long userId);
}
