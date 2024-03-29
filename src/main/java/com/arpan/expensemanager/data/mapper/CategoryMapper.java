package com.arpan.expensemanager.data.mapper;

import com.arpan.expensemanager.data.dto.CategoryDto;
import com.arpan.expensemanager.data.entity.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    CategoryDto entityToDto(Category category);
    Category dtoToEntity(Category category);
    List<CategoryDto> listEntityToDto(List<Category> category);
}
