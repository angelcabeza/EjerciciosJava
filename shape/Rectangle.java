/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava.shape;

/**
 *
 * @author acabezam
 */
public class Rectangle extends Shape2 {    
    public Rectangle (double base, double height){
        super(base, height);
    }
    
    @Override
    public double area(){
        return weigth * height;
    }
    
    @Override
    public double perimeter(){
        return (2*weigth) * (2*height);
    }
}
