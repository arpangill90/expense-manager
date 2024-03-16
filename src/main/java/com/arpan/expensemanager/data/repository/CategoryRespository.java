package com.arpan.expensemanager.data.repository;

import com.arpan.expensemanager.data.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRespository extends JpaRepository<Category, Long> {
}
