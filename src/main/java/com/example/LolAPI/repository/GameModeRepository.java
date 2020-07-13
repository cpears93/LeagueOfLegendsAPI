package com.example.LolAPI.repository;

import com.example.LolAPI.models.GameMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameModeRepository extends JpaRepository<GameMode, Long> {

    List<GameMode> findByRegulartMode(String regularMode);
    List<GameMode> findByFeaturedGameMode(String featuredGameMode);
}
