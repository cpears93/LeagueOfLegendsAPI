package com.example.LolAPI.components;

import com.example.LolAPI.models.Champion;
import com.example.LolAPI.models.GameMode;
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
        Champion aatrox = new Champion("Aatrox", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(aatrox);

        Champion ahri = new Champion("Ahri", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush", 334, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(ahri);

        Champion akali = new Champion("Akali", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(akali);

        Champion alistar = new Champion("Alistar", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(alistar);

        Champion amumu = new Champion("Amumu", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(amumu);

        Champion anivia = new Champion("Anivia", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(anivia);

        Champion annie = new Champion("Annie", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(annie);

        Champion aphelios = new Champion("Aphelios", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(aphelios);

        Champion ashe = new Champion("Ashe", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(ashe);

        Champion aurelionSol = new Champion("Aurelion Sol", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(aurelionSol);

        Champion azir = new Champion("Azir", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(azir);

        Champion bard = new Champion("Bard", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush", 334, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(bard);

        Champion blitzcrank = new Champion("Blitzcrank", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(blitzcrank);

        Champion brand = new Champion("Brand", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(brand);

        Champion braum = new Champion("Braum", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(braum);

        Champion caitlyn = new Champion("Caitlyn", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(caitlyn);

        Champion camille = new Champion("Camille", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(camille);

        Champion cassiopeia = new Champion("Cassiopeia", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(cassiopeia);

        Champion chogath = new Champion("Cho'gath", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(chogath);

        Champion corki = new Champion("Corki", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(corki);

        Champion darius = new Champion("Darius", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(darius);

        Champion diana = new Champion("Diana", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush", 334, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(diana);

        Champion drMundo = new Champion("Dr Mundo", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(drMundo);

        Champion draven = new Champion("Draven", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(draven);

        Champion ekko = new Champion("Ekko", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(ekko);

        Champion elise = new Champion("Elise", "The Spider Queen", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(elise);

        Champion evelynn = new Champion("Evelynn", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(evelynn);

        Champion ezreal = new Champion("Ezreal", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(ezreal);

        Champion fiddlesticks = new Champion("Fiddlesticks", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(fiddlesticks);

        Champion fiora = new Champion("Fiora", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(fiora);

        Champion fizz = new Champion("Fizz", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(fizz);

        Champion galio = new Champion("Galio", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush", 334, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(galio);

        Champion gangplank = new Champion("Gangplnk", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(gangplank);

        Champion garen = new Champion("Garen", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(garen);

        Champion gnar = new Champion("Gnar", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(gnar);

        Champion gragas = new Champion("Gragas", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(gragas);

        Champion graves = new Champion("Graves", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(graves);

        Champion hecarim = new Champion("Hecarim", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(hecarim);

        Champion heinerdinger = new Champion("Heimerdinger", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(heinerdinger);

        Champion illaoi = new Champion("Illaoi", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(illaoi);

        Champion irelia = new Champion("Irelia", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(irelia);

        Champion ivern = new Champion("Ivern", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush", 334, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(ivern);

        Champion janna = new Champion("Janna", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(janna);

        Champion jarvanIv = new Champion("Jarvan Iv", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(jarvanIv);

        Champion jax = new Champion("Jax", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(jax);

        Champion jayce = new Champion("Jayce", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(jayce);

        Champion jhin = new Champion("Jhin", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(jhin);

        Champion jinx = new Champion("Jinx", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(aphelios);

        Champion kaisa = new Champion("Kai'sa", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(kaisa);

        Champion kalista = new Champion("Kalista", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(kalista);

        Champion karma = new Champion("Karma", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(karma);

        Champion karthus = new Champion("Karthus", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush", 334, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(karthus);

        Champion kassadin = new Champion("Kassadin", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(kassadin);

        Champion katarina = new Champion("Katarina", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(katarina);

        Champion kayle = new Champion("Kayle", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(kayle);

        Champion kayn = new Champion("Kayn", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(kayn);

        Champion kennen = new Champion("Kennen", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(kennen);

        Champion khazix = new Champion("Kha'zix", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(khazix);

        Champion kindred = new Champion("Kindred", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(kindred);

        Champion kled = new Champion("Kled", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(kled);

        Champion kogmaw = new Champion("Kog'maw", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(kogmaw);

        Champion leblanc = new Champion("Leblanc", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush", 334, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(leblanc);

        Champion leeSin = new Champion("Lee Sin", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(leeSin);

        Champion leona = new Champion("Leona", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(leona);

        Champion lissandra = new Champion("Lissandra", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(lissandra);

        Champion lucian = new Champion("Lucian", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(lucian);

        Champion lulu = new Champion("Lulu", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(lulu);

        Champion lux = new Champion("Lux", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(lux);

        Champion malphite = new Champion("Malphite", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(malphite);

        Champion malzahar = new Champion("Malzahar", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(malzahar);

        Champion maokai = new Champion("Maokai", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(maokai);

        Champion masterYi = new Champion("Master Yi", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush", 334, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(masterYi);

        Champion missFortune = new Champion("Miss Fortune", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(missFortune);

        Champion mordekaiser = new Champion("Mordekaiser", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(mordekaiser);

        Champion morgana = new Champion("Morgana", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(morgana);

        Champion nami = new Champion("Nami", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(nami);

        Champion nasus = new Champion("Nasus", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(nasus);

        Champion nautilus = new Champion("Nautilus", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(nautilus);

        Champion neeko = new Champion("Neeko", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(neeko);

        Champion nidalee = new Champion("Nidalee", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(nidalee);

        Champion nocturne = new Champion("Nocturne", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(nocturne);

        Champion nunuAndWillump = new Champion("Nunu & Willump", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush", 334, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(nunuAndWillump);

        Champion olaf = new Champion("Olaf", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(olaf);

        Champion orianna = new Champion("Orianna", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(orianna);

        Champion ornn = new Champion("Ornn", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(ornn);

        Champion pantheon = new Champion("Pantheon", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(pantheon);

        Champion poppy = new Champion("Poppy", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(poppy);

        Champion pyke = new Champion("Pyke", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(pyke);

        Champion qiyana = new Champion("Qiyana", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(qiyana);

        Champion quinn = new Champion("Quinn", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(quinn);

        Champion rakan = new Champion("Rakan", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(rakan);

        Champion rammus = new Champion("Rammus", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush", 334, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(rammus);

        Champion reksai = new Champion("Rek'Sai", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(reksai);

        Champion renekton = new Champion("Renekton", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(renekton);

        Champion rengar = new Champion("Rengar", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(rengar);

        Champion riven = new Champion("Riven", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(riven);

        Champion rumble = new Champion("Rumble", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(rumble);

        Champion ryse = new Champion("Ryse", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(ryse);

        Champion sejuani = new Champion("Ashe", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(sejuani);

        Champion senna = new Champion("Senna", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(senna);

        Champion sett = new Champion("Sett", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(sett);

        Champion shaco = new Champion("Shaco", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush", 334, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(shaco);

        Champion shen = new Champion("Shen", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(shen);

        Champion shyvana = new Champion("Shyvana", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(shyvana);

        Champion singed = new Champion("Singed", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(singed);

        Champion sion = new Champion("Sion", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(sion);

        Champion sivir = new Champion("Sivir", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(sivir);

        Champion skarner = new Champion("Skarner", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(skarner);

        Champion sona = new Champion("Sona", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(sona);

        Champion soraka = new Champion("Soraka", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(soraka);

        Champion swain = new Champion("Swain", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(swain);

        Champion sylas = new Champion("Sylas", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush", 334, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(sylas);

        Champion syndra = new Champion("Syndra", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(syndra);

        Champion tahmKench = new Champion("Tahm Kench", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(tahmKench);

        Champion taliyah = new Champion("Taliyah", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(taliyah);

        Champion talon = new Champion("Talon", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(talon);

        Champion taric = new Champion("Taric", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(taric);

        Champion teemo = new Champion("Teemo", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(teemo);

        Champion thresh = new Champion("Thresh", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(thresh);

        Champion tristana = new Champion("Tristana", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(tristana);

        Champion trundle = new Champion("Trundle", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(trundle);

        Champion tryndamere = new Champion("Tryndamere", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush", 334, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(tryndamere);

        Champion twistedFate = new Champion("Twisted Fate", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(twistedFate);

        Champion twitch = new Champion("Twitch", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(twitch);

        Champion udyr = new Champion("Udyr", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(udyr);

        Champion urgot = new Champion("Urgot", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(urgot);

        Champion varius = new Champion("Varius", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(varius);

        Champion vayne = new Champion("Vayne", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(vayne);

        Champion veigar = new Champion("Veigar", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(veigar);

        Champion velkoz = new Champion("Vel'Koz", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(velkoz);

        Champion vi = new Champion("Vi", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(vi);

        Champion viktor = new Champion("Viktor", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(viktor);

        Champion vladimir = new Champion("Vladimir", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(vladimir);

        Champion volibear = new Champion("Volibear", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(volibear);

        Champion warwick = new Champion("Warwick", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(warwick);

        Champion wukong = new Champion("Wukong", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(wukong);

        Champion xayah = new Champion("Xayah", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(xayah);

        Champion xerath = new Champion("Xerath", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(xerath);

        Champion xinZhao = new Champion("Xin Zhao", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(xinZhao);

        Champion yassuo = new Champion("Yassuo", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush", 334, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(yassuo);

        Champion yorick = new Champion("Yorick", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(yorick);

        Champion yummi = new Champion("Yummi", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(yummi);

        Champion zac = new Champion("Zac", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(zac);

        Champion zed = new Champion("Zed", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(zed);

        Champion ziggs = new Champion("Ziggs", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(ziggs);

        Champion zilean = new Champion("Zylian", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(zilean);

        Champion zoe = new Champion("Zoe", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(zoe);

        Champion zyra = new Champion("Zyra", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(zyra);

        GameMode classic = new GameMode("Classic");
        gameModeRepository.save(classic);

    }
}
