
package tp2estructuradedatos;


import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scanner.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scanner.next().charAt(0);
        categoria = Character.toUpperCase(categoria); // Convierte a mayúscula

        double descuento = 0;
        double precioFinal = 0;
        int porcentajeDescuento = 0;

        if (categoria == 'A') {
            porcentajeDescuento = 10;
        } else if (categoria == 'B') {
            porcentajeDescuento = 15;
        } else if (categoria == 'C') {
            porcentajeDescuento = 20;
        } else {
            System.out.println("Categoría inválida.");
            return; // Termina el programa si la categoría no es válida
        }

        descuento = precioOriginal * porcentajeDescuento / 100;
        precioFinal = precioOriginal - descuento;

        System.out.println("Descuento aplicado: " + porcentajeDescuento + "%");
        System.out.println("Precio final: " + precioFinal);

        scanner.close();
    }
}