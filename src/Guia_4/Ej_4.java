
package Guia_4;

import java.util.Scanner;

public class Ej_4 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("ingrese un numero.");
        int num = consola.nextInt();
        if(nprimo(num)){
            System.out.println("No es primo.");
        }else{
            System.out.println("Es primo.");
        }
    }
    public static boolean nprimo(int num){
        boolean confirm = false;
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                confirm = true;
                break;
            }
        }
        return confirm;
    }
}
