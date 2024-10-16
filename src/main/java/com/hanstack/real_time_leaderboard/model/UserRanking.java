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

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "user_rankings")
public class UserRanking {
    
    @Id
    @NotNull
    @Column(name = "user_id", nullable = false)
    private Integer userId;
    
    @Size(max = 50)
    @NotNull
    @Column(name = "username", nullable = false, length = 50)
    private String username;
    
    @NotNull
    @Column(name = "user_rank", nullable = false)
    private Long userRank;
}