package com.arpan.expensemanager.service.impl;

import com.arpan.expensemanager.data.dto.CategoryDto;
import com.arpan.expensemanager.data.entity.Category;
import com.arpan.expensemanager.data.mapper.CategoryMapper;
import com.arpan.expensemanager.data.repository.CategoryRepository;
import com.arpan.expensemanager.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public List<CategoryDto> findCategoriesForUser(long userId) {
        List<Category> categoriesForUser = categoryRepository.findCategoriesForUser(userId);

        return categoryMapper.listEntityToDto(categoriesForUser);
    }
}
