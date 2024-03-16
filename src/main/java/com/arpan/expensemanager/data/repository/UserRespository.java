package com.arpan.expensemanager.data.repository;

import com.arpan.expensemanager.data.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<AppUser, Long> {
}
