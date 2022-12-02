package com.mycompany.seisswitch;

/**
 *
 * @author cisco
 */
public class SeisSwitch {

    public static void main(String[] args) {
        
        int calificacion = 1;
        
        switch(calificacion){
            
            case 7:
                System.out.println("Excelente!");
                break;
            case 6:
                System.out.println("Muy bien!");
                break;
            case 5:
                System.out.println("Bien!");
                break;
            case 4:
                System.out.println("Trabaja más duro!");
                break;
            case 3:
                System.out.println("Reprobaste!");
                break;
            case 2:
                System.out.println("No entendiste nada?!");
                break;
            case 1:
                System.out.println("Que tenias en la cabeza?!");
                break;
        }
    }
}