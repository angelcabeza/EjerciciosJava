/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

/**
 *
 * @author acabezam
 */
public class Product {
    private double price;
    private String name;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    
    public void setPrecio(double price){
        this.price = price;
    }
    
    public void setNombre(String name){
        this.name = name;
    }
}
