/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava.shape;

/**
 *
 * @author acabezam
 */
public class Circle extends Shape2 {
    public Circle (double radius){
        super(radius,radius);
    }
    
    @Override
    public double area(){
        return PI * Math.pow(this.weigth, 2);
    }
    
    @Override
    public double perimeter() {
        return 2 * PI * this.weigth;
    }
}
