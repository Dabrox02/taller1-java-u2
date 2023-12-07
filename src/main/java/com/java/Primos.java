package com.java;

import java.util.Scanner;

public class Primos {
    
    public static void mainPrimos(){
        
        // 2. Escribe un programa en Java que solicite al usuario ingresar un número entero positivo. El programa debe calcular la suma de los dígitos primos en ese número. Por ejemplo, si el número es 12345, la suma sería 2 + 3 + 5 = 10, ya que 2, 3 y 5 son dígitos primos.

        int [] primos = {2, 3, 5, 7};
        int sumaDigitos = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        String numero = entrada.nextLine();
        try {
            int[] numeros = new int[numero.length()]; 
            for (int i = 0; i < numeros.length; i++) {
                if (!Character.isDigit(numero.charAt(i))) {
                    throw new IllegalArgumentException("La cadena contiene caracteres no numéricos.");
                }
                numeros[i] = Character.getNumericValue(numero.charAt(i));
            }

            for (int i : numeros) {
                for (int primo : primos) {
                    if(primo == i){
                        sumaDigitos += i;
                    }
                }
            }
            System.out.println("Suma de digitos primos es: " + sumaDigitos);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        } 

    }

}
