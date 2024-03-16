package com.arpan.expensemanager.data.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "category")
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_id;

    @Column(name="category_name")
    @Size(min = 3, max = 30)
    private String categoryName;

    @Column(name = "description")
    private String description;

    @Column(name = "created_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdDate;

    @Column(name = "updated_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime updatedDate;

}
