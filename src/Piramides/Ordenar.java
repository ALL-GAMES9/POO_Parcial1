package Piramides;

import java.util.Scanner;

public class Ordenar {

    private int numero[];
    private int cantidad, aux;
    Scanner sc = new Scanner(System.in);
    
    public Ordenar(){
        System.out.println("Ordenar Numeros de mayor a menor\n");
    }
    
    public void dato(){
        System.out.print("Cantidad de numeros a ordenar: ");
        cantidad = sc.nextInt();
        
        numero = new int[cantidad];
        
        for(int i=0; i<cantidad; i++){
            System.out.print("Escribe tu numero: ");
            numero[i] = sc.nextInt();
        }
    }
    public void proceso(){
        for(int i=0; i<(cantidad-1); i++){
            for(int j=0; j<(cantidad-1); j++){
                if(numero[j]>numero[j+1]){
                aux = numero[j];
                numero[j] = numero[j+1];
                numero[j+1] = aux;
                }
            }
        }
        System.out.println("El orden correcto es el siguiente: ");
        for(int i=0; i<cantidad; i++){
            System.out.print(numero[i] + ", ");
    }
        System.out.println(" ");
    }
    public static void main(String[] args) {
      
        Ordenar exe = new Ordenar();
        
        exe.dato();
        exe.proceso();
    }
    
}