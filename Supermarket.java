/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

import java.util.ArrayList;

/**
 *
 * @author acabezam
 */
public class Supermarket {
    ArrayList<Product> supermarket = new ArrayList<>();
    
    public Supermarket(){};
    
    public Supermarket(ArrayList<Product> newSupermaket){
        this.supermarket = newSupermaket;
    }
    
    public void add(Product product){
        supermarket.add(product);
    }
    
    public Product getProduct(String name){
        Product product = new Product("Not Found" , 0.0);
        
        for (int i = 0; i < supermarket.size(); i++){
            if (supermarket.get(i).getName().equals(name))
                return supermarket.get(i);
        }
        
        return product;
    }
}
