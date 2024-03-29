package com.arpan.expensemanager.data.repository;

import com.arpan.expensemanager.data.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query("select c from Category c where c.appUser.userId = :userId")
    List<Category> findCategoriesForUser(@Param("userId") long userId);
}
