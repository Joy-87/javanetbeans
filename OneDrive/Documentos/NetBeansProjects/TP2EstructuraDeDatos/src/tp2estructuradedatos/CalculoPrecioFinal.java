
package tp2estructuradedatos;

import java.util.Scanner;

public class CalculoPrecioFinal {

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Convierte los porcentajes a decimales
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;

        // Aplica la fórmula
        return precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);

        scanner.close();
    }
}
