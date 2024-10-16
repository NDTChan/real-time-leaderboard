package com.hanstack.real_time_leaderboard.repository;

import com.hanstack.real_time_leaderboard.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}