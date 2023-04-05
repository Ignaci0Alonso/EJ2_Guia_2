
package Guia_2;

import java.util.Scanner;

public class ej3 {
     public static void main(String[] args) {
         //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
String palabra;
Scanner leer = new Scanner(System.in);
         System.out.println("Ingresar una frase");  
        
palabra = leer.nextLine();
         System.out.println(palabra.toLowerCase());
         System.out.println(palabra.toUpperCase());
     }
}
