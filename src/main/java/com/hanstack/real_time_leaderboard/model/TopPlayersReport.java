package com.hanstack.real_time_leaderboard.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.time.Instant;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "top_players_report")
public class TopPlayersReport {
    
    @Id
    @Size(max = 50)
    @NotNull
    @Column(name = "username", nullable = false, length = 50)
    private String username;
    
    @Size(max = 100)
    @NotNull
    @Column(name = "game_name", nullable = false, length = 100)
    private String gameName;
    
    @Column(name = "top_score")
    private Integer topScore;
    
    @Column(name = "score_date")
    private Instant scoreDate;
}