/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.service.repositoriesinterface;

import com.co.roulette.roulette.dto.ClientDto;

/**
 *
 * @author randy
 */
public interface IClientRepository {
    
    Long createClient(ClientDto clientDto);
}
