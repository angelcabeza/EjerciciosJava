/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

/**
 *
 * @author acabezam
 */


public class Calculadora {
    private Operator operator;
    private double operator1;
    private double operator2;
        
    public Calculadora(Operator operator){
        this.operator = operator;
    }
    
    public double operate(){
        return this.operator.operate();
    }
}
