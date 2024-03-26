package com.arpan.expensemanager.data.dto;

import com.arpan.expensemanager.data.entity.AppUser;
import com.arpan.expensemanager.data.entity.Expense;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {

    private Long categoryId;
    @Size(min = 3, max = 30)
    private String categoryName;
    private String description;
    private AppUser appUser;
    private List<Expense> expenses;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
