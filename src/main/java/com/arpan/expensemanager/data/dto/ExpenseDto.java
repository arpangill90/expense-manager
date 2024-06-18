package com.arpan.expensemanager.data.dto;

import com.arpan.expensemanager.data.entity.AppUser;
import com.arpan.expensemanager.data.entity.Category;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ExpenseDto {

    private Long expenseId;
    private Float amount;
    private String description;
    private PaymentMethod paymentMethod;
    private AppUser appUser;
    private Category category;
}
