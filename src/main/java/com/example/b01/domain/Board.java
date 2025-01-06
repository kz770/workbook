package com.example.b01.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bno;

    @Column(length=500, nullable = false)
    private String title;

    @Column(length=2000, nullable = false)
    private String content;

    @Column(length=50, nullable = false)
    private String writer;
}