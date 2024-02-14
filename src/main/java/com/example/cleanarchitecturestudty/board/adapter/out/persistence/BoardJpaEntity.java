package com.example.cleanarchitecturestudty.board.adapter.out.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Board")
public class BoardJpaEntity {

    @Id
    @GeneratedValue
    private Long id;

    public BoardJpaEntity() {
    }
}
