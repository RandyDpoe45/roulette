/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.service.repositoriesimpl;

import com.co.roulette.roulette.dto.ClientDto;
import com.co.roulette.roulette.repositories.ClientCrudRepository;
import com.co.roulette.roulette.service.repositoriesinterface.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author randy
 */
public class ClientRepositoryImpl implements IClientRepository{
    
    @Autowired
    private ClientCrudRepository clientCrudRepository;

    @Override
    public Long createClient(ClientDto clientDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
