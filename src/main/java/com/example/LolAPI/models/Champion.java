package com.example.LolAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "champions")
public class Champion {

    @Column(name = "Name")
    private String name;

    @Column(name = "Epithet")
    private String epithet;

    @Column(name = "Roles")
    private String roles;

    @Column(name = "Passive Ability")
    private String passiveAbility;

    @Column(name = "AbilityQ")
    private String abilityq;

    @Column(name = "AbilityW")
    private String abilityw;

    @Column(name = "AbilityE")
    private String abilitye;

    @Column(name = "AbilityR")
    private String abilityr;

    @Column(name = "Mana")
    private int mana;

    @Column(name = "Armour")
    private double armour;

    @Column(name = "Attack Speed")
    private double attackSpeed;

    @Column(name = "Attack Damage")
    private double attackDamage;

    @Column(name = "Health")
    private double health;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value="champions")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "champion_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "gamemode_id", nullable = false, updatable = false)}
    )
    private List<GameMode> gameModes;

    public Champion(String name, String epithet, String roles, String passiveAbility, String abilityq, String abilityw, String abilitye, String abilityr, int mana, double armour, double attackSpeed, double attackDamage, double health) {
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

    public Champion() {
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

    public double getArmour() {
        return armour;
    }

    public void setArmour(double armour) {
        this.armour = armour;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
