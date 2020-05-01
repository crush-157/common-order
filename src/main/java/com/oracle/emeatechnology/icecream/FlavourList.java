/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.emeatechnology.icecream;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author eslater
 */
public class FlavourList {
    private List<Flavour> flavours = new ArrayList<Flavour>();
    
    private FlavourList() {
    }
    
    public static FlavourList getFlavourList() {
        FlavourList fl = new FlavourList();
        
        String[] premium = {
            "Belgian Chocolate",
            "Salted Caramel",
            "Vanilla",
            "Strawberries and Cream"
        };
        
        fl.addFlavours(premium, ProductType.Premium);
        
        String[] gelato = {
            "Bubblegum",
            "Chocolate",
            "Mango",
            "Mint Choc Chip"
        };
        
        fl.addFlavours(gelato, ProductType.Gelato);
        
        String[] sorbet = {
            "Blackberry",
            "Orange",
            "Strawberry & Black Pepper Gin",
            "Raspberry Romanza"
        };
        
        fl.addFlavours(sorbet, ProductType.Sorbet);
        
        return fl;
    }
    
    private void addFlavour(Flavour flavour) {
        getFlavours().add(flavour);
    }
    
    private void addFlavours(String[] names, ProductType productType) {
        for (String s : names) {
            addFlavour(new Flavour(s, productType));
        }        
    }

    /**
     * @return the flavours
     */
    public List<Flavour> getFlavours() {
        return flavours;
    }
}