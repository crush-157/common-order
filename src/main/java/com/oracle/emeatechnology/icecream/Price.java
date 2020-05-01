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
public class Price {
    private final Flavour flavour;
    private final Measure measure;
    private final Double pricePerMeasure;
    
    public Price(Flavour flavour, Measure measure, Double pricePerMeasure) {
        this.flavour = flavour;
        this.measure = measure;
        this.pricePerMeasure = pricePerMeasure;
    }

    /**
     * @return the flavour
     */
    public Flavour getFlavour() {
        return flavour;
    }

    /**
     * @return the measure
     */
    public Measure getMeasure() {
        return measure;
    }

    /**
     * @return the pricePerMeasure
     */
    public Double getPricePerMeasure() {
        return pricePerMeasure;
    }
    
    @Override
    public String toString() {
        return this.getFlavour().getName() + " €" +
                this.getPricePerMeasure() + " per " +
                this.measure;
    }
}
