package com.example.LolAPI.components;

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

    }
}
