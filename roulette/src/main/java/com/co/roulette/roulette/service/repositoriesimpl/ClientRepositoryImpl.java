/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.service.repositoriesimpl;

import com.co.roulette.roulette.dto.ClientDto;
import com.co.roulette.roulette.model.Client;
import com.co.roulette.roulette.repositories.ClientCrudRepository;
import com.co.roulette.roulette.serializer.ClientSerializer;
import com.co.roulette.roulette.service.repositoriesinterface.IClientRepository;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author randy
 */
@Service
public class ClientRepositoryImpl implements IClientRepository{
    
    @Autowired
    private ClientCrudRepository clientCrudRepository;

    @Override
    public Long createClient(ClientDto clientDto) {
        Client client = ClientSerializer.fromClientDto(clientDto);
        client = clientCrudRepository.save(client);
        
        return client.getId();
    }

    @Override
    public boolean updateClientCredit(Long clientId, BigDecimal newCredit, char operation) {
        try{
            Client client = clientCrudRepository.findById(clientId).get();
            if(operation == '-'){
                client = client.setCredit(client.getCredit().subtract(newCredit));
            }else if(operation == '+'){
                client = client.setCredit(client.getCredit().add(newCredit));
            }
            clientCrudRepository.save(client);
            
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
}
