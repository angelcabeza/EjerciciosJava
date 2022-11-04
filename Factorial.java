/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

/**
 *
 * @author acabezam
 */
public class Factorial extends Operator{
    
    public Factorial(int a){
        operatorA = a;
        operatorB = a;
    }
    
    public double operate(){
        int solution = 1;
        double aux_number = operatorA;
        
        while (aux_number > 1){
            solution *= aux_number;
            
            aux_number--;
        }
        
        return solution;
    }
}
