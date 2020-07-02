/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.service.repositoriesimpl;

import com.co.roulette.roulette.dto.RouletteDto;
import com.co.roulette.roulette.repositories.RouletteCrudRepository;
import com.co.roulette.roulette.service.repositoriesinterface.IRouletteRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author randy
 */
public class RouletteRepositoryImpl implements IRouletteRepository{
    
    @Autowired
    private RouletteCrudRepository rouletteCrudRepository;

    @Override
    public Long createRoulette(RouletteDto rouletteDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean openRoulette(Long rouletteId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
