package com.arpan.expensemanager.data.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "app_user")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "first_name")
    @Size(min = 3, max = 30)
    private String firstName;

    @Column(name = "last_name")
    @Size(min = 3, max = 30)
    private String lastName;

    @Column(name = "user_name", unique = true)
    @Size(min = 3, max = 20)
    private String userName;

    @Column(name = "email", unique = true)
    @Size(min = 3, max = 50)
    private String email;

    @Column(name = "phone_number")
    @Size(min = 10, max = 10)
    private String phoneNumber;

    @Column(name = "date_of_birth", columnDefinition = "DATE")
    private LocalDate dateOfBirth;

    //keep category even if user is removed
    @OneToMany(mappedBy = "appUser", cascade = {CascadeType.PERSIST, CascadeType.MERGE,
    CascadeType.DETACH, CascadeType.REFRESH})
    private List<Category> categories;

    //remove expenses if user is removed
    @OneToMany(mappedBy = "appUser", cascade = CascadeType.ALL)
    private List<Expense> expenses;

    @Column(name = "created_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdDate;

    @Column(name = "updated_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime updatedDate;

    public void addCategory(Category category) {
        if (null == categories) {
            categories = new ArrayList<>();
        }
        categories.add(category);
        category.setAppUser(this);
    }

    public void addExpense(Expense expense) {
        if (null == expenses) {
            expenses = new ArrayList<>();
        }
        expenses.add(expense);
        expense.setAppUser(this);
    }

}
