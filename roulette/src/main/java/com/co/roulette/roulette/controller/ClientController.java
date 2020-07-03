/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.controller;

import com.co.roulette.roulette.dto.ClientDto;
import com.co.roulette.roulette.service.repositoriesinterface.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author randy
 */
@RestController
@RequestMapping("client")
public class ClientController {
    
    @Autowired
    private IClientRepository clientRepository;
    
    @PostMapping
    public ResponseEntity createClient(ClientDto clientDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(clientRepository.createClient(clientDto));
    }
}
