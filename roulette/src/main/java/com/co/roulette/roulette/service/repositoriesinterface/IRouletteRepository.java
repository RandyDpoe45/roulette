/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.service.repositoriesinterface;

import com.co.roulette.roulette.dto.RouletteDto;
import com.co.roulette.roulette.model.Roulette;
import java.util.List;

/**
 *
 * @author randy
 */
public interface IRouletteRepository {
    
    Long createRoulette();
    Boolean openRoulette(Long rouletteId);
    Boolean closeRoulette(Long rouletteId);
    Iterable<Roulette> listRoulettes();
}
