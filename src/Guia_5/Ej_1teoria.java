
package Guia_5;

import java.util.Scanner;

public class Ej_1teoria {

    public static void main(String[] args) {
        String[] equipo;
        equipo = new String[8];
        nombres(equipo);
    }
    public static void nombres(String[] nombre) {
        Scanner consola = new Scanner(System.in);
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Ingrese el nombre del miembro del equipo.");
            nombre[i] = consola.nextLine();
        }
        System.out.println("Los miembros ingresados son:");
        for (int i = 0; i < 8; i++) {
            System.out.println(nombre[i]);
        }
        
    }
}
