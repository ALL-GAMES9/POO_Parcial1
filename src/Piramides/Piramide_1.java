package Piramides;

import java.util.Scanner;


public class Piramide_1 {

    public Piramide_1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("¿Cuantas filas desea?: ");
        numero = sc.nextInt();
        for (int i = 0; i < numero; i++) {
            for (int j =numero -1; j >i; j--){
                System.out.print(" ");
            }
            for (int f = 0; f <=(i*2); f++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}