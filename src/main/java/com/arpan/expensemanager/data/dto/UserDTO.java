package com.arpan.expensemanager.data.dto;

import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
public class UserDTO {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
