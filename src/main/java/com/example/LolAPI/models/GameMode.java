package com.example.LolAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "gamemode")
public class GameMode {

    @Column(name = "Game Mode")
    private String gameMode;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value= "gamemodes")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "champion_gamemode",
            joinColumns = {@JoinColumn(name = "gamemode_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="champion_id", nullable = false, updatable = false)}
    )
    private List<Champion> champions;

    public GameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public GameMode() {
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }
}
