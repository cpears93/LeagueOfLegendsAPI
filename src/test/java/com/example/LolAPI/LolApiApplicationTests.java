package com.example.LolAPI;

import com.example.LolAPI.models.Champion;
import com.example.LolAPI.models.GameMode;
import com.example.LolAPI.repository.ChampionRepository;
import com.example.LolAPI.repository.GameModeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class LolApiApplicationTests {

	@Autowired
	ChampionRepository championRepository;

	@Autowired
	GameModeRepository gameModeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createCharacterAndGameModeThenSave(){

		Champion aatrox = new Champion("Aatrox", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
		championRepository.save(aatrox);
		GameMode classic = new GameMode("Classic");
		gameModeRepository.save(classic);
	}

}
