package Guia_2;

import java.util.Scanner;

public class Ejercicio_5 {
     public static void main(String[] args) {

         Scanner leer = new Scanner(System.in);
         int num = leer.nextInt();
         int doble = num*2;
         int triple = num*3;
         double raiz = Math.sqrt(num);
         System.out.println("El doble de " + num + "es: " + doble);
         System.out.println("El triple de " + num + "es: " + triple);
         System.out.println("La raiz de " + num + "es: " + raiz);
     }
    
}
