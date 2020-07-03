/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

/**
 *
 * @author randy
 */
@Getter
@Setter
@RedisHash("Wager")
@NoArgsConstructor
@Accessors(chain = true)
public class Wager {
    @Id
    private Long id;
    private BigDecimal value;
    @Indexed
    private Long clientId;
    @Indexed
    private Long rouletteId;
    private String colour;
    private Long number;
    private Boolean winner;
}
