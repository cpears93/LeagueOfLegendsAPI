package com.example.LolAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "champion")
public class Champion {

    @Column(name = "name")
    private String name;

    @Column(name = "epithet")
    private String epithet;

    @Column(name = "roles")
    private String roles;

    @Column(name = "passiveAbility")
    private String passiveAbility;

    @Column(name = "abilityQ")
    private String abilityq;

    @Column(name = "abilityW")
    private String abilityw;

    @Column(name = "abilityE")
    private String abilitye;

    @Column(name = "abilityR")
    private String abilityr;

    @Column(name = "mana")
    private int mana;

    @Column(name = "Armour")
    private int armour;

    @Column(name = "attackSpeed")
    private int attackSpeed;

    @Column(name = "attackDamage")
    private int attackDamage;

    @Column(name = "health")
    private int health;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Champion(String name, String epithet, String roles, String passiveAbility, String abilityq, String abilityw, String abilitye, String abilityr, int mana, int armour, int attackSpeed, int attackDamage, int health) {
        this.name = name;
        this.epithet = epithet;
        this.roles = roles;
        this.passiveAbility = passiveAbility;
        this.abilityq = abilityq;
        this.abilityw = abilityw;
        this.abilitye = abilitye;
        this.abilityr = abilityr;
        this.mana = mana;
        this.armour = armour;
        this.attackSpeed = attackSpeed;
        this.attackDamage = attackDamage;
        this.health = health;
    }

    public Champion(String aatrox, String the_darkin_blade, String fighter, String deathbringer_stance, String theDarkinBlade, String infernal_chains, String umbral_dash, String world_ender, int mana, double v, double v1, double v2, double v3) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEpithet() {
        return epithet;
    }

    public void setEpithet(String epithet) {
        this.epithet = epithet;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getPassiveAbility() {
        return passiveAbility;
    }

    public void setPassiveAbility(String passiveAbility) {
        this.passiveAbility = passiveAbility;
    }

    public String getAbilityq() {
        return abilityq;
    }

    public void setAbilityq(String abilityq) {
        this.abilityq = abilityq;
    }

    public String getAbilityw() {
        return abilityw;
    }

    public void setAbilityw(String abilityw) {
        this.abilityw = abilityw;
    }

    public String getAbilitye() {
        return abilitye;
    }

    public void setAbilitye(String abilitye) {
        this.abilitye = abilitye;
    }

    public String getAbilityr() {
        return abilityr;
    }

    public void setAbilityr(String abilityr) {
        this.abilityr = abilityr;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
