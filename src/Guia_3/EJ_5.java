
package Guia_3;

import java.util.Scanner;

public class EJ_5 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese un limite");
        int lim = consola.nextInt();
        int suma = 0;
        do{
            System.out.println("Ingrese un numero para sumarlo");
            int num = consola.nextInt();
            suma = num + suma;
        } while(suma<=lim);
        System.out.println("El valor final de la suma es: ");
        System.out.println(suma);
    }
}
