package com.arpan.expensemanager.data.repository;

import com.arpan.expensemanager.data.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<AppUser, Long> {

    @Query("select u from AppUser u where u.userId = :userId")
    AppUser findUserWithId(@Param("userId") long userId);

}
