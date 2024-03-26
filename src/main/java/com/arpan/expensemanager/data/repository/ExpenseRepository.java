package com.arpan.expensemanager.data.repository;

import com.arpan.expensemanager.data.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    @Query("select e from Expense e where e.appUser.userId = :userId")
    List<Expense> findExpensesByUser(@Param("userId") long userId);
}
