/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

/**
 *
 * @author acabezam
 */
public class Sum extends Operator {

    public Sum(int operatorA, int operatorB) {
        super(operatorA, operatorB);
    }
    
    @Override
    public double operate(){
        return this.operatorA + this.operatorB;
    }
}
