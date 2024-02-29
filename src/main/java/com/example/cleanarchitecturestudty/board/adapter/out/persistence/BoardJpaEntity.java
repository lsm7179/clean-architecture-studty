package com.example.cleanarchitecturestudty.board.adapter.out.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "Board")
public class BoardJpaEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String contents;

    private LocalDateTime startDate;

    private LocalDateTime modifyDate;

    public BoardJpaEntity() {
    }
}
