package com.hanstack.real_time_leaderboard.repository;

import com.hanstack.real_time_leaderboard.model.GlobalLeaderboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlobalLeaderboardRepository extends JpaRepository<GlobalLeaderboard, String> {
}