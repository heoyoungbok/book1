package com.example.book1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "football_player_table")
public class FootballPlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30 , nullable = false)
    private String playerName;

    @Column(length = 50, nullable = false)
    private String playerTeam;

    @Column(length = 20)
    private String playerPosition;

    @Column
    private int age;

    @Column
    private Long playerSalary;
}
