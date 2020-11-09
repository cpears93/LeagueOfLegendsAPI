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
    List<Champion> findByPassiveAbility(String passiveAbility);
    List<Champion> findByAbilityq(String abilityq);
    List<Champion> findByAbilityw(String abilityw);
    List<Champion> findByAbilitye(String abilitye);
    List<Champion> findByAbilityr(String abilityr);
    List<Champion> findByMana(float mana);
    List<Champion> findByArmour(float armour);
    List<Champion> findByAttackSpeed(double d);
    List<Champion> findByAttackDamage(float attackDamage);
    List<Champion> findByHealth(float health);

}
