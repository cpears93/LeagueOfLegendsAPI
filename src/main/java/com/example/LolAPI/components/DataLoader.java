package com.example.LolAPI.components;

import com.example.LolAPI.models.Champion;
import com.example.LolAPI.repository.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ChampionRepository championRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Champion aatrox = new Champion("Aatrox", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender", 0, 24.384, 0.651, 60.376, 537.8);
        championRepository.save(aatrox);

        Champion ahri = new Champion("Ahri", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush", 418, 20.88, 0.668, 53.04, 526);
        championRepository.save(ahri);

        Champion akali = new Champion("Akali", "The Rogue Assassin", "Assassin", "Assassin's Mark", "Five Point Strike", "Twilight Shroud", "Shuriken Flip", "Perfect Execution", 0, 23, 0.625, 62.4, 575);
        championRepository.save(akali);

        Champion alistar = new Champion("Alistar", "The Minotaur", "Tank", "Triumphant Roar", "Pulverize", "Headbutt", "Trample", "Unbreakable Will", 0, 44, 0.625, 62, 600);
        championRepository.save(alistar);

        Champion amumu = new Champion("Amumu", "The Sad Mummy", "Tank", "Cursed Touch", "Bandage Toss", "Despair", "Tantrum", "Curse Of the Sad Mummy", 287.2, 33, 0.638, 53.58, 613.12);
        championRepository.save(amumu);

        Champion anivia = new Champion("Anivia", "The Cryophoenix", "Mage", "Rebirth", "Flash Frost", "Crystallize", "Frost Bite", "Glacial Storm", 495, 21.22, 0.625, 51.376, 480);
        championRepository.save(anivia);

        Champion annie = new Champion("Annie", "The Dark Child", "Mage", "Pyromania", "Disintegrate", "Incinerate", "Molten Shield", "Summon: Timbers", 418, 19.22, 0.579, 50.41, 524);
        championRepository.save(annie);

        Champion aphelios = new Champion("Aphelios", "The Weapon Of The Faithful", "Support", "The Hitman and The Seer", "Weapons Of The Faithful", "Phase", "N/A", "Moonlight Vigil", 348, 28, 0.64, 57, 530);
        championRepository.save(aphelios);

        Champion ashe = new Champion("Ashe", "The Frost Archer", "Support", "Frost Shot", "Ranger's Focus", "Volley", "Hawkshot", "Enchanted Crystal Arrow", 280, 26, 0.658, 61, 570);
        championRepository.save(ashe);

        Champion aurelionSol = new Champion("Aurelion Sol", "The Star Forger", "Mage", "Center of The Universe", "Starsurge", "Celestial Expansion", "Comet of Legend", "Voice of Light", 350, 19, 0.625, 57, 575);
        championRepository.save(aurelionSol);

        Champion azir = new Champion("Azir", "The Emperor of The Sands", "Mage", "Shurima's Legacy", "Conquering Sands", "Arise!", "Shifting Sands", "Emperor's Divide", 480, 19.04, 0.625, 52, 552);
        championRepository.save(azir);

        Champion bard = new Champion("Bard", "The Wandering Caretaker", "Mage", "Traveler's Call", "Cosmic Binding", "Caretaker's Shrine", "Magical Journey", "Tempered Fate", 350, 34, 0.625, 52, 575);
        championRepository.save(bard);

        Champion blitzcrank = new Champion("Blitzcrank", "The Great Steam Golem", "Fighter", "Mana Barrier", "Rocket Grab", "Overdrive", "Power Fist", "Static Field", 267.2, 37, 0.625, 61.54, 582.6);
        championRepository.save(blitzcrank);

        Champion brand = new Champion("Brand", "The Burning Vengeance", "Mage", "Blaze", "Sear", "Pillar of Flame", "Conflagration", "Pyroclasm", 496, 21.88, 0.625, 57.04, 519.68);
        championRepository.save(brand);

        Champion braum = new Champion("Braum", "The Heart of the Freljord", "Tank", "Concussive Blows", "Winter's Bite", "Stand Behind Me", "Unbreakable", "Glacial Fissure", 310.6, 47, 0.644, 55.376, 540);
        championRepository.save(braum);

        Champion caitlyn = new Champion("Caitlyn", "The Sheriff of Piltover", "Marksman", "Headshot", "Piltover Peacemaker", "Yordle Snap Trap", "90 Caliber Net", "Ace in The Hole", 313.7, 28, 0.568, 62, 510);
        championRepository.save(caitlyn);

        Champion camille = new Champion("Camille", "The Steel Shadow", "Fighter", "Adaptive Defenses", "Precision Protocol", "Tactical Sweep", "Hookshot", "The Hextech Ultimatum", 338.8, 35, 0.644, 68, 575.6);
        championRepository.save(camille);

        Champion cassiopeia = new Champion("Cassiopeia", "The Serpent's Embrace", "Mage", "Serpentine Grace", "Noxious Blast", "Miasma", "Twin Fang", "Petrifying Gaze", 350, 18, 0.647, 53, 560);
        championRepository.save(cassiopeia);

        Champion chogath = new Champion("Cho'gath", "The Terror of The Void", "Mage", "Carnivore", "Rupture", "Feral Scream", "Vorpal Strikes", "Feast", 272.2, 38, 0.625, 69, 574.4);
        championRepository.save(chogath);

        Champion corki = new Champion("Corki", "The Daring Bombardier", "Marksman", "Hextech Munitions", "Phosphorus Bomb", "Valkrye", "Gatling Gun", "Missile Barrage", 350.16, 28, 0.638, 55, 518);
        championRepository.save(corki);

        Champion darius = new Champion("Darius", "The Hand of Noxus", "Fighter", "Hemorrhage", "Decimate", "Crippling Strike", "Apprehend", "Noxian Guillotine", 263, 39, 0.625, 64, 582.24);
        championRepository.save(darius);

        Champion diana = new Champion("Diana", "Scorn of The Moon", "Mage", "Moonsilver Blade", "Crescent Strike", "Pale Cascade", "Lunar Rush", "Moonfall", 375, 31, 0.625, 57, 570);
        championRepository.save(diana);

        Champion drMundo = new Champion("Dr Mundo", "The Madman of Zaun", "Fighter", "Adrenaline Rush", "Infected Cleaver", "Burning Agony", "Masochism", "Sadism", 0, 36, 0.625, 61.27, 582.52);
        championRepository.save(drMundo);

        Champion draven = new Champion("Draven", "The Glorious Executioner", "Marksman", "League of Draven", "Spinning Axe", "Blood Rush", "Stand Aside", "Whirling Death", 360.56, 29, 0.679, 60, 605);
        championRepository.save(draven);

        Champion ekko = new Champion("Ekko", "The Boy Who Shattered Time", "Fighter", "Z-Drive Resonance", "Timewinder", "Parallel Convergence", "Phase Dive", "Chronobreak", 280, 32, 0.625, 58, 585);
        championRepository.save(ekko);

        Champion elise = new Champion("Elise", "The Spider Queen", "Mage", "Spider Queen", "Neurotoxin/Venomous Bite", "Volatile Spiderling/Skittering Frenzy", "Cocoon/Rappel", "Spider Form/Human Form", 324, 27, 0.625, 55, 534);
        championRepository.save(elise);

        Champion evelynn = new Champion("Evelynn", "Agony's Embrace", "Mage", "Demon Shade", "Hate Spike", "Allure", "Whiplash", "Last Caress", 315.6, 37, 0.667, 61, 572);
        championRepository.save(evelynn);

        Champion ezreal = new Champion("Ezreal", "The Prodigal Explorer", "Mage", "Rising Spell Force", "Mystic Shot", "Essence Flux", "Arcane Shift", "Trueshot Barrage", 375, 22, 0.625, 60, 530);
        championRepository.save(ezreal);

        Champion fiddlesticks = new Champion("Fiddlesticks", "The Ancient Fear", "Mage", "A Harmless Scarecrow", "Terrify", "Bountiful Harvest", "Reap", "Crowstorm", 500, 34, 0.625, 55.36, 580.4);
        championRepository.save(fiddlesticks);

        Champion fiora = new Champion("Fiora", "The Grand Duelist", "Assassin", "Duelist's Dance", "Lunge", "Riposte", "Bladework", "Grand Challenge", 300, 33, 0.69, 68, 550);
        championRepository.save(fiora);

        Champion fizz = new Champion("Fizz", "The Tidal Trickster", "Fighter", "Nimble Fighter", "Urchin Strike", "Seastone Trident", "Playful/Trickster", "Chum the Waters", 317.2, 22.412, 0.658, 58.04, 570);
        championRepository.save(fizz);

        Champion galio = new Champion("Galio", "The Colossus", "Mage", "Colossal Smash", "Winds of War", "Shield of Durand", "Justice Punch", "Hero's Entrance", 500, 24, 0.625, 59, 562);
        championRepository.save(galio);

        Champion gangplank = new Champion("Gangplnk", "The Saltwater Scourge", "Fighter", "Trial by Fire", "Parrrley", "Remove Scurvy", "Powder Keg", "Cannon Barrage", 282, 35, 0.69, 64, 540);
        championRepository.save(gangplank);

        Champion garen = new Champion("Garen", "The Might of Demacia", "Fighter", "Perserverance", "Decisive Strike", "Courage", "Judgement", "Demacian Justice", 0, 36, 0.625, 66, 620);
        championRepository.save(garen);

        Champion gnar = new Champion("Gnar", "The Missing Link", "Fighter", "Rage Gene", "Boomerang Throw", "Hyper", "Hop", "GNAR!", 0, 32/35.5, 0.625, 59/65, 510/610);
        championRepository.save(gnar);

        Champion gragas = new Champion("Gragas", "The Rable Rouser", "Fighter", "Happy Hour", "Barrel Roll", "Drunken Rage", "Body Slam", "Explosive Cask", 400, 35, (int) 0.625, 64, 600);
        championRepository.save(gragas);

        Champion graves = new Champion("Graves", "The Outlaw", "Marksman", "New Destiny", "End of The Line", "Smoke Screen", "Quickdraw", "Collateral Damage", 325, 33, 0.481, 68, 555);
        championRepository.save(graves);

        Champion hecarim = new Champion("Hecarim", "The Shadow of War", "Fighter", "Warpath", "Rampage", "Spirit of Dread", "Devastating Charge", "Onslaught of Shadows", 277.2, 36, 0.67, 66, 580);
        championRepository.save(hecarim);

        Champion heimerdinger = new Champion("Heimerdinger", "The Revered Inventor", "Support", "Hextech Affinity", "H-28G Evolution Turret", "Hextech Micro-Rockets", "CH-2 Electron Storm Grenade", "UPGRADE!!!", 385, 19.04, 0.625, 55.536, 488);
        championRepository.save(heimerdinger);

        Champion illaoi = new Champion("Illaoi", "The Kraken Priestess", "Fighter", "Prophet of an Elder God", "Tentacle Smash", "Harsh Lesson", "Test of Spirit", "Leap of Faith", 300, 35, 0.571, 68, 585.6);
        championRepository.save(illaoi);

        Champion irelia = new Champion("Irelia", "The Blade Dancer", "Fighter", "Ionan Fervor", "Bladesurge", "Defiant Dance", "Flawless Duet", "Vanguard's Edge", 350, 34, 0.625, 63, 580);
        championRepository.save(irelia);

        Champion ivern = new Champion("Ivern", "The Green Father", "Mage", "Friend of the Forest", "Rootcaller", "Brushmaker", "Triggerseed", "Daisy!", 450, 27, 0.644, 50, 585);
        championRepository.save(ivern);

        Champion janna = new Champion("Janna", "The Storm's Fury", "Mage", "Tailwind", "Howling Gate", "Zephyr", "Eye Of The Storm", "Monsoon", 350, 28, 0.625, 46, 500);
        championRepository.save(janna);

        Champion jarvanIv = new Champion("Jarvan Iv", "The Exemplar of Demacia", "Fighter", "Martial Cadence", "Dragon Strike", "Golden Aegis", "Demacian Standard", "Cataclysm", 300, 34, 0.658, 64, 570);
        championRepository.save(jarvanIv);

        Champion jax = new Champion("Jax", "The Grandmaster at Arms", "Fighter", "Relentless Assault", "Leap Strike", "Empower", "Counter Strike", "Grandmaster's Might", 338.8, 36, 0.638, 68, 592.8);
        championRepository.save(jax);

        Champion jayce = new Champion("Jayce", "The Defender of Tomorrow", "Fighter", "Hextech Capacitor", "To the Skies!/Shock Blast", "Lightning Field/Hyper Charge", "Thundering Blow/Acceleration Gate", "Transform: Mercury Cannon/Transform: Mercury Hammer", 375, 27, 0.658, 54, 560);
        championRepository.save(jayce);

        Champion jhin = new Champion("Jhin", "The Virtuoso", "Assassin", "Whisper", "Dancing Grenade", "Deadly Flourish", "Captive Audience", "Curtain Call", 300, 24, 0.625, 59, 585);
        championRepository.save(jhin);

        Champion jinx = new Champion("Jinx", "The Loose Cannon", "Marksman", "Get Excited!", "Switcheroo!", "Zap!", "Flame Chompers!", "Super Mega Death Rocket!", 245, 28, 0.625, 57, 610);
        championRepository.save(jinx);

        Champion kaisa = new Champion("Kai'sa", "Daughter of The Void", "Marksman", "Second Skin", "Icathian Rain", "Void Seeker", "Supercharge", "Killer Instinct", 344.88, 28, 0.644, 59, 600);
        championRepository.save(kaisa);

        Champion kalista = new Champion("Kalista", "The Spear of Vengeance", "Marksman", "Martial Poise", "Pierce", "Sentinel", "Rend", "Fate's Call", 231.8, 21, 0.694, 67, 534);
        championRepository.save(kalista);

        Champion karma = new Champion("Karma", "The Enlightened One", "Mage", "Gathering Fire", "Inner Flame", "Focused Resolve", "Inspired", "Mantra", 374, 26, 0.625, 53.544, 534);
        championRepository.save(karma);

        Champion karthus = new Champion("Karthus", "The Deathslinger", "Mage", "Death Defied", "Lay Waste", "Wall of Pain", "Defile", "Requiem", 467, 20.88, 0.625, 45.66, 528);
        championRepository.save(karthus);

        Champion kassadin = new Champion("Kassadin", "The Void Walker", "Mage", "Void Stone", "Null Sphere", "Nether Blade", "Force Pulse", "Riftwalk", 397.6, 19, 0.64, 58.852, 576);
        championRepository.save(kassadin);

        Champion katarina = new Champion("Katarina", "The Sinister Blade", "Mage", "Voracity", "Bouncing Blades", "Preparation", "Shunpo", "Death Lotus", 0, 27.88, 0.658, 58, 602);
        championRepository.save(katarina);

        Champion kayle = new Champion("Kayle", "The Righteous", "Fighter", "Divine Ascent", "Radiant Blast", "Celestial Blessing", "Starfire Spellblade", "Divine Judgement", 330, 26, 0.667, 50, 600);
        championRepository.save(kayle);

        Champion kayn = new Champion("Kayn", "The Shadow Reaper", "Fighter", "The Darkin Scythe", "Reaping Slash", "Blade's Reach", "Shadow Step", "Umbral Trespass", 410, 38, 0.669, 68, 585);
        championRepository.save(kayn);

        Champion kennen = new Champion("Kennen", "The Heart of the Tempest", "Mage", "Mark of the Storm", "Thundering Shuriken", "Electrical Surge", "Lightening Dash", "Slicing Maelstrom", 0, 29, 0.625, 48, 541);
        championRepository.save(kennen);

        Champion khazix = new Champion("Kha'zix", "The Voidreaver", "Fighter", "Unseen Threat", "Taste Their Fear", "Void Spike", "Leap", "Void Assault", 327.2, 36, 0.668, 63, 572.8);
        championRepository.save(khazix);

        Champion kindred = new Champion("Kindred", "The Eternal Hunters", "Marksman", "Mark of the Kindred", "Dance of Arrows", "Wolf's Frenzy", "Mounting Dread", "Lamb's Respite", 300, 29, 0.625, 65, 540);
        championRepository.save(kindred);

        Champion kled = new Champion("Kled", "The Cantankerous Cavalier", "Fighter", "Skaarl, the Cowardly Lizard", "Bear Trap on a Rope/Pocket Pistol", "Infernal Chains", "Umbral Dash", "World Ender", 0, 35, 0.625, 65, 340/400);
        championRepository.save(kled);

        Champion kogmaw = new Champion("Kog'maw", "The Mouth of the Abyss", "Mage", "Icathian Surprise", "Caustic Spike", "Bio-Arcane Barrage", "Void Ooze", "Living Artillery", 325, 24, 0.665, 61, 565);
        championRepository.save(kogmaw);

        Champion leblanc = new Champion("Leblanc", "The Deceiver", "Mage", "Mirror Image", "Sigil of Malice", "Distortion", "Ethereal Chains", "Mimic", 334, 21.88, 0.625, 54.88, 528);
        championRepository.save(leblanc);

        Champion leeSin = new Champion("Lee Sin", "The Blind Monk", "Fighter", "Flurry", "Sonic Wave/Resonating Strike", "Safeguard/Iron Will", "Tempest/Cripple", "Dragon's Rage", 0, 33, 0.651, 70, 575);
        championRepository.save(leeSin);

        Champion leona = new Champion("Leona", "The Radiant Dawn", "Tank", "Sunlight", "Shield of Daybreak", "Eclipse", "Zeneth Blade", "Solar Flare", 302.2, 47, 0.625, 60.04, 576.16);
        championRepository.save(leona);

        Champion lillia = new Champion("Lillia", "the Bashful Bloom", "Skirmisher", "Dream-Laden Bough", "Booming Blows", "Watch Out! Eep!", "Swirlseed", "Lifting Lullaby", 410, 20, 0.625, 61, 580);
        championRepository.save(lillia);

        Champion lissandra = new Champion("Lissandra", "The Ice Witch", "Mage", "Iceborn Subjugation", "Ice Shard", "Ring of Forest", "Glacial Path", "Frozen Tomb", 475, 20.216, 0.625, 53, 550);
        championRepository.save(lissandra);

        Champion lucian = new Champion("Lucian", "The Purifier", "Marksman", "Lightslinger", "Piercing Light", "Ardent Blaze", "Relentless Pursuit", "The Culling", 348.88, 28, 0.638, 61, 571);
        championRepository.save(lucian);

        Champion lulu = new Champion("Lulu", "The Fae Sorceress", "Mage", "Pix, Faerie Companion", "Glitterlance", "Whimsy", "Help, Pix!", "Wild Growth", 350, 29, 0.625, 47, 525);
        championRepository.save(lulu);

        Champion lux = new Champion("Lux", "The Lady of Luminosity", "Mage", "Illumination", "Light Binding", "Prismatic Barrier", "Lucent Singularity", "Final Spark", 480, 18.72, 0.625, 53.54, 490);
        championRepository.save(lux);

        Champion malphite = new Champion("Malphite", "The Shard of The Monolith", "Fighter", "Granite Shield", "Seismic Shard", "Thunderclap", "Ground Slam", "Unstoppable Force", 282.2, 37, 0.638, 61.97, 574.2);
        championRepository.save(malphite);

        Champion malzahar = new Champion("Malzahar", "The Prophet of The Void", "Assassin", "Void Shift", "Call of The Void", "Void Swarm", "Malefic Visions", "Nether Grasp", 375, 18, 0.625, 55, 537);
        championRepository.save(malzahar);

        Champion maokai = new Champion("Maokai", "The Twisted Treant", "Mage", "Sap Magic", "Bramble Smash", "Twisted Advance", "Sapling Toss", "Nature's Grasp", 375, 39, 0.694, 63.54, 565);
        championRepository.save(maokai);

        Champion masterYi = new Champion("Master Yi", "The Wuju Bladesman", "Fighter", "Double Strike", "Alpha Strike", "Meditate", "Wuju Style", "Highlander", 250.66, 33, 0.679, 66, 598.56);
        championRepository.save(masterYi);

        Champion missFortune = new Champion("Miss Fortune", "The Bounty Hunter", "Marksman", "Love Tap", "Double Up", "Strut", "Make It Rain", "Bullet Time", 325.84, 28, 0.656, 50, 570);
        championRepository.save(missFortune);

        Champion mordekaiser = new Champion("Mordekaiser", "The Iron Revenant", "Fighter", "Darkness Rise", "Obliterate", "Indestructible", "Death's Grasp", "Realm of Death", 0, 37, 0.625, 61, 575);
        championRepository.save(mordekaiser);

        Champion morgana = new Champion("Morgana", "The Fallen", "Mage", "Soul Siphon", "Dark Binding", "Tormented Shadow", "Black Shield", "Soul Shackles", 340.8, 25.384, 0.625, 55.46, 559.48);
        championRepository.save(morgana);

        Champion nami = new Champion("Nami", "The Tidecaller", "Mage", "Surging Tides", "Aqua Prison", "Ebb and Flow", "Tidecaller's Blessing", "Tidal Wave", 365, 29, 0.644, 51.208, 475);
        championRepository.save(nami);

        Champion nasus = new Champion("Nasus", "The Curator of the Sands", "Fighter", "Soul Eater", "Siphoning Strike", "Wither", "Spirit Fire", "Fury of the Sands", 325.6, 34, 0.638, 67, 561.2);
        championRepository.save(nasus);

        Champion nautilus = new Champion("Nautilus", "The Titan of The Depths", "Fighter", "Staggering Blow", "Dredge Line", "Titan's Wrath", "Riptide", "Depth Charge", 400, 35.46, 0.613, 61, 576.48);
        championRepository.save(nautilus);

        Champion neeko = new Champion("Neeko", "The Curious Chameleon", "Mage", "Inherent Glamour", "Blooming Burst", "Shapeshifter", "Tangle-Barbs", "Pop Blossom", 450, 21, 0.625, 52, 540);
        championRepository.save(neeko);

        Champion nidalee = new Champion("Nidalee", "The Bestial Huntress", "Fighter", "Prowl", "Javelin Toss", "Bushwhack", "Primal Surge", "Aspect of the Cougar", 295.6, 28, 0.638, 61, 545);
        championRepository.save(nidalee);

        Champion nocturne = new Champion("Nocturne", "The Eternal Nightmare", "Fighter", "Umbra Blades", "Duskbringer", "Shroud of Darkness", "Unspeakable Horror", "Paranoia", 275, 38, 0.668, 62, 585);
        championRepository.save(nocturne);

        Champion nunuAndWillump = new Champion("Nunu & Willump", "The Boy and his Yeti", "Fighter", "Call of the Freljord", "Consume", "Biggest Snowball Ever!", "Snowball Barrage", "Absolute Zero", 280, 32, 0.625, 61, 570);
        championRepository.save(nunuAndWillump);

        Champion olaf = new Champion("Olaf", "The Berserker", "Fighter", "Berserker Rage", "Undertow", "Vicious Strikes", "Reckless Swing", "Ragnarok", 315.6, 35, 0.694, 68, 597.24);
        championRepository.save(olaf);

        Champion orianna = new Champion("Orianna", "The Lady of Clockwork", "Mage", "Clockwork Windup", "Command: Attack", "Command: Dissonance", "Command: Protect", "Command: Shockwave", 418, 17.04, 0.658, 40.368, 530);
        championRepository.save(orianna);

        Champion ornn = new Champion("Ornn", "The Fire Below the Mountain", "Tank", "Living Forge", "Volcanic Rupture", "Bellows Breath", "Searing Charge", "Call of the Forge God", 340.6, 36, 0.625, 69, 590);
        championRepository.save(ornn);

        Champion pantheon = new Champion("Pantheon", "The Unbreakable Spear", "Fighter", "Mortal Will", "Comet Spear", "Shield Vault", "Aegis Assault", "Grand Starfall", 317.12, 40, 0.644, 64, 580);
        championRepository.save(pantheon);

        Champion poppy = new Champion("Poppy", "Keeper of the Hammer", "Fighter", "Iron Ambassador", "Hammer Shock", "Steadfast Presence", "Heroic Charge", "Keeper's Verdict", 280, 38, 0.625, 64, 540);
        championRepository.save(poppy);

        Champion pyke = new Champion("Pyke", "The Bloodharbor Ripper", "Assassin", "Gift of the Drowned Ones", "Bone Skewer", "Ghostwater Dive", "Phantom Undertow", "Death from Below", 415, 45, 0.667, 62, 600);
        championRepository.save(pyke);

        Champion qiyana = new Champion("Qiyana", "Empress of the Elements", "Assassin", "Royal Privilege", "Edge of Ixtal", "Terrashape", "Audacity", "Supreme Display of Talent", 320, 28, 0.625, 64, 590);
        championRepository.save(qiyana);

        Champion quinn = new Champion("Quinn", "Demacia's Wings", "Fighter", "Harrier", "Blinding Assault", "Heightened Senses", "Vault", "Behind Enemy Lines/Skystrike", 268.8, 28, 0.668, 59, 532.8);
        championRepository.save(quinn);

        Champion rakan = new Champion("Rakan", "the Charmer", "Mage", "Fey Feathers", "Gleaming Quill", "Grand Entrance", "Battle Dance", "The Quickness", 315, 32, 0.635, 62, 540);
        championRepository.save(rakan);

        Champion rammus = new Champion("Rammus", "The Armordillo", "Fighter", "Spiked Shell", "Powerball", "Defensive Ball Curl", "Frenzying Taunt", "Tremors", 310.44, 36, 0.656, 55.88, 564.48);
        championRepository.save(rammus);

        Champion reksai = new Champion("Rek'Sai", "The Void Burrower", "Fighter", "Fury of the Xer'Sai", "Queen's Wrath/Prey Seeker", "Burrow/Unburrow", "Furious Bite/Tunnel", "Void Rush", 0, 36, 0.667, 64, 570);
        championRepository.save(reksai);

        Champion renekton = new Champion("Renekton", "The Butcherer of the Sands", "Fighter", "Reign of Anger", "Cull the Meek", "Ruthless Predator", "Slice and Dice", "Dominus", 0, 35, 0.665, 69, 575);
        championRepository.save(renekton);

        Champion rengar = new Champion("Rengar", "The Pridestalker", "Fighter", "Unseen Predator", "Savagery", "Battle Roar", "Bola Strike", "Thrill of the Hunt", 0, 34, 0.666, 68, 585);
        championRepository.save(rengar);

        Champion riven = new Champion("Riven", "The Exile", "Fighter", "Runic Blade", "Broken Wings", "Ki Burst", "Valor", "Blade of the Exile/Wind Slash", 0, 33, 0.625, 64, 560);
        championRepository.save(riven);

        Champion rumble = new Champion("Rumble", "The Mechanized Menace", "Fighter", "Junkyard Titan", "Flamespitter", "Scrap Shield", "Electro Harpoon", "The Equalizer", 0, 31, 0.644, 61, 589);
        championRepository.save(rumble);

        Champion ryse = new Champion("Ryse", "The Rune Mage", "Mage", "Arcane Mastery", "Overload", "Rune Prison", "Spell Flux", "Realm Warp", 300, 22, 0.625, 58, 575);
        championRepository.save(ryse);

        Champion samira = new Champion("Samira", "The Desert Rose", "Marksman", "Daredevil Impulse", "Flair", "Blade Whirl", "Wild Rush", "Inferno Trigger", 348.88, 28, 0.658, 59, 600);
        championRepository.save(samira);

        Champion sejuani = new Champion("Sejuani", "Fury of the North", "Tank", "Fury of the North", "Arctic Assault", "Winter's Wrath", "Permafrost", "Glacial Prison", 400, 34, 0.625, 66, 560);
        championRepository.save(sejuani);

        Champion senna = new Champion("Senna", "The Redeemer", "Support", "Absolution", "Piercing Darkness", "Last Embrace", "Curse of the Black Mist", "Dawning Shadow", 350, 28, 0.2, 50, 520);
        championRepository.save(senna);

        Champion seraphine = new Champion("Seraphine", "The Starry-Eyed Songstress", "Mage", "Echo", "High Note", "Surround Sound", "Beat Drop", "Encore", 350, 28, 0.2, 50, 520);
        championRepository.save(seraphine);

        Champion sett = new Champion("Sett", "The Boss", "Fighter", "Pit Grit", "Knuckle Down", "Haymaker", "Facebreaker", "The Show Stopper", 0, 33, 0.625, 60, 600);
        championRepository.save(sett);

        Champion shaco = new Champion("Shaco", "The Demon Jester", "Assassin", "Backstab", "Deceive", "Jack In The Box", "Two-Shiv Poison", "Hallucinate", 297.2, 30, 0.694, 63, 587);
        championRepository.save(shaco);

        Champion shen = new Champion("Shen", "The Eye of Twilight", "Fighter", "Ki Barrier", "Twilight Assault", "Spirit's Refuge", "Shadow Dash", "Stand United", 0, 34, 0.651, 60, 540);
        championRepository.save(shen);

        Champion shyvana = new Champion("Shyvana", "The Half-Dragon", "Fighter", "Fury of the Dragonborn", "Twin Bite", "Burnout", "Flame Breath", "Dragon's Descent", 0, 38, 0.658, 66, 595);
        championRepository.save(shyvana);

        Champion singed = new Champion("Singed", "The Mad Chemist", "Tank", "Noxious Slipstream", "Poison Trail", "Mega Adhesive", "Fling", "Insanity Potion", 330, 34, 0.613, 63, 580);
        championRepository.save(singed);

        Champion sion = new Champion("Sion", "The Undead Juggernaut", "Tank", "Glory in Death/Death Surge", "Decimating Smash", "Soul Furnace", "Roar of the Slayer", "Unstoppable Onslaught", 325.6, 32, 0.679, 68, 542.64);
        championRepository.save(sion);

        Champion sivir = new Champion("Sivir", "The Battle Mistress", "Marksman", "Fleet of Foot", "Boomerang Blade", "Ricochet", "Spell Shield", "On the Hunt", 284, 26, 0.625, 63, 532);
        championRepository.save(sivir);

        Champion skarner = new Champion("Skarner", "The Crystal Vanguard", "Fighter", "Crystal Spires", "Crystal Slash", "Crystalline Exoskeleton", "Fracture", "Impale", 320, 38, 0.625, 65, 601.28);
        championRepository.save(skarner);

        Champion sona = new Champion("Sona", "The Maven of The Strings", "Mage", "Power Cord", "Hymn of Valor", "Aria of Perserverance", "Song of Celerity", "Crescendo", 340.6, 28, 0.644, 49, 482.36);
        championRepository.save(sona);

        Champion soraka = new Champion("Soraka", "The Starchild", "Mage", "Salvation", "Starcall", "Astral Infusion", "Equinox", "Wish", 425, 32, 0.625, 50, 535);
        championRepository.save(soraka);

        Champion swain = new Champion("Swain", "The Master Tactician", "Mage", "Ravenous Flock", "Death's Hand", "Vision of Empire", "Nevermore", "Demonic Ascension", 468, 22.72, 0.625, 58, 525);
        championRepository.save(swain);

        Champion sylas = new Champion("Sylas", "The Unshackled", "Mage", "Petricite Burst", "Chain Lash", "Kingslayer", "Abscond/Abduct", "Hijack", 280, 27, 0.645, 61, 525);
        championRepository.save(sylas);

        Champion syndra = new Champion("Syndra", "The Dark Sovereign", "Mage", "Transcendent", "Dark Sphere", "Force of Will", "Scatter the Weak", "Unleashed Power", 480, 24.712, 0.625, 53.872, 523);
        championRepository.save(syndra);

        Champion tahmKench = new Champion("Tahm Kench", "The River King", "Tank", "An Acquired Taste", "Tounge Lash", "Devour", "Thick Skin", "Abyssal Voyage", 325, 47, 0.658, 56, 540);
        championRepository.save(tahmKench);

        Champion taliyah = new Champion("Taliyah", "the Stoneweaver", "Mage", "Rock Surfing", "Threaded Volley", "Seismic Shove", "Unraveled Earth", "Weaver's Wall", 425, 20, 0.625, 58, 532);
        championRepository.save(taliyah);

        Champion talon = new Champion("Talon", "The Blade's Shadow", "Assassin", "Blade's End", "Noxian Diplomacy", "Rake", "Assassin's Path", "Shadow Assault", 377.2, 30, 0.625, 68, 588);
        championRepository.save(talon);

        Champion taric = new Champion("Taric", "The Shield of Valoran", "Fighter", "Bravado", "Starlight's Touch", "Bastion", "Dazzle", "Cosmic Radiance", 300, 40, 0.625, 55, 575);
        championRepository.save(taric);

        Champion teemo = new Champion("Teemo", "The Swift Scout", "Marksman", "Guerrilla Warfare", "Blinding Dart", "Move Quick", "Toxic Shot", "Noxious Trap", 334, 24.3, 0.69, 54, 528);
        championRepository.save(teemo);

        Champion thresh = new Champion("Thresh", "The Chain Warden", "Fighter", "Damnation", "Death Sentence", "Dark Passage", "Flay", "The Box", 273.92, 28, 0.635, 56, 560.52);
        championRepository.save(thresh);

        Champion tristana = new Champion("Tristana", "The Yordle Gunner", "Assassin", "Draw a Beard", "Rapid Fire", "Rocket Jump", "Explosive Charge", "Buster Shot", 250, 26, 0.679, 61, 559);
        championRepository.save(tristana);

        Champion trundle = new Champion("Trundle", "The Troll King", "Fighter", "King's Tribute", "Chomp", "Frozen Domain", "Pillar of Ice", "Subjugate", 281, 37, 0.67, 68, 616);
        championRepository.save(trundle);

        Champion tryndamere = new Champion("Tryndamere", "The Barbarian King", "Fighter", "Battle Fury", "Bloodlust", "Mocking Shout", "Spinning Slash", "Undying Rage", 0, 33, 0.67, 69, 625.64);
        championRepository.save(tryndamere);

        Champion twistedFate = new Champion("Twisted Fate", "The Card Master", "Mage", "Loaded Dice", "Wild Cards", "Pick a Card", "Stacked Deck", "Destiny/Gate", 333, 21, 0.651, 52, 534);
        championRepository.save(twistedFate);

        Champion twitch = new Champion("Twitch", "The Plague Rat", "Assassin", "Deadly Venom", "Ambush", "Venom Cask", "Contaminate", "Spray and Pray", 287.2, 27, 0.679, 59, 612);
        championRepository.save(twitch);

        Champion udyr = new Champion("Udyr", "The Spirit Walker", "Fighter", "Monkey's Agility", "Tiger Stance", "Turtle Stance", "Bear Stance", "Phoenix Stance", 271, 34, 0.658, 66, 594);
        championRepository.save(udyr);

        Champion urgot = new Champion("Urgot", "The Dreadnought", "Fighter", "Echoing Flames", "Corrosive Charge", "Purge", "Distain", "Fear Beyond Death", 340, 36, 0.625, 63, 585);
        championRepository.save(urgot);

        Champion varius = new Champion("Varius", "The Arrow of Retribution", "Mage", "Living Vengeance", "Piercing Arrow", "Blighted Quiver", "Hail of Arrows", "Chain of Corruption", 360, 27, 0.658, 61, 530);
        championRepository.save(varius);

        Champion vayne = new Champion("Vayne", "The Night Hunter", "Assassin", "Night Hunter", "Tumble", "Silver Bolts", "Condemn", "Final Hour", 231.8, 23, 0.658, 60, 515);
        championRepository.save(vayne);

        Champion veigar = new Champion("Veigar", "The Tiny Master of Evil", "Mage", "Phenomenal Evil Power", "Baleful Strike", "Dark Matter", "Event Horizon", "Primordal Burst", 490, 23, 0.625, 52, 505);
        championRepository.save(veigar);

        Champion velkoz = new Champion("Vel'Koz", "The Eye of The Void", "Mage", "Organic Deconstruction", "Plasma Fission", "Void Rift", "Tectonic Disruption", "Lifeform Disintegration Ray", 469, 21.88, 0.625, 54.938, 520);
        championRepository.save(velkoz);

        Champion vi = new Champion("Vi", "The Piltover Enforcer", "Fighter", "Blast Shield", "Vault Breaker", "Denting Blows", "Excessive Force", "Assault and Battery", 295, 30, 0.644, 64, 585);
        championRepository.save(vi);

        Champion viktor = new Champion("Viktor", "The Machine Herald", "Mage", "Glorious Evolution", "Siphon Power", "Gravity Field", "Death Ray", "Chaos Storm", 405, 23, 0.658, 53, 530);
        championRepository.save(viktor);

        Champion vladimir = new Champion("Vladimir", "The Crimson Reaper", "Tank", "Crimson Pact", "Transfusion", "Sanguine Pool", "Tides of Blood", "Hemoplague", 0, 23, 0.658, 55, 537);
        championRepository.save(vladimir);

        Champion volibear = new Champion("Volibear", "The Relentless Storm", "Fighter", "The Relentless Storm", "Thundering Smash", "Frenzied Maul", "Sky Splitter", "Stormbringer", 350, 31, 0.625, 60, 580);
        championRepository.save(volibear);

        Champion warwick = new Champion("Warwick", "The Uncaged Wrath of Zaun", "Fighter", "Eternal Hunger", "Jaws of the Beast", "Blood Hunt", "Primal Howl", "Infinite Duress", 280, 33, 0.678, 63, 550);
        championRepository.save(warwick);

        Champion wukong = new Champion("Wukong", "The Monkey King", "Fighter", "Stone Skin", "Crushing Blow", "Warrior Trickster", "Nimbus Strike", "Cyclone", 300, 64, 0.658, 68, 540);
        championRepository.save(wukong);

        Champion xayah = new Champion("Xayah", "the Rebel", "Fighter", "Clean Cuts", "Double Daggers", "Deadly Plumage", "Bladecaller", "Featherstorm", 340, 25, 0.625, 60, 590);
        championRepository.save(xayah);

        Champion xerath = new Champion("Xerath", "The Magus Ascendant", "Mage", "Mana Surge", "Arcanopulse", "Eye of Destruction", "Shocking Orb", "Rite of the Arcane", 459, 21.88, 0.625, 54.7, 526);
        championRepository.save(xerath);

        Champion xinZhao = new Champion("Xin Zhao", "The Seneschal of Demacia", "Fighter", "Determination", "Three Talon Strike", "Wind Becomes Lightning", "Audacious Charge", "Crescent Guard", 273.8, 35, 0.645, 66, 570);
        championRepository.save(xinZhao);

        Champion yassuo = new Champion("Yassuo", "The Unforgiven", "Assassin", "Way of The Wanderer", "Steel Tempest", "Wind Wall", "Sweeping Blade", "Last Breath", 0, 30, 0.67, 60, 523);
        championRepository.save(yassuo);

        Champion yorick = new Champion("Yorick", "The Shepard of Souls", "Fighter", "Shepard of Souls", "Last Rites/Awakening", "Dark Procession", "Mourning Mist", "Eulogy of the Isles", 300, 39, 0.625, 62, 580);
        championRepository.save(yorick);

        Champion yone = new Champion("Yone", "The Unforgiven", "Assassin", "Shepard of Souls", "Mortal Steel", "Spirit Cleave", "Soul Unbound", "Fate Sealed", 0, 28, 0.625, 60, 550);
        championRepository.save(yone);

        Champion yummi = new Champion("Yummi", "The Magical Cat", "Mage", "Bop 'n' Block", "Prowling Projectile", "You and Me!", "Zoomies", "Final Chapter", 400, 25, 0.625, 55, 480);
        championRepository.save(yummi);

        Champion zac = new Champion("Zac", "The Secret Weapon", "Fighter", "Cell Division", "Stretching Strikes", "Unstable Matter", "Elastic Slingshot", "Let's Bounce!", 0, 33, 0.638, 60, 615);
        championRepository.save(zac);

        Champion zed = new Champion("Zed", "The Master of Shadows", "Fighter", "Contempt for the Weak", "Razor Shiruken", "Living Shadow", "Shadow Slash", "Death Mark", 0, 32, 0.651, 63, 584);
        championRepository.save(zed);

        Champion ziggs = new Champion("Ziggs", "The Hexplosives Expert", "Mage", "Short Fuse", "Bouncing Bomb", "Satchel Charge", "Hexplosive Minefield", "Mega Inferno Bomb", 480, 21.544, 0.656, 54.208, 536);
        championRepository.save(ziggs);

        Champion zilean = new Champion("Zylian", "The Chronokeeper", "Mage", "Time in a Bottle", "Time Bomb", "Rewind", "Time Warp", "Chrono Shift", 452, 24, 0.625, 51.64, 504);
        championRepository.save(zilean);

        Champion zoe = new Champion("Zoe", "The Aspect of Twilight", "Mage", "More Sparkles!", "Paddle Star", "Spell Thief", "Sleepy Trouble Bubble", "Portal Jump", 425, 20.8, 0.625, 58, 560);
        championRepository.save(zoe);

        Champion zyra = new Champion("Zyra", "Rise of the Thorns", "Mage", "Garden of Thorns", "Deadly Spines", "Rampant Growth", "Grasping Roots", "Stranglethorns", 418, 29, 0.625, 53.376, 504);
        championRepository.save(zyra);

    }
}
