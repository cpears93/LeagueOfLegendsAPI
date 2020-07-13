package com.example.LolAPI.repository;

import com.example.LolAPI.models.Champion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChampionRepository extends JpaRepository<Champion, Long> {

    List<Champion> findByName(String name);
    List<Champion> findByEpithet(String epithet);
    List<Champion> findByRoles(String roles);
    List<Champion> findByAbilities(String abilities);
    List<Champion> findByMana(String mana);
    List<Champion> findByArmour(String armour);
    List<Champion> findByAttackSpeed(String attackSpeed);
    List<Champion> findByAttackDamage(String attackDamage);
}
