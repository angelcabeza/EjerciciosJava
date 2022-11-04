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
    private double operator1;
    private double operator2;
    
    public Calculadora(){}
    
    public Calculadora(double operatorA, double operatorB){
        this.operator1 = operatorA;
        this.operator2 = operatorB;
    }
    
    private double sum(){
        return operator1 + operator2;
    }
    
    private double substract(){
        return operator1 - operator2;
    }
    
    private double multiply(){
        return operator1 * operator2;
    }
    
    private double factorial(){
        double aux_number = operator1;
        double solution = 1;
        
        while (aux_number > 1){
            solution *= aux_number;
            
            aux_number--;
        }
        
        return solution;
    }
    
    private double power(){
        return Math.pow(operator1, operator2);
    }
    
    private double split(){
        try{
            return operator1 / operator2;
        } catch (Exception e) {
             throw new ArithmeticException(e.getMessage());
        } 
    }
    
    public double operate(OPERATION_TYPE operation){
        switch (operation){
            case SUM:
                return sum();
            case SUBSTRACT:
                return substract();
            case MULTIPLY:
                return multiply();
            case SPLIT:
                return split();
            case POWER:
                return power();
            case FACTORIAL:
                return factorial();
            default:
                throw new IllegalArgumentException("Please introduce a valid argument");
        }
    }
    
    public double getOperator1(){
        return operator1;
    }
    
    public double getOperator2(){
        return operator2;
    }
    
    public void setOperator1(double newValue){
        this.operator1 = newValue;
    }
    
    public void setOperator2(double newValue){
        this.operator2 = newValue;
    }
}
