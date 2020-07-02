/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.service.repositoriesimpl;

import com.co.roulette.roulette.dto.WagerDto;
import com.co.roulette.roulette.repositories.WagerCrudRepository;
import com.co.roulette.roulette.service.repositoriesinterface.IWagerRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author randy
 */
public class WagerRepositoryImpl implements IWagerRepository{

    @Autowired
    private WagerCrudRepository wagerCrudRepository;
    
    @Override
    public Boolean createWager(WagerDto wagerDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
