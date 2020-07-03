/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.controller;

import com.co.roulette.roulette.dto.WagerDto;
import com.co.roulette.roulette.service.repositoriesinterface.IClientRepository;
import com.co.roulette.roulette.service.repositoriesinterface.IWagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author randy
 */
@RestController
@RequestMapping("wager")
public class WagerController {
    
    @Autowired
    private IWagerRepository wagerRepository;
    
    @Autowired
    private IClientRepository clientRepository;
    
    @PostMapping
    public ResponseEntity createWager(@RequestBody WagerDto wagerDto,@RequestHeader("ClientId") Long clientId){
        try{
        wagerDto.setClientId(clientId);
        wagerRepository.createWager(wagerDto);
        clientRepository.updateClientCredit(clientId, wagerDto.getValue(), '-');
        return ResponseEntity.status(HttpStatus.CREATED).body(true);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(false);
        }
    }
    
}
