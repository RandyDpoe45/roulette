/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.serializer;

import com.co.roulette.roulette.dto.ClientDto;
import com.co.roulette.roulette.model.Client;

/**
 *
 * @author randy
 */
public class ClientSerializer {
    
    public static Client fromClientDto(ClientDto clientDto){
        return new Client().setCredit(clientDto.getCredit())
                .setName(clientDto.getName());
    }
    
    public static ClientDto toClientDto(Client client){
        return new ClientDto().setCredit(client.getCredit())
                .setName(client.getName());
    }
}
