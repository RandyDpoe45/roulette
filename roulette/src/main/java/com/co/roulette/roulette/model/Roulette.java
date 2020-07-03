/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

/**
 *
 * @author randy
 */
@Getter
@Setter
@RedisHash("Roulette")
@NoArgsConstructor
@Accessors(chain = true)
public class Roulette implements Serializable{
    @Id
    private Long id;
    private Boolean state;
}
