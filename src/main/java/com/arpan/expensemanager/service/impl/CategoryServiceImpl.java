package com.arpan.expensemanager.service.impl;

import com.arpan.expensemanager.data.dto.CategoryDto;
import com.arpan.expensemanager.data.entity.AppUser;
import com.arpan.expensemanager.data.entity.Category;
import com.arpan.expensemanager.data.mapper.CategoryMapper;
import com.arpan.expensemanager.data.repository.CategoryRepository;
import com.arpan.expensemanager.exception.ExpenseManagerException;
import com.arpan.expensemanager.service.CategoryService;
import com.arpan.expensemanager.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;
    private final UserService userService;

    @Override
    public List<CategoryDto> findCategoriesForUser(long userId) {
        List<Category> categoriesForUser = categoryRepository.findCategoriesForUser(userId);

        return categoryMapper.listEntityToDto(categoriesForUser);
    }

    @Override
    @Transactional
    public CategoryDto addCategory(CategoryDto categoryDto, long userId) {
        AppUser appUser = userService.getUserById(userId);
        if (null == appUser) {
            throw new ExpenseManagerException("Invalid User");
        }

        Category category = categoryMapper.dtoToEntity(categoryDto);
        appUser.addCategory(category);

        Category savedEntity = categoryRepository.saveEntity(category);

        return categoryMapper.entityToDto(savedEntity);
    }
}
