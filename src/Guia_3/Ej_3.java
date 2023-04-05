
package Guia_3;

import java.util.Scanner;

public class Ej_3 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingrese una frase con 8 caracteres");
        String frase = consola.nextLine();
        System.out.println(frase);
        if (8 == frase.length()){
            System.out.println("Correcto"); 
        }else if (8 > frase.length()){
            System.out.println("La frase es muy corta");
             System.out.println("Incorrecto");
        }else if (8< frase.length()){
            System.out.println("La frase es muy larga");
             System.out.println("Incorrecto");
        }
    }

}
