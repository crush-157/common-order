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
public class Runner {
    public static void main(String[] args) {
        Shop s = new Kiosk();
        OnlineShop os = new OnlineShop();
        shopTest(s);
        shopTest(os);
    }
    
    static void shopTest(Shop s) {
        System.out.println(s.getPriceListAsString());
        System.out.println(s.order("Bubblegum", 6));
    }
}
