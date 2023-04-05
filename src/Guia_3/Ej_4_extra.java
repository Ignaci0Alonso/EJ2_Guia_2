
package Guia_3;

import java.util.Scanner;

public class Ej_4_extra {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        boolean end;
        int num;
        do {
            System.out.println("Ingrese un numero del 1 al 10.");
            num = consola.nextInt();
            if (num<=10 && num>=1) {
                end=false;
            }
        } while (end=true);
        romano(num);
    }
    public static void romano(int num) {
        switch (num) {
            case 1:
                
                break;
            case 2:
                
                break;
        }
    }
}
