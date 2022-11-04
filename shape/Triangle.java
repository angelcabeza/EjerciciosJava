/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava.shape;

/**
 *
 * @author acabezam
 */
public class Triangle extends Shape2 {
    private double side2;
    private double side3;
    
    public Triangle (double weight, double height, double side2, double side3){
        super(weight,height);
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public double area(){
        return (weigth*height)/2;
    }
    
    @Override
    public double perimeter(){
        return weigth + side2 + side3;
    }
}
