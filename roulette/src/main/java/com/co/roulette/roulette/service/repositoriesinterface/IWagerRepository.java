/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.service.repositoriesinterface;

import com.co.roulette.roulette.dto.WagerDto;
import com.co.roulette.roulette.model.Wager;

/**
 *
 * @author randy
 */
public interface IWagerRepository {
    Boolean createWager(WagerDto wagerDto);
    Iterable<Wager> findByRouletteId(Long rouletteId); 
}
