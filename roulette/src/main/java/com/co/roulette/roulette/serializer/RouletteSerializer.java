/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.serializer;

import com.co.roulette.roulette.dto.RouletteDto;
import com.co.roulette.roulette.model.Roulette;

/**
 *
 * @author randy
 */
public class RouletteSerializer {
    
    public static RouletteDto toRouletteDto(Roulette roulette){
        return new RouletteDto().setId(roulette.getId()).setState(roulette.getState());
    }
    
    public static Roulette fromRouletteDto(RouletteDto rouletteDto){
        return new Roulette().setId(rouletteDto.getId()).setState(rouletteDto.getState());
    }
}
