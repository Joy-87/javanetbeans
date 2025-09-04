
package tp2estructuradedatos;

public class ModificarArray {
    public static void main(String[] args) {
        // a. Declarar e inicializar un array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar los valores originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        System.out.println("\n---");

        // c. Modificar el precio de un producto específico (ej. el tercer producto)
        // Recordatorio: Los arrays se indexan desde 0, así que el tercer elemento está en el índice 2
        precios[2] = 129.99;

        // d. Mostrar los valores modificados
        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}