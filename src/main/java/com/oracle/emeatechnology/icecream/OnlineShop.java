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
public class OnlineShop extends Shop {

    @Override
    public Measure getUnit() {
        return Measure.Litre;
    }

    @Override
    public Double getPremiumRate() {
        return 5.25;
    }

    @Override
    public Double getGelatoRate() {
        return 14.30;
    }

    @Override
    public Double getSorbetRate() {
        return 5.95;
    }
    
}
