
package tp2estructuradedatos;

import java.util.Scanner;

public class SumaParesWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaPares = 0;
        int numero;

        System.out.println("Ingrese números (0 para terminar):");
        while (true) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break; // Sale del bucle si el usuario ingresa 0
            }

            if (numero % 2 == 0) {
                sumaPares += numero; // Suma solo los números pares
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
        scanner.close();
    }
}