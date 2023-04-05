
package Guia_4;

import java.util.Scanner;

public class Ej_2 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        boolean end = true;
       do{
            System.out.println("Ingrese nombre.");
            String nombre = consola.nextLine();
            System.out.println("Ingrese la edad.");
            int edad = consola.nextInt();
            consola.nextLine();
            verificarEdad(nombre, edad);
            System.out.println("Desea continuar? s/n");
            String confirm = consola.nextLine();
            if(confirm.equalsIgnoreCase("n")){
                System.out.println("Gracias, adios.");
                end = false;
            }
        } while (end);
        
    }
    public static void verificarEdad(String nombre, int edad){
       if(edad>=18){
            System.out.println(nombre + " es mayor de edad.");
       }else{
            System.out.println(nombre + " es menor de edad.");
       }
        
    }
}
