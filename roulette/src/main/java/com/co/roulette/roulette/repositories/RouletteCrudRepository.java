/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.repositories;

import com.co.roulette.roulette.model.Roulette;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author randy
 */
@Repository
public interface RouletteCrudRepository  extends CrudRepository <Roulette,Long> {
    
}
