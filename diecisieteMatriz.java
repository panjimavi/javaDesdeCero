package com.mycompany.diecisietematriz;

/**
 *
 * @author cisco
 */
public class DiecisieteMatriz {

    public static void main(String[] args) {
        
        int[][] numero = new int[3][2];
        
        numero[0][0] = 6;
        numero[0][1] = 16;
        numero[1][0] = 26;
        numero[1][1] = 36;
        numero[2][0] = 46;
        numero[2][1] = 56;
        
        System.out.println(numero[2][0]);
    }
}