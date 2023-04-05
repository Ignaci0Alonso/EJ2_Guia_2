
package Guia_3;

import java.util.Scanner;

public class Ej_2_equal {
  
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
      
        String palabra;
        do{
         palabra = consola.nextLine();
         if (palabra.equals("eureka")){
             
             System.out.println("Correcto");
         }else{
             System.out.println("Incorrecto");
             
         }  
        }  while(!"eureka".equals(palabra));     
    }
}
