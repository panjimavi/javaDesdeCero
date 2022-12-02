package com.mycompany.cuatroif;

/**
 *
 * @author cisco
 */
public class CuatroIf {

    public static void main(String[] args) {
        
        if(5 > 4){ // mayor que
            System.out.println("La condicion es verdadera");
        }else {
            System.out.println("La condicion es falsa");
        }
        
        if(5 != 4){ // es distindo
            System.out.println("La condicion es verdadera");
        }else {
            System.out.println("La condicion es falsa");
        }
        
        if(5 == 4){ // es igual
            System.out.println("La condicion es verdadera");
        }else {
            System.out.println("La condicion es falsa");
        }
        
        if(5 > 4 && 9 < 2){ // Operador and, debe cumplir ambas condiciones
            System.out.println("La condicion es verdadera");
        }else {
            System.out.println("La condicion es falsa");
        }
        
        if(5 > 4 || 9 < 2){ // Operador or, debe cumplir al menos una de las condiciones
            System.out.println("La condicion es verdadera");
        }else {
            System.out.println("La condicion es falsa");
        }
        
        if(!(5 == 3)){ // Operador not, devuelve como resultado el valor de este invertido
            System.out.println("La condicion es verdadera");
        }else {
            System.out.println("La condicion es falsa");
        }

    }
}