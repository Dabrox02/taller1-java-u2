package com.java;

import java.util.Scanner;

public class Cajero {
    
    public static void mainCajero(){
        // 1. Escribe un programa en Java que simule un sistema bancario simple. El programa debe permitir al usuario realizar depósitos, realizar retiros (basado en el saldo. Si el retiro es posible debe indicar cuales billetes entrega el cajero teniendo en cuenta que solo se dan billetes de 50.000, 20.000, 10.000) y consultar su saldo. 

        Scanner entrada = new Scanner(System.in);
        int[] billetesDisponibles = {10, 3, 4};
        boolean sistema = true;
        double saldo = 0;
        while (sistema) {
            try {
                System.out.println("""
======================
1. Consultar saldo
2. Depositar saldo
3. Retirar saldo
4. Consultar billetes cajero
5. Salir del sistema
======================
""");
                int opc = entrada.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Saldo disponible: " + saldo);                        
                        break;
                    case 2:
                        System.out.println("Saldo disponible: " + saldo);   
                        System.out.print("Ingrese el dinero a depositar: ");                     
                        double saldoACargar = entrada.nextInt();
                        saldo += saldoACargar;
                        System.out.println("Nuevo saldo: " + saldo);                        
                        break;
                    case 3:
                        System.out.println("Saldo disponible: " + saldo);                        
                        if(saldo <= 0){
                            System.out.println("No posee dinero suficiente para retirar");
                        } else {
                            System.out.print("Ingrese el dinero a retirar: ");
                            double saldoARetirar = entrada.nextDouble();

                            if((billetesDisponibles[0] * 50000 + billetesDisponibles[1] * 20000 + billetesDisponibles[2] * 10000) <= saldoARetirar){
                                System.out.println("No hay dinero disponible");
                                break;
                            } 
                            int[] billetes = new int[3];
                            if(saldo >= saldoARetirar){
                                if(billetesDisponibles[0] > 0){
                                    while(saldoARetirar >= 50000){
                                        saldoARetirar = saldoARetirar - 50000;
                                        billetes[0]++;
                                        billetesDisponibles[0]--;
                                        if(billetesDisponibles[0] <= 0) break;
                                    }
                                }
                                if(billetesDisponibles[1] > 0){
                                    while (saldoARetirar >= 20000) {
                                        saldoARetirar = saldoARetirar - 20000;
                                        billetes[1]++;
                                        billetesDisponibles[1]--;
                                        if(billetesDisponibles[1] <= 0) break;
                                    }
                                }
                                if(billetesDisponibles[2] > 0){
                                    while (saldoARetirar >= 10000) {
                                        saldoARetirar = saldoARetirar - 10000;
                                        billetes[2]++;
                                        billetesDisponibles[2]--;
                                        if(billetesDisponibles[2] <= 0) break;
                                    }
                                } 
                            }
                            System.out.println("------------ Retiro -----------");
                            System.out.println("Billetes 50000: " + billetes[0]);
                            System.out.println("Billetes 20000: " + billetes[1]);
                            System.out.println("Billetes 10000: " + billetes[2]);
                            saldo = saldo - (billetes[0] * 50000 + billetes[1] * 20000 + billetes[2] * 10000);
                            System.out.println("Se retiro: " +  (billetes[0] * 50000 + billetes[1] * 20000 + billetes[2] * 10000));
                            System.out.println("Saldo disponible: " + saldo);
                            System.out.println("-------------------------------");                    
                        }
                        break;
                    case 4:
                        System.out.println("-------- Billetes disponible cajero ---------");
                        System.out.println("Billetes 50000: " + billetesDisponibles[0]);
                        System.out.println("Billetes 20000: " + billetesDisponibles[1]);
                        System.out.println("Billetes 10000: " + billetesDisponibles[2]);
                        System.out.println("Dinero cajero Disponible: " + (billetesDisponibles[0] * 50000 + billetesDisponibles[1] * 20000 + billetesDisponibles[2] * 10000));
                        System.out.println("---------------------------------------------");
                        break;
                    case 5:
                        System.out.println("Adios...");
                        sistema = false;
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }
    }

}
