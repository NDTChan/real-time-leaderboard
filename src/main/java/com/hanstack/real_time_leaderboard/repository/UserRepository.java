package com.hanstack.real_time_leaderboard.repository;

import com.hanstack.real_time_leaderboard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}