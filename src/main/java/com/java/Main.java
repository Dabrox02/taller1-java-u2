package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean sistema = true;
        Scanner entrada = new Scanner(System.in);

        while (sistema) {
            System.out.println("""
======================
1. Ejercicio Cajero
2. Ejercicio primos
3. Ejercicio numeros perfectos
4. Salir 
======================
            """);
            try {
                int opc = entrada.nextInt();
                switch (opc) {
                    case 1:
                        Cajero.mainCajero();
                        break;
                    case 2:
                        Primos.mainPrimos();
                        break;
                    case 3:
                        Perfectos.mainPerfectos();
                        break;
                    case 4:
                        sistema = false;
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } 
        entrada.close();
    }
}