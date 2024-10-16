package com.hanstack.real_time_leaderboard.repository;

import com.hanstack.real_time_leaderboard.model.TopPlayersReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopPlayersReportRepository extends JpaRepository<TopPlayersReport, String> {
}