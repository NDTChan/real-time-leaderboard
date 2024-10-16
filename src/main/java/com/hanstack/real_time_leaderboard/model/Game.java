package com.hanstack.real_time_leaderboard.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id", nullable = false)
    private Integer id;
    
    @Size(max = 100)
    @NotNull
    @Column(name = "game_name", nullable = false, length = 100)
    private String gameName;
    
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    
    @OneToMany(mappedBy = "game")
    private Set<Score> scores = new LinkedHashSet<>();
    
}