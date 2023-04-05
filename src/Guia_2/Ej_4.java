
package Guia_2;

import java.util.Scanner;

public class Ej_4 { 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados: ");
        double gradosCentigrados = leer.nextDouble();
        double gradosFahrenheit = 32 + (9 * gradosCentigrados / 5);
        System.out.println("La temperatura ingresada de: " + gradosCentigrados);
        System.out.println("En Fahrenheit es: " + gradosFahrenheit);
}
}
