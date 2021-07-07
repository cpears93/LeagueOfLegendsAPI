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
        Champion aatrox = new Champion("Aatrox", "The Darkin Blade", "Fighter", "Deathbringer Stance", "The Darkin Blade", "Infernal Chains", "Umbral Dash", "World Ender");
        championRepository.save(aatrox);

        Champion ahri = new Champion("Ahri", "The Nine Tailed Fox", "Mage", "Vastayan Grace", "Orb of Deception", "Fox-Fire", "Charm", "Spirit Rush");
        championRepository.save(ahri);

        Champion akali = new Champion("Akali", "The Rogue Assassin", "Assassin", "Assassin's Mark", "Five Point Strike", "Twilight Shroud", "Shuriken Flip", "Perfect Execution");
        championRepository.save(akali);

        Champion akshan = new Champion("Akshan", "x", "Assassin", "Dirty Fighting", "Avenging", "Going Rogue", "Heroic Swing", "Comeuppance");
        championRepository.save(akshan);

        Champion alistar = new Champion("Alistar", "The Minotaur", "Tank", "Triumphant Roar", "Pulverize", "Headbutt", "Trample", "Unbreakable Will");
        championRepository.save(alistar);

        Champion amumu = new Champion("Amumu", "The Sad Mummy", "Tank", "Cursed Touch", "Bandage Toss", "Despair", "Tantrum", "Curse Of the Sad Mummy");
        championRepository.save(amumu);

        Champion anivia = new Champion("Anivia", "The Cryophoenix", "Mage", "Rebirth", "Flash Frost", "Crystallize", "Frost Bite", "Glacial Storm");
        championRepository.save(anivia);

        Champion annie = new Champion("Annie", "The Dark Child", "Mage", "Pyromania", "Disintegrate", "Incinerate", "Molten Shield", "Summon: Timbers");
        championRepository.save(annie);

        Champion aphelios = new Champion("Aphelios", "The Weapon Of The Faithful", "Support", "The Hitman and The Seer", "Weapons Of The Faithful", "Phase", "N/A", "Moonlight Vigil");
        championRepository.save(aphelios);

        Champion ashe = new Champion("Ashe", "The Frost Archer", "Support", "Frost Shot", "Ranger's Focus", "Volley", "Hawkshot", "Enchanted Crystal Arrow");
        championRepository.save(ashe);

        Champion aurelionSol = new Champion("Aurelion Sol", "The Star Forger", "Mage", "Center of The Universe", "Starsurge", "Celestial Expansion", "Comet of Legend", "Voice of Light");
        championRepository.save(aurelionSol);

        Champion azir = new Champion("Azir", "The Emperor of The Sands", "Mage", "Shurima's Legacy", "Conquering Sands", "Arise!", "Shifting Sands", "Emperor's Divide");
        championRepository.save(azir);

        Champion bard = new Champion("Bard", "The Wandering Caretaker", "Mage", "Traveler's Call", "Cosmic Binding", "Caretaker's Shrine", "Magical Journey", "Tempered Fate");
        championRepository.save(bard);

        Champion blitzcrank = new Champion("Blitzcrank", "The Great Steam Golem", "Fighter", "Mana Barrier", "Rocket Grab", "Overdrive", "Power Fist", "Static Field");
        championRepository.save(blitzcrank);

        Champion brand = new Champion("Brand", "The Burning Vengeance", "Mage", "Blaze", "Sear", "Pillar of Flame", "Conflagration", "Pyroclasm");
        championRepository.save(brand);

        Champion braum = new Champion("Braum", "The Heart of the Freljord", "Tank", "Concussive Blows", "Winter's Bite", "Stand Behind Me", "Unbreakable", "Glacial Fissure");
        championRepository.save(braum);

        Champion caitlyn = new Champion("Caitlyn", "The Sheriff of Piltover", "Marksman", "Headshot", "Piltover Peacemaker", "Yordle Snap Trap", "90 Caliber Net", "Ace in The Hole");
        championRepository.save(caitlyn);

        Champion camille = new Champion("Camille", "The Steel Shadow", "Fighter", "Adaptive Defenses", "Precision Protocol", "Tactical Sweep", "Hookshot", "The Hextech Ultimatum");
        championRepository.save(camille);

        Champion cassiopeia = new Champion("Cassiopeia", "The Serpent's Embrace", "Mage", "Serpentine Grace", "Noxious Blast", "Miasma", "Twin Fang", "Petrifying Gaze");
        championRepository.save(cassiopeia);

        Champion chogath = new Champion("Cho'gath", "The Terror of The Void", "Mage", "Carnivore", "Rupture", "Feral Scream", "Vorpal Strikes", "Feast");
        championRepository.save(chogath);

        Champion corki = new Champion("Corki", "The Daring Bombardier", "Marksman", "Hextech Munitions", "Phosphorus Bomb", "Valkrye", "Gatling Gun", "Missile Barrage");
        championRepository.save(corki);

        Champion darius = new Champion("Darius", "The Hand of Noxus", "Fighter", "Hemorrhage", "Decimate", "Crippling Strike", "Apprehend", "Noxian Guillotine");
        championRepository.save(darius);

        Champion diana = new Champion("Diana", "Scorn of The Moon", "Mage", "Moonsilver Blade", "Crescent Strike", "Pale Cascade", "Lunar Rush", "Moonfall");
        championRepository.save(diana);

        Champion drMundo = new Champion("Dr Mundo", "The Madman of Zaun", "Fighter", "Adrenaline Rush", "Infected Cleaver", "Burning Agony", "Masochism", "Sadism");
        championRepository.save(drMundo);

        Champion draven = new Champion("Draven", "The Glorious Executioner", "Marksman", "League of Draven", "Spinning Axe", "Blood Rush", "Stand Aside", "Whirling Death");
        championRepository.save(draven);

        Champion ekko = new Champion("Ekko", "The Boy Who Shattered Time", "Fighter", "Z-Drive Resonance", "Timewinder", "Parallel Convergence", "Phase Dive", "Chronobreak");
        championRepository.save(ekko);

        Champion elise = new Champion("Elise", "The Spider Queen", "Mage", "Spider Queen", "Neurotoxin/Venomous Bite", "Volatile Spiderling/Skittering Frenzy", "Cocoon/Rappel", "Spider Form/Human Form");
        championRepository.save(elise);

        Champion evelynn = new Champion("Evelynn", "Agony's Embrace", "Mage", "Demon Shade", "Hate Spike", "Allure", "Whiplash", "Last Caress");
        championRepository.save(evelynn);

        Champion ezreal = new Champion("Ezreal", "The Prodigal Explorer", "Mage", "Rising Spell Force", "Mystic Shot", "Essence Flux", "Arcane Shift", "Trueshot Barrage");
        championRepository.save(ezreal);

        Champion fiddlesticks = new Champion("Fiddlesticks", "The Ancient Fear", "Mage", "A Harmless Scarecrow", "Terrify", "Bountiful Harvest", "Reap", "Crowstorm");
        championRepository.save(fiddlesticks);

        Champion fiora = new Champion("Fiora", "The Grand Duelist", "Assassin", "Duelist's Dance", "Lunge", "Riposte", "Bladework", "Grand Challenge");
        championRepository.save(fiora);

        Champion fizz = new Champion("Fizz", "The Tidal Trickster", "Fighter", "Nimble Fighter", "Urchin Strike", "Seastone Trident", "Playful/Trickster", "Chum the Waters");
        championRepository.save(fizz);

        Champion galio = new Champion("Galio", "The Colossus", "Mage", "Colossal Smash", "Winds of War", "Shield of Durand", "Justice Punch", "Hero's Entrance");
        championRepository.save(galio);

        Champion gangplank = new Champion("Gangplnk", "The Saltwater Scourge", "Fighter", "Trial by Fire", "Parrrley", "Remove Scurvy", "Powder Keg", "Cannon Barrage");
        championRepository.save(gangplank);

        Champion garen = new Champion("Garen", "The Might of Demacia", "Fighter", "Perserverance", "Decisive Strike", "Courage", "Judgement", "Demacian Justice");
        championRepository.save(garen);

        Champion gnar = new Champion("Gnar", "The Missing Link", "Fighter", "Rage Gene", "Boomerang Throw", "Hyper", "Hop", "GNAR!");
        championRepository.save(gnar);

        Champion gragas = new Champion("Gragas", "The Rable Rouser", "Fighter", "Happy Hour", "Barrel Roll", "Drunken Rage", "Body Slam", "Explosive Cask");
        championRepository.save(gragas);

        Champion graves = new Champion("Graves", "The Outlaw", "Marksman", "New Destiny", "End of The Line", "Smoke Screen", "Quickdraw", "Collateral Damage");
        championRepository.save(graves);

        Champion gwen = new Champion("Gwen", "The Outlaw", "Marksman", "Thousand Cuts", "Snip Snip!",
                "Hallowed Mist", "Skip 'n Slash", "Needlework");
        championRepository.save(gwen);

        Champion hecarim = new Champion("Hecarim", "The Shadow of War", "Fighter", "Warpath", "Rampage", "Spirit of Dread", "Devastating Charge", "Onslaught of Shadows");
        championRepository.save(hecarim);

        Champion heimerdinger = new Champion("Heimerdinger", "The Revered Inventor", "Support", "Hextech Affinity", "H-28G Evolution Turret", "Hextech Micro-Rockets", "CH-2 Electron Storm Grenade", "UPGRADE!!!");
        championRepository.save(heimerdinger);

        Champion illaoi = new Champion("Illaoi", "The Kraken Priestess", "Fighter", "Prophet of an Elder God", "Tentacle Smash", "Harsh Lesson", "Test of Spirit", "Leap of Faith");
        championRepository.save(illaoi);

        Champion irelia = new Champion("Irelia", "The Blade Dancer", "Fighter", "Ionan Fervor", "Bladesurge", "Defiant Dance", "Flawless Duet", "Vanguard's Edge");
        championRepository.save(irelia);

        Champion isolde = new Champion("Isolde", "Placeholder", "Placeholder", "Placeholder", "Placeholder", "Placeholder", "Placeholder", "Placeholder");
        championRepository.save(isolde);

        Champion ivern = new Champion("Ivern", "The Green Father", "Mage", "Friend of the Forest", "Rootcaller", "Brushmaker", "Triggerseed", "Daisy!");
        championRepository.save(ivern);

        Champion janna = new Champion("Janna", "The Storm's Fury", "Mage", "Tailwind", "Howling Gate", "Zephyr", "Eye Of The Storm", "Monsoon");
        championRepository.save(janna);

        Champion jarvanIv = new Champion("Jarvan Iv", "The Exemplar of Demacia", "Fighter", "Martial Cadence", "Dragon Strike", "Golden Aegis", "Demacian Standard", "Cataclysm");
        championRepository.save(jarvanIv);

        Champion jax = new Champion("Jax", "The Grandmaster at Arms", "Fighter", "Relentless Assault", "Leap Strike", "Empower", "Counter Strike", "Grandmaster's Might");
        championRepository.save(jax);

        Champion jayce = new Champion("Jayce", "The Defender of Tomorrow", "Fighter", "Hextech Capacitor", "To the Skies!/Shock Blast", "Lightning Field/Hyper Charge", "Thundering Blow/Acceleration Gate", "Transform: Mercury Cannon/Transform: Mercury Hammer");
        championRepository.save(jayce);

        Champion jhin = new Champion("Jhin", "The Virtuoso", "Assassin", "Whisper", "Dancing Grenade", "Deadly Flourish", "Captive Audience", "Curtain Call");
        championRepository.save(jhin);

        Champion jinx = new Champion("Jinx", "The Loose Cannon", "Marksman", "Get Excited!", "Switcheroo!", "Zap!", "Flame Chompers!", "Super Mega Death Rocket!");
        championRepository.save(jinx);

        Champion kaisa = new Champion("Kai'sa", "Daughter of The Void", "Marksman", "Second Skin", "Icathian Rain", "Void Seeker", "Supercharge", "Killer Instinct");
        championRepository.save(kaisa);

        Champion kalista = new Champion("Kalista", "The Spear of Vengeance", "Marksman", "Martial Poise", "Pierce", "Sentinel", "Rend", "Fate's Call");
        championRepository.save(kalista);

        Champion karma = new Champion("Karma", "The Enlightened One", "Mage", "Gathering Fire", "Inner Flame", "Focused Resolve", "Inspired", "Mantra");
        championRepository.save(karma);

        Champion karthus = new Champion("Karthus", "The Deathslinger", "Mage", "Death Defied", "Lay Waste", "Wall of Pain", "Defile", "Requiem");
        championRepository.save(karthus);

        Champion kassadin = new Champion("Kassadin", "The Void Walker", "Mage", "Void Stone", "Null Sphere", "Nether Blade", "Force Pulse", "Riftwalk");
        championRepository.save(kassadin);

        Champion katarina = new Champion("Katarina", "The Sinister Blade", "Mage", "Voracity", "Bouncing Blades", "Preparation", "Shunpo", "Death Lotus");
        championRepository.save(katarina);

        Champion kayle = new Champion("Kayle", "The Righteous", "Fighter", "Divine Ascent", "Radiant Blast", "Celestial Blessing", "Starfire Spellblade", "Divine Judgement");
        championRepository.save(kayle);

        Champion kayn = new Champion("Kayn", "The Shadow Reaper", "Fighter", "The Darkin Scythe", "Reaping Slash", "Blade's Reach", "Shadow Step", "Umbral Trespass");
        championRepository.save(kayn);

        Champion kennen = new Champion("Kennen", "The Heart of the Tempest", "Mage", "Mark of the Storm", "Thundering Shuriken", "Electrical Surge", "Lightening Dash", "Slicing Maelstrom");
        championRepository.save(kennen);

        Champion khazix = new Champion("Kha'zix", "The Voidreaver", "Fighter", "Unseen Threat", "Taste Their Fear", "Void Spike", "Leap", "Void Assault");
        championRepository.save(khazix);

        Champion kindred = new Champion("Kindred", "The Eternal Hunters", "Marksman", "Mark of the Kindred", "Dance of Arrows", "Wolf's Frenzy", "Mounting Dread", "Lamb's Respite");
        championRepository.save(kindred);

        Champion kled = new Champion("Kled", "The Cantankerous Cavalier", "Fighter", "Skaarl, the Cowardly Lizard", "Bear Trap on a Rope/Pocket Pistol", "Infernal Chains", "Umbral Dash", "World Ender");
        championRepository.save(kled);

        Champion kogmaw = new Champion("Kog'maw", "The Mouth of the Abyss", "Mage", "Icathian Surprise", "Caustic Spike", "Bio-Arcane Barrage", "Void Ooze", "Living Artillery");
        championRepository.save(kogmaw);

        Champion leblanc = new Champion("Leblanc", "The Deceiver", "Mage", "Mirror Image", "Sigil of Malice", "Distortion", "Ethereal Chains", "Mimic");
        championRepository.save(leblanc);

        Champion leeSin = new Champion("Lee Sin", "The Blind Monk", "Fighter", "Flurry", "Sonic Wave/Resonating Strike", "Safeguard/Iron Will", "Tempest/Cripple", "Dragon's Rage");
        championRepository.save(leeSin);

        Champion leona = new Champion("Leona", "The Radiant Dawn", "Tank", "Sunlight", "Shield of Daybreak", "Eclipse", "Zeneth Blade", "Solar Flare");
        championRepository.save(leona);

        Champion lillia = new Champion("Lillia", "the Bashful Bloom", "Skirmisher", "Dream-Laden Bough", "Booming Blows", "Watch Out! Eep!", "Swirlseed", "Lifting Lullaby");
        championRepository.save(lillia);

        Champion lissandra = new Champion("Lissandra", "The Ice Witch", "Mage", "Iceborn Subjugation", "Ice Shard", "Ring of Forest", "Glacial Path", "Frozen Tomb");
        championRepository.save(lissandra);

        Champion lucian = new Champion("Lucian", "The Purifier", "Marksman", "Lightslinger", "Piercing Light", "Ardent Blaze", "Relentless Pursuit", "The Culling");
        championRepository.save(lucian);

        Champion lulu = new Champion("Lulu", "The Fae Sorceress", "Mage", "Pix, Faerie Companion", "Glitterlance", "Whimsy", "Help, Pix!", "Wild Growth");
        championRepository.save(lulu);

        Champion lux = new Champion("Lux", "The Lady of Luminosity", "Mage", "Illumination", "Light Binding", "Prismatic Barrier", "Lucent Singularity", "Final Spark");
        championRepository.save(lux);

        Champion malphite = new Champion("Malphite", "The Shard of The Monolith", "Fighter", "Granite Shield", "Seismic Shard", "Thunderclap", "Ground Slam", "Unstoppable Force");
        championRepository.save(malphite);

        Champion malzahar = new Champion("Malzahar", "The Prophet of The Void", "Assassin", "Void Shift", "Call of The Void", "Void Swarm", "Malefic Visions", "Nether Grasp");
        championRepository.save(malzahar);

        Champion maokai = new Champion("Maokai", "The Twisted Treant", "Mage", "Sap Magic", "Bramble Smash", "Twisted Advance", "Sapling Toss", "Nature's Grasp");
        championRepository.save(maokai);

        Champion masterYi = new Champion("Master Yi", "The Wuju Bladesman", "Fighter", "Double Strike", "Alpha Strike", "Meditate", "Wuju Style", "Highlander");
        championRepository.save(masterYi);

        Champion missFortune = new Champion("Miss Fortune", "The Bounty Hunter", "Marksman", "Love Tap", "Double Up", "Strut", "Make It Rain", "Bullet Time");
        championRepository.save(missFortune);

        Champion mordekaiser = new Champion("Mordekaiser", "The Iron Revenant", "Fighter", "Darkness Rise", "Obliterate", "Indestructible", "Death's Grasp", "Realm of Death");
        championRepository.save(mordekaiser);

        Champion morgana = new Champion("Morgana", "The Fallen", "Mage", "Soul Siphon", "Dark Binding", "Tormented Shadow", "Black Shield", "Soul Shackles");
        championRepository.save(morgana);

        Champion nami = new Champion("Nami", "The Tidecaller", "Mage", "Surging Tides", "Aqua Prison", "Ebb and Flow", "Tidecaller's Blessing", "Tidal Wave");
        championRepository.save(nami);

        Champion nasus = new Champion("Nasus", "The Curator of the Sands", "Fighter", "Soul Eater", "Siphoning Strike", "Wither", "Spirit Fire", "Fury of the Sands");
        championRepository.save(nasus);

        Champion nautilus = new Champion("Nautilus", "The Titan of The Depths", "Fighter", "Staggering Blow", "Dredge Line", "Titan's Wrath", "Riptide", "Depth Charge");
        championRepository.save(nautilus);

        Champion neeko = new Champion("Neeko", "The Curious Chameleon", "Mage", "Inherent Glamour", "Blooming Burst", "Shapeshifter", "Tangle-Barbs", "Pop Blossom");
        championRepository.save(neeko);

        Champion nidalee = new Champion("Nidalee", "The Bestial Huntress", "Fighter", "Prowl", "Javelin Toss", "Bushwhack", "Primal Surge", "Aspect of the Cougar");
        championRepository.save(nidalee);

        Champion nocturne = new Champion("Nocturne", "The Eternal Nightmare", "Fighter", "Umbra Blades", "Duskbringer", "Shroud of Darkness", "Unspeakable Horror", "Paranoia");
        championRepository.save(nocturne);

        Champion nunuAndWillump = new Champion("Nunu & Willump", "The Boy and his Yeti", "Fighter", "Call of the Freljord", "Consume", "Biggest Snowball Ever!", "Snowball Barrage", "Absolute Zero");
        championRepository.save(nunuAndWillump);

        Champion olaf = new Champion("Olaf", "The Berserker", "Fighter", "Berserker Rage", "Undertow", "Vicious Strikes", "Reckless Swing", "Ragnarok");
        championRepository.save(olaf);

        Champion orianna = new Champion("Orianna", "The Lady of Clockwork", "Mage", "Clockwork Windup", "Command: Attack", "Command: Dissonance", "Command: Protect", "Command: Shockwave");
        championRepository.save(orianna);

        Champion ornn = new Champion("Ornn", "The Fire Below the Mountain", "Tank", "Living Forge", "Volcanic Rupture", "Bellows Breath", "Searing Charge", "Call of the Forge God");
        championRepository.save(ornn);

        Champion pantheon = new Champion("Pantheon", "The Unbreakable Spear", "Fighter", "Mortal Will", "Comet Spear", "Shield Vault", "Aegis Assault", "Grand Starfall");
        championRepository.save(pantheon);

        Champion poppy = new Champion("Poppy", "Keeper of the Hammer", "Fighter", "Iron Ambassador", "Hammer Shock", "Steadfast Presence", "Heroic Charge", "Keeper's Verdict");
        championRepository.save(poppy);

        Champion pyke = new Champion("Pyke", "The Bloodharbor Ripper", "Assassin", "Gift of the Drowned Ones", "Bone Skewer", "Ghostwater Dive", "Phantom Undertow", "Death from Below");
        championRepository.save(pyke);

        Champion qiyana = new Champion("Qiyana", "Empress of the Elements", "Assassin", "Royal Privilege", "Edge of Ixtal", "Terrashape", "Audacity", "Supreme Display of Talent");
        championRepository.save(qiyana);

        Champion quinn = new Champion("Quinn", "Demacia's Wings", "Fighter", "Harrier", "Blinding Assault", "Heightened Senses", "Vault", "Behind Enemy Lines/Skystrike");
        championRepository.save(quinn);

        Champion rakan = new Champion("Rakan", "the Charmer", "Mage", "Fey Feathers", "Gleaming Quill", "Grand Entrance", "Battle Dance", "The Quickness");
        championRepository.save(rakan);

        Champion rammus = new Champion("Rammus", "The Armordillo", "Fighter", "Spiked Shell", "Powerball", "Defensive Ball Curl", "Frenzying Taunt", "Tremors");
        championRepository.save(rammus);

        Champion reksai = new Champion("Rek'Sai", "The Void Burrower", "Fighter", "Fury of the Xer'Sai", "Queen's Wrath/Prey Seeker", "Burrow/Unburrow", "Furious Bite/Tunnel", "Void Rush");
        championRepository.save(reksai);

        Champion rell = new Champion("Rell", "The Iron Maiden", "Support", "Break The Mold", "Shattering Strike", "Crash Down/Mount Up", "Attract and Repel", "Magnet Storm");
        championRepository.save(rell);

        Champion renekton = new Champion("Renekton", "The Butcherer of the Sands", "Fighter", "Reign of Anger", "Cull the Meek", "Ruthless Predator", "Slice and Dice", "Dominus");
        championRepository.save(renekton);

        Champion rengar = new Champion("Rengar", "The Pridestalker", "Fighter", "Unseen Predator", "Savagery", "Battle Roar", "Bola Strike", "Thrill of the Hunt");
        championRepository.save(rengar);

        Champion riven = new Champion("Riven", "The Exile", "Fighter", "Runic Blade", "Broken Wings", "Ki Burst", "Valor", "Blade of the Exile/Wind Slash");
        championRepository.save(riven);

        Champion rumble = new Champion("Rumble", "The Mechanized Menace", "Fighter", "Junkyard Titan", "Flamespitter", "Scrap Shield", "Electro Harpoon", "The Equalizer");
        championRepository.save(rumble);

        Champion ryse = new Champion("Ryse", "The Rune Mage", "Mage", "Arcane Mastery", "Overload", "Rune Prison", "Spell Flux", "Realm Warp");
        championRepository.save(ryse);

        Champion samira = new Champion("Samira", "The Desert Rose", "Marksman", "Daredevil Impulse", "Flair", "Blade Whirl", "Wild Rush", "Inferno Trigger");
        championRepository.save(samira);

        Champion sejuani = new Champion("Sejuani", "Fury of the North", "Tank", "Fury of the North", "Arctic Assault", "Winter's Wrath", "Permafrost", "Glacial Prison");
        championRepository.save(sejuani);

        Champion senna = new Champion("Senna", "The Redeemer", "Support", "Absolution", "Piercing Darkness", "Last Embrace", "Curse of the Black Mist", "Dawning Shadow");
        championRepository.save(senna);

        Champion seraphine = new Champion("Seraphine", "The Starry-Eyed Songstress", "Mage", "Echo", "High Note", "Surround Sound", "Beat Drop", "Encore");
        championRepository.save(seraphine);

        Champion sett = new Champion("Sett", "The Boss", "Fighter", "Pit Grit", "Knuckle Down", "Haymaker", "Facebreaker", "The Show Stopper");
        championRepository.save(sett);

        Champion shaco = new Champion("Shaco", "The Demon Jester", "Assassin", "Backstab", "Deceive", "Jack In The Box", "Two-Shiv Poison", "Hallucinate");
        championRepository.save(shaco);

        Champion shen = new Champion("Shen", "The Eye of Twilight", "Fighter", "Ki Barrier", "Twilight Assault", "Spirit's Refuge", "Shadow Dash", "Stand United");
        championRepository.save(shen);

        Champion shyvana = new Champion("Shyvana", "The Half-Dragon", "Fighter", "Fury of the Dragonborn", "Twin Bite", "Burnout", "Flame Breath", "Dragon's Descent");
        championRepository.save(shyvana);

        Champion singed = new Champion("Singed", "The Mad Chemist", "Tank", "Noxious Slipstream", "Poison Trail", "Mega Adhesive", "Fling", "Insanity Potion");
        championRepository.save(singed);

        Champion sion = new Champion("Sion", "The Undead Juggernaut", "Tank", "Glory in Death/Death Surge", "Decimating Smash", "Soul Furnace", "Roar of the Slayer", "Unstoppable Onslaught");
        championRepository.save(sion);

        Champion sivir = new Champion("Sivir", "The Battle Mistress", "Marksman", "Fleet of Foot", "Boomerang Blade", "Ricochet", "Spell Shield", "On the Hunt");
        championRepository.save(sivir);

        Champion skarner = new Champion("Skarner", "The Crystal Vanguard", "Fighter", "Crystal Spires", "Crystal Slash", "Crystalline Exoskeleton", "Fracture", "Impale");
        championRepository.save(skarner);

        Champion sona = new Champion("Sona", "The Maven of The Strings", "Mage", "Power Cord", "Hymn of Valor", "Aria of Perserverance", "Song of Celerity", "Crescendo");
        championRepository.save(sona);

        Champion soraka = new Champion("Soraka", "The Starchild", "Mage", "Salvation", "Starcall", "Astral Infusion", "Equinox", "Wish");
        championRepository.save(soraka);

        Champion swain = new Champion("Swain", "The Master Tactician", "Mage", "Ravenous Flock", "Death's Hand", "Vision of Empire", "Nevermore", "Demonic Ascension");
        championRepository.save(swain);

        Champion sylas = new Champion("Sylas", "The Unshackled", "Mage", "Petricite Burst", "Chain Lash", "Kingslayer", "Abscond/Abduct", "Hijack");
        championRepository.save(sylas);

        Champion syndra = new Champion("Syndra", "The Dark Sovereign", "Mage", "Transcendent", "Dark Sphere", "Force of Will", "Scatter the Weak", "Unleashed Power");
        championRepository.save(syndra);

        Champion tahmKench = new Champion("Tahm Kench", "The River King", "Tank", "An Acquired Taste", "Tounge Lash", "Devour", "Thick Skin", "Abyssal Voyage");
        championRepository.save(tahmKench);

        Champion taliyah = new Champion("Taliyah", "the Stoneweaver", "Mage", "Rock Surfing", "Threaded Volley", "Seismic Shove", "Unraveled Earth", "Weaver's Wall");
        championRepository.save(taliyah);

        Champion talon = new Champion("Talon", "The Blade's Shadow", "Assassin", "Blade's End", "Noxian Diplomacy", "Rake", "Assassin's Path", "Shadow Assault");
        championRepository.save(talon);

        Champion taric = new Champion("Taric", "The Shield of Valoran", "Fighter", "Bravado", "Starlight's Touch", "Bastion", "Dazzle", "Cosmic Radiance");
        championRepository.save(taric);

        Champion teemo = new Champion("Teemo", "The Swift Scout", "Marksman", "Guerrilla Warfare", "Blinding Dart", "Move Quick", "Toxic Shot", "Noxious Trap");
        championRepository.save(teemo);

        Champion thresh = new Champion("Thresh", "The Chain Warden", "Fighter", "Damnation", "Death Sentence", "Dark Passage", "Flay", "The Box");
        championRepository.save(thresh);

        Champion tristana = new Champion("Tristana", "The Yordle Gunner", "Assassin", "Draw a Beard", "Rapid Fire", "Rocket Jump", "Explosive Charge", "Buster Shot");
        championRepository.save(tristana);

        Champion trundle = new Champion("Trundle", "The Troll King", "Fighter", "King's Tribute", "Chomp", "Frozen Domain", "Pillar of Ice", "Subjugate");
        championRepository.save(trundle);

        Champion tryndamere = new Champion("Tryndamere", "The Barbarian King", "Fighter", "Battle Fury", "Bloodlust", "Mocking Shout", "Spinning Slash", "Undying Rage");
        championRepository.save(tryndamere);

        Champion twistedFate = new Champion("Twisted Fate", "The Card Master", "Mage", "Loaded Dice", "Wild Cards", "Pick a Card", "Stacked Deck", "Destiny/Gate");
        championRepository.save(twistedFate);

        Champion twitch = new Champion("Twitch", "The Plague Rat", "Assassin", "Deadly Venom", "Ambush", "Venom Cask", "Contaminate", "Spray and Pray");
        championRepository.save(twitch);

        Champion udyr = new Champion("Udyr", "The Spirit Walker", "Fighter", "Monkey's Agility", "Tiger Stance", "Turtle Stance", "Bear Stance", "Phoenix Stance");
        championRepository.save(udyr);

        Champion urgot = new Champion("Urgot", "The Dreadnought", "Fighter", "Echoing Flames", "Corrosive Charge", "Purge", "Distain", "Fear Beyond Death");
        championRepository.save(urgot);

        Champion varius = new Champion("Varius", "The Arrow of Retribution", "Mage", "Living Vengeance", "Piercing Arrow", "Blighted Quiver", "Hail of Arrows", "Chain of Corruption");
        championRepository.save(varius);

        Champion vayne = new Champion("Vayne", "The Night Hunter", "Assassin", "Night Hunter", "Tumble", "Silver Bolts", "Condemn", "Final Hour");
        championRepository.save(vayne);

        Champion veigar = new Champion("Veigar", "The Tiny Master of Evil", "Mage", "Phenomenal Evil Power", "Baleful Strike", "Dark Matter", "Event Horizon", "Primordal Burst");
        championRepository.save(veigar);

        Champion velkoz = new Champion("Vel'Koz", "The Eye of The Void", "Mage", "Organic Deconstruction", "Plasma Fission", "Void Rift", "Tectonic Disruption", "Lifeform Disintegration Ray");
        championRepository.save(velkoz);

        Champion vi = new Champion("Vi", "The Piltover Enforcer", "Fighter", "Blast Shield", "Vault Breaker", "Denting Blows", "Excessive Force", "Assault and Battery");
        championRepository.save(vi);

        Champion viktor = new Champion("Viktor", "The Machine Herald", "Mage", "Glorious Evolution", "Siphon Power", "Gravity Field", "Death Ray", "Chaos Storm");
        championRepository.save(viktor);

        Champion viego = new Champion("Viego", "The Ruined King", "Fighter", "Soverign's Domination", "Blade of The Ruined King", "Spectral Maw", "Harrowed Path", "Heartbreaker");
        championRepository.save(viego);

        Champion vladimir = new Champion("Vladimir", "The Crimson Reaper", "Tank", "Crimson Pact", "Transfusion", "Sanguine Pool", "Tides of Blood", "Hemoplague");
        championRepository.save(vladimir);

        Champion volibear = new Champion("Volibear", "The Relentless Storm", "Fighter", "The Relentless Storm", "Thundering Smash", "Frenzied Maul", "Sky Splitter", "Stormbringer");
        championRepository.save(volibear);

        Champion warwick = new Champion("Warwick", "The Uncaged Wrath of Zaun", "Fighter", "Eternal Hunger", "Jaws of the Beast", "Blood Hunt", "Primal Howl", "Infinite Duress");
        championRepository.save(warwick);

        Champion wukong = new Champion("Wukong", "The Monkey King", "Fighter", "Stone Skin", "Crushing Blow", "Warrior Trickster", "Nimbus Strike", "Cyclone");
        championRepository.save(wukong);

        Champion xayah = new Champion("Xayah", "the Rebel", "Fighter", "Clean Cuts", "Double Daggers", "Deadly Plumage", "Bladecaller", "Featherstorm");
        championRepository.save(xayah);

        Champion xerath = new Champion("Xerath", "The Magus Ascendant", "Mage", "Mana Surge", "Arcanopulse", "Eye of Destruction", "Shocking Orb", "Rite of the Arcane");
        championRepository.save(xerath);

        Champion xinZhao = new Champion("Xin Zhao", "The Seneschal of Demacia", "Fighter", "Determination", "Three Talon Strike", "Wind Becomes Lightning", "Audacious Charge", "Crescent Guard");
        championRepository.save(xinZhao);

        Champion yassuo = new Champion("Yassuo", "The Unforgiven", "Assassin", "Way of The Wanderer", "Steel Tempest", "Wind Wall", "Sweeping Blade", "Last Breath");
        championRepository.save(yassuo);

        Champion yorick = new Champion("Yorick", "The Shepard of Souls", "Fighter", "Shepard of Souls", "Last Rites/Awakening", "Dark Procession", "Mourning Mist", "Eulogy of the Isles");
        championRepository.save(yorick);

        Champion yone = new Champion("Yone", "The Unforgiven", "Assassin", "Shepard of Souls", "Mortal Steel", "Spirit Cleave", "Soul Unbound", "Fate Sealed");
        championRepository.save(yone);

        Champion yummi = new Champion("Yummi", "The Magical Cat", "Mage", "Bop 'n' Block", "Prowling Projectile", "You and Me!", "Zoomies", "Final Chapter");
        championRepository.save(yummi);

        Champion zac = new Champion("Zac", "The Secret Weapon", "Fighter", "Cell Division", "Stretching Strikes", "Unstable Matter", "Elastic Slingshot", "Let's Bounce!");
        championRepository.save(zac);

        Champion zed = new Champion("Zed", "The Master of Shadows", "Fighter", "Contempt for the Weak", "Razor Shiruken", "Living Shadow", "Shadow Slash", "Death Mark");
        championRepository.save(zed);

        Champion ziggs = new Champion("Ziggs", "The Hexplosives Expert", "Mage", "Short Fuse", "Bouncing Bomb", "Satchel Charge", "Hexplosive Minefield", "Mega Inferno Bomb");
        championRepository.save(ziggs);

        Champion zilean = new Champion("Zylian", "The Chronokeeper", "Mage", "Time in a Bottle", "Time Bomb", "Rewind", "Time Warp", "Chrono Shift");
        championRepository.save(zilean);

        Champion zoe = new Champion("Zoe", "The Aspect of Twilight", "Mage", "More Sparkles!", "Paddle Star", "Spell Thief", "Sleepy Trouble Bubble", "Portal Jump");
        championRepository.save(zoe);

        Champion zyra = new Champion("Zyra", "Rise of the Thorns", "Mage", "Garden of Thorns", "Deadly Spines", "Rampant Growth", "Grasping Roots", "Stranglethorns");
        championRepository.save(zyra);

    }
}
