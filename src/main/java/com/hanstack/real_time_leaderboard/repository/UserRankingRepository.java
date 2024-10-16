package com.hanstack.real_time_leaderboard.repository;

import com.hanstack.real_time_leaderboard.model.UserRanking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRankingRepository extends JpaRepository<UserRanking, Integer> {
}