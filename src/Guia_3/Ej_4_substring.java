
package Guia_3;

import java.util.Scanner;

public class Ej_4_substring {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String palabra = consola.nextLine();
        String letra = palabra.substring(0);
        if (letra.equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
            
    }

}
