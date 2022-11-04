/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.curso.ejerciciosjava;

/**
 *
 * @author acabezam
 */
public class EjerciciosJava {
    public static boolean isPalindrome(String word){
        boolean isPalindrome = true;
        

        for (int i = 0; i < (word.length()/2) && isPalindrome; i++){
            if (Character.toLowerCase(word.charAt(i)) != 
                Character.toLowerCase(word.charAt(word.length() - (i+1)))){
                isPalindrome = false;
            }
                
        }
        
        return isPalindrome;
    }
    
    /**
     *
     * @param number
     * @return 
     */
    public static boolean isNumberPalindrome (int number){
        boolean isPalindrome = true;
        
        int remainder;
        int reversed = 0;
        int aux_number = number;
        
        while (aux_number > 0){
            remainder = aux_number % 10;
            reversed = reversed * 10 + remainder;
            
            aux_number /= 10;
        }
        
        if (number != reversed)
            isPalindrome = false;
        
        return isPalindrome;
    }
    
    public static int factorial (int number) {
        int aux_number = number;
        int solution = 1;
        
        while (aux_number > 1){
            solution *= aux_number;
            
            aux_number--;
        }
        
        return solution;
    }
    
    public static int MCD (int a, int b){
        if (a % b == 0) return b;
        return MCD(b, a%b);
    }
    
    public static int countFigures (int number){
        int aux_number = number;
        int num_figures = 1;
        
        while (aux_number >= 10){
            num_figures++;
            aux_number /= 10;
        }
        
        return num_figures;
    }
    
    public static boolean isAmstrongNumber(int number){
        int numFigures = countFigures(number);
        int aux_number = number;
        int suma = 0;
        
        while(aux_number > 0){
            int lastFigure = aux_number % 10;
            suma+= Math.pow(lastFigure, numFigures);
            aux_number /= 10;
        }
        
        return suma == number;
    }
    
    public static String reverseString(String word){
        String reversedChain = "";
        
        for (int i = word.length()-1; i >= 0; i--){
            reversedChain += word.charAt(i);
        }
        
        return reversedChain;
    }
    
    public static int[] minNumPackages(int weight){
        int aux_weight = weight;
        final int ONE_KG_PACKAGE = 1;
        final int THREE_KG_PACKAGE = 3;
        final int FIVE_KG_PACKAGE = 5;
        int num_packages[] = new int[3];
        
        if (weight < 0){
            throw new IllegalArgumentException("Please enter a weight > 0!");
        }
        
        num_packages[0] = aux_weight / FIVE_KG_PACKAGE;
        aux_weight -= num_packages[0] * FIVE_KG_PACKAGE;

        num_packages[1] = aux_weight / THREE_KG_PACKAGE;
        aux_weight -= num_packages[1] * THREE_KG_PACKAGE;

        num_packages[2] = aux_weight / ONE_KG_PACKAGE;
        
        return num_packages;
    }
    
    public static int romanToDecimalCorrespondence (char number){
        switch(number){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Please enter a valid roman number");
        }        
    }
    
    public static int fromRomanToDecimal (String number){
        int decimal_number = 0;
        int left_number;
        int right_number;
        boolean skipTwo = false;
        boolean hasFinished = false;
        int counter = 0;
        
        while (counter < number.length() && !hasFinished){
            
            if (counter == number.length() - 1){
                decimal_number += romanToDecimalCorrespondence(number.charAt(counter));
                hasFinished = true;
            }
            
            if (!hasFinished){
                left_number = romanToDecimalCorrespondence(number.charAt(counter));
                right_number = romanToDecimalCorrespondence(number.charAt(counter+1));

                if (right_number > left_number){
                    decimal_number += right_number - left_number;
                    skipTwo = true;
                } else {
                    decimal_number += left_number;
                    skipTwo = false;
                }
                
                if (skipTwo)
                    counter+=2;
                else
                    counter++;
            }
        }
        
        return decimal_number;
    }
    
