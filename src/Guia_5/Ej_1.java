
package Guia_5;

public class Ej_1 {

    public static void main(String[] args) {
        int[] num;
        num = new int[100];
        /*for (int i = 0; i < 100; i++) {
            num[i] = 100 - i;
        }
        for (int elemento: num) {
            System.out.println(elemento);
            String aux = " " + elemento;
        }*/
        for (int i = 0; i < 100; i++) {
            num[i] = i + 1;
        }
        for (int i = num.length-1; i > -1; i--) {
            System.out.println(num[i]);
        }
    }

}
