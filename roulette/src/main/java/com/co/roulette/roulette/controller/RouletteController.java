/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.controller;

import com.co.roulette.roulette.dto.RouletteDto;
import com.co.roulette.roulette.dto.WagerDto;
import com.co.roulette.roulette.model.Roulette;
import com.co.roulette.roulette.model.Wager;
import com.co.roulette.roulette.serializer.RouletteSerializer;
import com.co.roulette.roulette.serializer.WagerSerializer;
import com.co.roulette.roulette.service.repositoriesinterface.IRouletteRepository;
import com.co.roulette.roulette.service.repositoriesinterface.IWagerRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author randy
 */
@RestController
@RequestMapping("roulette")
public class RouletteController {
    
    @Autowired
    private IRouletteRepository rouletteRepository;
    
    @Autowired
    private IWagerRepository wagerRepository;
    
    @PostMapping
    public ResponseEntity createRoulette(){
        Long rouletteId = rouletteRepository.createRoulette();
        return ResponseEntity.status(HttpStatus.CREATED).body(rouletteId);
    }
    
    @GetMapping
    public ResponseEntity listRoulettes(){
        Iterable<Roulette> roulettes = rouletteRepository.listRoulettes();
        List<RouletteDto> response = new ArrayList<>();
        roulettes.forEach(x -> response.add(RouletteSerializer.toRouletteDto(x)));
        return ResponseEntity.ok(response);
    }
    
    @PutMapping("/{id}/open")
    public ResponseEntity updateRoulette(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(rouletteRepository.openRoulette(id));
    }
    
    @PutMapping("/{id}/close")
    public ResponseEntity closeRoulette(@PathVariable Long id){
        boolean res = rouletteRepository.closeRoulette(id);
        Iterable<Wager> wagers = wagerRepository.findByRouletteId(id);
        List<WagerDto> response = new ArrayList<>();
        wagers.forEach(x -> response.add(WagerSerializer.toWagerDto(x)));
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
    
}
