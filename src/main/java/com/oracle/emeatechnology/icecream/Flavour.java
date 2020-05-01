/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.emeatechnology.icecream;

import java.util.Objects;

/**
 *
 * @author eslater
 */
public class Flavour {
    private final String name;
    private final ProductType productType;
    
    public Flavour(String name, ProductType productType) {
        this.name = name;
        this.productType = productType;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Flavour other = (Flavour) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    /**
     * @return the productType
     */
    public ProductType getProductType() {
        return productType;
    }
}
