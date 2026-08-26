package org.example;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    public static long factorial(int numero) {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Ingrese el numero que desea calcular");
        int numero = entrada.nextInt();
        long TIEMPO_PARTIDA = System.nanoTime();
        long resultado = factorial(numero);
        long TIEMPO_TERMINO = System.nanoTime();
        System.out.println("Factorial: " + resultado);
        double tiempototal =
                (TIEMPO_TERMINO - TIEMPO_PARTIDA) / 1000000.0;
        System.out.println("Tiempo " + tiempototal + " milisegundo");
    }
}