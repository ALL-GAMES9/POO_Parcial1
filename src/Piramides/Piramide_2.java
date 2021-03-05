package Piramides;

import java.util.Scanner;

public class Piramide_2 {

    public Piramide_2() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila;
        System.out.print("¿Cuantas filas desea?: ");
           fila = sc.nextInt();
        for (int i = 0; i <= fila; i++) {
                for (int j = 1; j <= fila - i; j++) {
                System.out.print("");
            }
              for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
