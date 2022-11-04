/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

/**
 *
 * @author acabezam
 */
public class Split extends Operator {
    
    public Split(int a, int b){
        this.operatorA = a;
        this.operatorB = b;
    }
    
    @Override
    public double operate(){
        try {
            return this.operatorA / this.operatorB;
        } catch (ArithmeticException e){
            throw new ArithmeticException(e.getMessage());
        }
    }
}
