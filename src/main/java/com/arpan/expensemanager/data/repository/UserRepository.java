package com.arpan.expensemanager.data.repository;

import com.arpan.expensemanager.data.entity.AppUser;
import com.arpan.expensemanager.data.repository.custom.CustomizedSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long>, CustomizedSave<AppUser> {

    @Query("select u from AppUser u where u.userId = :userId")
    AppUser findUserWithId(@Param("userId") long userId);

}
