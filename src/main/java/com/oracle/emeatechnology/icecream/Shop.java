/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.emeatechnology.icecream;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author eslater
 */
public abstract class Shop {
    
    private HashMap<String, Flavour> flavours;
    private List<Price> priceList;
    
    public Double getRateByName(String name) {
        return getRate(getFlavours().get(name));
    }
        
    private Double getRate(Flavour flavour) {
        ProductType pt = flavour.getProductType();
        switch (pt) {
            case Gelato:
                return getGelatoRate();
            case Premium:
                return getPremiumRate();
            default:
                return getSorbetRate();
        }
    }
    
    public String getPriceListAsString() {
        StringBuilder sb = new StringBuilder("\nPricelist:\n");
        getPriceList().forEach((p) -> {
            sb.append(p.toString());
            sb.append("\n");
        });
        return sb.toString();
    }

    public Double order(String name, Integer quantity) {
        return getRateByName(name) * quantity;
    }

    /**
     * @return the flavours
     */
    public HashMap<String, Flavour> getFlavours() {
        if (flavours == null) {
            flavours = new HashMap<>();
            FlavourList.getFlavourList().getFlavours()
                    .forEach((f) -> {
                        flavours.put(f.getName(), f);
                    });
        }
        return flavours;
    }

    /**
     * @return the unit
     */
    public abstract Measure getUnit();

    /**
     * @return the PremiumRate
     */
    public abstract Double getPremiumRate();

    /**
     * @return the GelatoRate
     */
    public abstract Double getGelatoRate();

    /**
     * @return the SorbetRate
     */
    public abstract Double getSorbetRate();

    private List<Price> getPriceList() {
        if (priceList == null) {
            priceList = new ArrayList<>();
            getFlavours().values().forEach((f) -> {
                priceList.add(new Price(f, getUnit(), getRate(f)));
            });
        }
        return priceList;
    }
}
