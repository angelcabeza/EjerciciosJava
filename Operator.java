/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

/**
 *
 * @author acabezam
 */
public abstract class Operator {
    protected double operatorA;
    protected double operatorB;
    
    public Operator(){};
    
    public Operator(int operatorA, int operatorB){
        this.operatorA = operatorA;
        this.operatorB = operatorB;
    };
    
    public abstract double operate();
}
