package com.GWork.myDiary.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    private LocalDateTime createdOn=LocalDateTime.now();

    @ManyToOne
    private User user;
}


