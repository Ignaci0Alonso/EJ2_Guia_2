
package Guia_3;

public class Ej_2_extra_2 {

    public static void main(String[] args) {
        String A = "A", B = "B", C = "C", D = "D", aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("A=" + A + "B=" + B + "C=" + C + "D=" + D);
    }

}
