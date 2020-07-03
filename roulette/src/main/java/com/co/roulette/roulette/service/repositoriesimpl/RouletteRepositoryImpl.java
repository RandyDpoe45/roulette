/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.service.repositoriesimpl;

import com.co.roulette.roulette.dto.RouletteDto;
import com.co.roulette.roulette.model.Roulette;
import com.co.roulette.roulette.repositories.RouletteCrudRepository;
import com.co.roulette.roulette.service.repositoriesinterface.IRouletteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author randy
 */
@Service
public class RouletteRepositoryImpl implements IRouletteRepository{
    
    @Autowired
    private RouletteCrudRepository rouletteCrudRepository;

    @Override
    public Long createRoulette() {
        Roulette roulete = new Roulette().setState(Boolean.FALSE);
        roulete = rouletteCrudRepository.save(roulete);
        return roulete.getId();
    }

    @Override
    public Boolean openRoulette(Long rouletteId){
        Optional<Roulette> rouletteOpt = rouletteCrudRepository.findById(rouletteId);
        if(rouletteOpt.isPresent()){
            Roulette roulette = rouletteOpt.get().setState(true);
            rouletteCrudRepository.save(roulette);
            return true;            
        }
        return false;
    }

    @Override
    public Iterable<Roulette> listRoulettes() {
        return rouletteCrudRepository.findAll();
    }

    @Override
    public Boolean closeRoulette(Long rouletteId) {
        Optional<Roulette> rouletteOpt = rouletteCrudRepository.findById(rouletteId);
        if(rouletteOpt.isPresent() && rouletteOpt.get().getState()){
            Roulette roulette = rouletteOpt.get().setState(false);
            rouletteCrudRepository.save(roulette);
            return true;            
        }
        return false;
    }
}
