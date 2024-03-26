package com.arpan.expensemanager.data.mapper;

import com.arpan.expensemanager.data.dto.ExpenseDto;
import com.arpan.expensemanager.data.entity.Expense;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ExpenseMapper {
    Expense dtoToEntity(ExpenseDto expenseDto);
    ExpenseDto entityToDto(Expense expense);

    List<ExpenseDto> entityToDtoList(List<Expense> expenses);
}
