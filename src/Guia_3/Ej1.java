
package Guia_3;

import java.util.Scanner;



public class Ej1 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int num = consola.nextInt();
        if (num%2 == 0){
            System.out.println("El numero, " + num + ", es par.");  
        }else{
            System.out.println("El numero, " + num + ", es impar.");
        }
    }     
}
