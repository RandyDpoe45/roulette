/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.serializer;

import com.co.roulette.roulette.dto.WagerDto;
import com.co.roulette.roulette.model.Wager;

/**
 *
 * @author randy
 */
public class WagerSerializer {
    
    public static WagerDto toWagerDto(Wager wager){
        return new WagerDto().setClientId(wager.getId()).setColour(wager.getColour())
        .setId(wager.getId()).setRouletteId(wager.getRouletteId()).setValue(wager.getValue()).setWinner(wager.getWinner())
                .setNumber(wager.getNumber());
    }
    
    public static Wager fromWagerDto(WagerDto wagerDto){
        return new Wager().setClientId(wagerDto.getClientId())
                    .setColour(wagerDto.getColour()).setValue(wagerDto.getValue())
                    .setRouletteId(wagerDto.getRouletteId()).setNumber(wagerDto.getNumber());
    }
}
