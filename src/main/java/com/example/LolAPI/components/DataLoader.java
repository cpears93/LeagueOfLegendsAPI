package com.example.LolAPI.components;

import com.example.LolAPI.models.Champion;
import com.example.LolAPI.repository.ChampionRepository;
import com.example.LolAPI.repository.GameModeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ChampionRepository championRepository;

    @Autowired
    GameModeRepository gameModeRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Champion aatrox = new Champion("Aatrox", "the Darkin Blade", "Fighter", "Deathbringer Stance", "", 0, 24.384, 0.651, 60.376);
        championRepository.save(aatrox);

        Champion elise = new Champion("Elise", "The Spider Queen", "Fighter/Mage", "Cocoon", 324, 22.138, 0.625, 50.54);
        championRepository.save(elise);
    }
}
