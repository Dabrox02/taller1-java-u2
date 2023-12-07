package com.java;

import java.util.Scanner;

public class Perfectos {
    
    public static void mainPerfectos(){

        // 3. Ejercicio de números perfectos. Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo él mismo) es igual al propio número. Por ejemplo, 28 es un número perfecto ya que sus divisores propios (1, 2, 4, 7, 14) suman 28. Escribe un programa en Java que solicite al usuario ingresar un número y determine si es un número perfecto o no.

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int numero = entrada.nextInt();
        int sumaDivisores = 0;
        try {
            int i = 1;
            while (i < numero) {
                if((numero % i) == 0){
                    sumaDivisores += i;
                }
                i++;
            }
            if(sumaDivisores == numero){
                System.out.println("Es un numero perfecto: " + numero);                
            } else {
                System.out.println("No es un numero perfecto: " + numero);
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        } 
    }
}
