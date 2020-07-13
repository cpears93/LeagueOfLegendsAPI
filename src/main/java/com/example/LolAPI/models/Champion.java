package com.example.LolAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
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

    @Column(name = "Abilities")
    private String abilities;

    @Column(name = "Mana")
    private String mana;

    @Column(name = "Armour")
    private String armour;

    @Column(name = "Attack Speed")
    private String attackSpeed;

    @Column(name = "Attack Damage")
    private String attackDamage;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value="characters")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "champion_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "gameMode_id", nullable = false, updatable = false)}
    )
    private List<GameMode> gameModes;

    public Champion(String name, String epithet, String roles, String abilities, String mana, String armour, String attackSpeed, String attackDamage) {
        this.name = name;
        this.epithet = epithet;
        this.roles = roles;
        this.abilities = abilities;
        this.mana = mana;
        this.armour = armour;
        this.attackSpeed = attackSpeed;
        this.attackDamage = attackDamage;
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

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public String getMana() {
        return mana;
    }

    public void setMana(String mana) {
        this.mana = mana;
    }

    public String getArmour() {
        return armour;
    }

    public void setArmour(String armour) {
        this.armour = armour;
    }

    public String getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(String attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public String getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(String attackDamage) {
        this.attackDamage = attackDamage;
    }
}
