package com.mycompany.sietebuclewhile;

/**
 *
 * @author cisco
 */
public class SieteBucleWhile {

    public static void main(String[] args) {
        
        int numeroA = 1;
        int numeroB = 10;
        
        while(numeroA <= 10){
            
            System.out.println(numeroA);
            numeroA++; // incrementa en uno la variable
        }
        
        while(numeroB >= 1){
            
            System.out.println(numeroB);
            numeroB--; // disminuye en uno la variable
        }
    }
}