/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.emeatechnology.icecream;

/**
 *
 * @author eslater
 */
public class Kiosk extends Shop {

    @Override
    public Measure getUnit() {
        return Measure.Scoop;
    }

    @Override
    public Double getPremiumRate() {
        return 2.75;
    }

    @Override
    public Double getGelatoRate() {
        return 6.25;
    }

    @Override
    public Double getSorbetRate() {
        return 3.15;
    }
    
}
