
package libro;


public class Principal {

    
    public static void main(String[] args) {
        // 1. Crear un libro
        Libro miLibro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);

        // Mostrar información inicial
        miLibro.mostrarInfo();

        // 2. Intentar modificar el año con un valor inválido
        System.out.println("\nIntentando cambiar el año a un valor inválido (-100):");
        miLibro.setAnioPublicacion(-100);

        // 3. Intentar modificar el año con un valor válido
        System.out.println("\nIntentando cambiar el año a un valor válido (1982):");
        miLibro.setAnioPublicacion(1982);

        // 4. Mostrar la información final
        System.out.println("\n--- Información final del Libro ---");
        miLibro.mostrarInfo();
    
        
    }
    
}
