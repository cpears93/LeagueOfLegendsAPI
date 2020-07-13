package com.example.LolAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "gameModes")
public class GameMode {

    @Column(name = "Regular Modes")
    private String regularModes;

    @Column(name = "Featured Game Modes")
    private String featuredGameModes;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value="gameModes")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "champion_gameMode_id",
            joinColumns = {@JoinColumn(name = "gameMode_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "champion_id", nullable = false, updatable = false)}
    )
    private List<Champion> champions;

    public GameMode(String regularModes, String featuredGameModes) {
        this.regularModes = regularModes;
        this.featuredGameModes = featuredGameModes;
    }

    public GameMode() {
    }

    public String getRegularModes() {
        return regularModes;
    }

    public void setRegularModes(String regularModes) {
        this.regularModes = regularModes;
    }

    public String getFeaturedGameModes() {
        return featuredGameModes;
    }

    public void setFeaturedGameModes(String featuredGameModes) {
        this.featuredGameModes = featuredGameModes;
    }
}
