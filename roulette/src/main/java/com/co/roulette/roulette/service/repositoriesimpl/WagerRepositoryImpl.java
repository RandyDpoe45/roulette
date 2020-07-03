/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.service.repositoriesimpl;

import com.co.roulette.roulette.dto.WagerDto;
import com.co.roulette.roulette.model.Wager;
import com.co.roulette.roulette.repositories.WagerCrudRepository;
import com.co.roulette.roulette.serializer.WagerSerializer;
import com.co.roulette.roulette.service.repositoriesinterface.IWagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author randy
 */
@Service
public class WagerRepositoryImpl implements IWagerRepository{

    @Autowired
    private WagerCrudRepository wagerCrudRepository;
    
    @Override
    public Boolean createWager(WagerDto wagerDto) {
        try{
            Wager wager = WagerSerializer.fromWagerDto(wagerDto);
            wager.setWinner(Boolean.FALSE);
            wager = wagerCrudRepository.save(wager);
            
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public Iterable<Wager> findByRouletteId(Long rouletteId) {
        Iterable<Wager> wagers = wagerCrudRepository.findByRouletteId(rouletteId);
        return wagers;
    }
    
}
