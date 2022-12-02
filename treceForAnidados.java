package com.mycompany.treceforanidados;

/**
 *
 * @author cisco
 */
public class TreceForAnidados {

    public static void main(String[] args) {
        
        int limite = 10;
        
        for (int i = 1; i <= limite; i++){
            
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}