package com.arpan.expensemanager.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
