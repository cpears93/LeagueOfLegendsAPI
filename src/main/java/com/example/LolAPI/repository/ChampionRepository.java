package com.example.LolAPI.repository;

import com.example.LolAPI.models.Champion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

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
    List<Champion> findByMana(int mana);
    List<Champion> findByArmour(double armour);
    List<Champion> findByAttackSpeed(double attackSpeed);
    List<Champion> findByAttackDamage(double attackDamage);
    List<Champion> findByHealth(double health);
	@GetMapping(value = "/champions/{id}")
	default ResponseEntity getChampion(final Long id) {
	    return new ResponseEntity<>(findById(id), HttpStatus.OK);
	}
}