    public static int getDayFromDate (String date1){
        char[] days = new char[2];
        final char INT_CHAR_CONVERSION_FACTOR = '0';
        int day = 0;
        
        days[0] = date1.charAt(0);
        days[1] = date1.charAt(1);
        
        day += (days[0] - INT_CHAR_CONVERSION_FACTOR) * 10;
        day += (days[1] - '0');
        
        return day;
    }
    
    public static int getMonthFromDate (String date1){
        char[] days = new char[2];
        final char INT_CHAR_CONVERSION_FACTOR = '0';
        int day = 0;
        
        days[0] = date1.charAt(3);
        days[1] = date1.charAt(4);
        
        day += (days[0] - INT_CHAR_CONVERSION_FACTOR) * 10;
        day += (days[1] - '0');
        
        return day;
    }
    
    public static int getYearFromDate (String date1){
        char[] years = new char[4];
        final char INT_CHAR_CONVERSION_FACTOR = '0';
        final int THOUSANDS = 1000;
        final int HUNDREDS = 100;
        final int TENS = 10;
        int year = 0;
        
        years[0] = date1.charAt(6);
        years[1] = date1.charAt(7);
        years[2] = date1.charAt(8);
        years[3] = date1.charAt(9);
        
        year += (years[0] - INT_CHAR_CONVERSION_FACTOR) * THOUSANDS;
        year += (years[1] - INT_CHAR_CONVERSION_FACTOR) * HUNDREDS;
        year += (years[2] - INT_CHAR_CONVERSION_FACTOR) * TENS;
        year += (years[3] - INT_CHAR_CONVERSION_FACTOR);
        
        return year;
        
    }
    public static int getNumberOfDaysFromDates(String date1, String date2){
        int days = 0;
        int day1 = getDayFromDate(date1);
        int month1 = getMonthFromDate(date1);
        int year1 = getYearFromDate(date1);
        
        int day2 = getDayFromDate(date2);
        int month2 = getMonthFromDate(date2);
        int year2 = getYearFromDate(date2);
        
        days += (year1 - year2) * 365;
        days += (month1 - month2) * 30;
        days +=  (day1 - day2);
        
        return Math.abs(days);
    }
    
    public static int recursiveFibonacci(int number){
        if (number < 2)
            return number;
        else
            return recursiveFibonacci(number-1) + recursiveFibonacci(number-2);
    }
    
    public static int dynamicFibonacci (int number){
        int dynamicVector[] = new int[number];
        
        dynamicVector[0] = 1;
        dynamicVector[1] = 1;
        
        for (int i = 2; i < dynamicVector.length; i++){
            dynamicVector[i] = dynamicVector[i-2] + dynamicVector[i-1];
        }
        
        return dynamicVector[dynamicVector.length -1];
    }
    
    public static void main(String[] args) {
        String palindromo = "Girafarig";
        
        int palindromeNumber = 678876;
        int packages[] = new int[3];
        int weight = 32;
        String romanNumber = "MM";
        
        System.out.println("Es palindromo: " + isPalindrome(palindromo));
        System.out.println("Es palindromo: " + palindromeNumber + "?: " + isNumberPalindrome(palindromeNumber));
        System.out.println("Factorial de 7: " + factorial(7));
        System.out.println("Is 153 an Amstrong number?: " + isAmstrongNumber(153));
        System.out.println("El reverso de perro es: " + reverseString("perro"));
        
        packages = minNumPackages(weight);
        System.out.println("To reach " + weight + " kg, we need: ");
        System.out.println("\t - " + packages[0] + " packages of 5kg");
        System.out.println("\t - " + packages[1] + " packages of 3kg");
        System.out.println("\t - " + packages[2] + " packages of 1kg");
        System.out.println(romanNumber + " en decimal es: " + fromRomanToDecimal(romanNumber));
        System.out.println(getYearFromDate("05/03/1999"));
        System.out.println("Desde el 08/05/2021 al 08/09/2022 hay " + getNumberOfDaysFromDates("08 09 2021", "08 05 2022"));
        System.out.println("Fibonnaci de 10: " + recursiveFibonacci(10));
        System.out.println("Fibonnaci de 10: " + recursiveFibonacci(10));
    }
}
