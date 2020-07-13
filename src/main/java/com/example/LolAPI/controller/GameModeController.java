package com.example.LolAPI.controller;

import com.example.LolAPI.models.GameMode;
import com.example.LolAPI.repository.GameModeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameModeController {

    @Autowired
    GameModeRepository gameModeRepository;

    @GetMapping(value = "/gameModes/{id}")
    public ResponseEntity getGameMode(@PathVariable Long id){
        return new ResponseEntity<>(gameModeRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/gameModes")
    public ResponseEntity <List<GameMode>> getAllGameModes(){
        return new ResponseEntity<>(gameModeRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/gameModes")
    public ResponseEntity<GameMode> createGameMode(@RequestBody GameMode gameMode){
        gameModeRepository.save(gameMode);
        return new ResponseEntity<>(gameMode, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/gameModes/{id}")
    public ResponseEntity<GameMode> updateGameMode(@RequestBody GameMode gameMode){
        gameModeRepository.save(gameMode);
        return new ResponseEntity<>(gameMode, HttpStatus.OK);
    }

    @DeleteMapping(value = "/gameModes/{id}")
    public ResponseEntity<GameMode> deleteGameMode(@PathVariable Long id){
        GameMode found = gameModeRepository.getOne(id);
        gameModeRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
