package com.arpan.expensemanager.data.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "app_user")
@Getter
@Setter
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

    @Column(name = "created_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdDate;

    @Column(name = "updated_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime updatedDate;

}
