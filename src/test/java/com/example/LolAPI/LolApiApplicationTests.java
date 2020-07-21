package com.example.LolAPI;

import com.example.LolAPI.models.Champion;
import com.example.LolAPI.repository.ChampionRepository;
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

	@Test
	public void contextLoads() {
	}

	@Test
		public void createCharacterThenSave(){

			Champion aatrox = new Champion("Aatrox", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
			championRepository.save(aatrox);
		}

		@Test
		public void canFindChampionByName(){
			List<Champion> found = championRepository.findByName("Kai'sa");
			assertEquals("Kai'sa", found.get(0).getName());
		}

		@Test
		public void canFindChampionByRoles(){
			List<Champion> found = championRepository.findByRoles("Mage");
			assertEquals("Mage", found.get(0).getRoles());
		}

		@Test
		public void canFindChampionByPassiveAbility(){
			List<Champion> found = championRepository.findByPassiveAbility("Vastaryan Grace");
			assertEquals("Vastaryan Grace", found.get(0).getPassiveAbility());
		}

		@Test
		public void canFindChampionByAbilityQ(){
			List<Champion> found = championRepository.findByAbilityq("H-28G Evolution Turret");
			assertEquals("H-28G Evolution Turret", found.get(0).getAbilityq());
		}

		@Test
		public void canFindChampionByEAbilityW(){
			List<Champion> found = championRepository.findByAbilityw("Eclipse");
			assertEquals("Eclipse", found.get(0).getAbilityw());
		}

		@Test
		public void canFindChampionByAbilityE(){
			List<Champion> found = championRepository.findByAbilitye("Thundering Blow/Acceleration Gate");
			assertEquals("Thundering Blow/Acceleration Gate", found.get(0).getAbilitye());
		}

		@Test
		public void canFindChampionByAbilityR(){
			List<Champion> found = championRepository.findByAbilityr("Hero's Entrance");
			assertEquals("Hero's Entrance", found.get(0).getAbilityr());
		}

		@Test
		public void canFindChampionByMana(){
			List<Champion> found = championRepository.findByMana(475);
			assertEquals(475, found.get(0).getMana());
		}

		@Test
		public void canFindChampionByArmour(){
			List<Champion> found = championRepository.findByArmour(32);
			assertEquals(32, found.get(0).getArmour());
		}

		@Test
		public void canFindChampionByAttackSpeed(){
			List<Champion> found = championRepository.findByAttackSpeed(0.658);
			assertEquals(0.658, found.get(0).getAttackSpeed());
		}

		@Test
		public void canFindChampionByAttackDamage(){
			List<Champion> found = championRepository.findByAttackSpeed(66);
			assertEquals(66, found.get(0).getAttackSpeed());
		}

		@Test
		public void canFindChampionByHealth(){
			List<Champion> found = championRepository.findByHealth(534);
			assertEquals(534, found.get(0).getHealth());
		}

}
