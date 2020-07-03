/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.dto;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 *
 * @author randy
 */

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ClientDto {
    private Long id;
    private String name;
    private BigDecimal credit; 
}
