package com.arpan.expensemanager.service.impl;

import com.arpan.expensemanager.data.dto.CategoryDto;
import com.arpan.expensemanager.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public List<CategoryDto> findCategoriesForUser(long userId) {
        return null;
    }
}
