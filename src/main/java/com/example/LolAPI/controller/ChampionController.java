package com.example.LolAPI.controller;

import com.example.LolAPI.models.Champion;
import com.example.LolAPI.repository.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChampionController {

    @Autowired
    ChampionRepository championRepository;

    @GetMapping(value = "/champions")
    public ResponseEntity<List<Champion>> getAllChampions(){
        return new ResponseEntity<>(championRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/champions/{id}")
    public ResponseEntity getChampion(@PathVariable final Long id) {
        return new ResponseEntity<>(championRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/champions")
    public ResponseEntity<Champion> postChampion(@RequestBody final Champion champion) {
        championRepository.save(champion);
        return new ResponseEntity<>(champion, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/champions/{id}")
    public ResponseEntity<Champion> updateChampion(@RequestBody final Champion champion) {
        championRepository.save(champion);
        return new ResponseEntity<>(champion, HttpStatus.OK);
    }

    @DeleteMapping(value = "/champions/{id}")
    public ResponseEntity<Champion> deleteChampion(@PathVariable final Long id) {
        final Champion found = championRepository.getOne(id);
        championRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
