/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.roulette.roulette.model;

/**
 *
 * @author randy
 */
public enum Colour {
    
    RED("RED"),BLACK("BLACK");
    
    private String colourName;
    
    private Colour(String colourName){
        this.colourName = colourName;
    }
    
}
