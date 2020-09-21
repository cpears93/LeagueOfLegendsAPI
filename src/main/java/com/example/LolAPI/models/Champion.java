package com.example.LolAPI.models;

import javax.persistence.*;

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
    private double mana;

    @Column(name = "Armour")
	public double armour;

    @Column(name = "attackSpeed")
    private double attackSpeed;

    @Column(name = "attackDamage")
    private double attackDamage;

    @Column(name = "health")
    private double health;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Champion(final String name, final String epithet, final String roles, final String passiveAbility,
            final String abilityq, final String abilityw, final String abilitye, final String abilityr,
            final double mana, final double armour, final double attackSpeed, final double attackDamage,
            final double health) {
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

    public void setName(final String name) {
        this.name = name;
    }

    public String getEpithet() {
        return epithet;
    }

    public void setEpithet(final String epithet) {
        this.epithet = epithet;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(final String roles) {
        this.roles = roles;
    }

    public String getPassiveAbility() {
        return passiveAbility;
    }

    public void setPassiveAbility(final String passiveAbility) {
        this.passiveAbility = passiveAbility;
    }

    public String getAbilityq() {
        return abilityq;
    }

    public void setAbilityq(final String abilityq) {
        this.abilityq = abilityq;
    }

    public String getAbilityw() {
        return abilityw;
    }

    public void setAbilityw(final String abilityw) {
        this.abilityw = abilityw;
    }

    public String getAbilitye() {
        return abilitye;
    }

    public void setAbilitye(final String abilitye) {
        this.abilitye = abilitye;
    }

    public String getAbilityr() {
        return abilityr;
    }

    public void setAbilityr(final String abilityr) {
        this.abilityr = abilityr;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(final double mana) {
        this.mana = mana;
    }

    public double getArmour() {
        return armour;
    }

    public void setArmour(final double armour) {
        this.armour = armour;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(final double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(final double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(final double health) {
        this.health = health;
    }
}
