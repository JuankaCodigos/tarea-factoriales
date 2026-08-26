package org.example;
import java.util.Scanner;
public class Main {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Ingrese el numero que desea calcular");
        int numero=entrada.nextInt();
        int factorialacum=1;
        long TIEMPO_PARTIDA= System.nanoTime();
for(int i=1; i<=numero;i++){
    factorialacum=factorialacum*i;
}
        long TIEMPO_TERMINO= System.nanoTime();
        System.out.println(factorialacum);
        double tiempototal=(TIEMPO_TERMINO-TIEMPO_PARTIDA)/1000000.0;
        System.out.println("Tiempo "+tiempototal+" milisegundo");
    }






}