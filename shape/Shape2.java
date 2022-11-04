/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava.shape;

/**
 *
 * @author acabezam
 */
public abstract class Shape2 {
    protected double weigth, height;
    protected final double PI = 3.1416;
    
    public Shape2(double weigth, double height){
        this.weigth = weigth;
        this.height = height;
    }
    
    public abstract double area();
    public abstract double perimeter();
}
