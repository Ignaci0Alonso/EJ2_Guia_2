/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_2_Ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class Ej1_Sumas {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
 int num1;
 int num2;
 System.out.println("Ingrese un numero");
 Scanner leer = new Scanner(System.in);
 num1 = leer.nextByte();
 System.out.println("Ingrese otro numero");
 num2 = leer.nextByte();
 int suma = num1 + num2;
 System.out.println(num1 + " + " + num2 + " = " + suma);
 }	
}
