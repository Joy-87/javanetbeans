
package biblioteca;

public class Principal {

    public static void main(String[] args) {
        // 1. Creamos una biblioteca.
        System.out.println("--- TAREA 1: Creación de Biblioteca ---");
        Biblioteca biblioCentral = new Biblioteca("Biblioteca Central POO");
        System.out.println("\n");
        
        // 2. Crear al menos tres autores
        System.out.println("--- TAREA 2: Creación de Autores ---");
        Autor autorA = new Autor("AU001", "Gabriel García Márquez", "Colombiana");
        Autor autorB = new Autor("AU002", "Jane Austen", "Británica");
        Autor autorC = new Autor("AU003", "Jorge Luis Borges", "Argentina");
        
        autorA.mostrarInfo();
        autorB.mostrarInfo();
        autorC.mostrarInfo();
        System.out.println("\n");

        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        System.out.println("--- TAREA 3: Agregar 5 Libros ---");
        biblioCentral.agregarLibro("978-0123-4567-8", "Cien años de soledad", 1967, autorA);
        biblioCentral.agregarLibro("978-1234-5678-9", "Orgullo y Prejuicio", 1813, autorB);
        biblioCentral.agregarLibro("978-2345-6789-0", "Ficciones", 1944, autorC);
        biblioCentral.agregarLibro("978-3456-7890-1", "El amor en los tiempos del cólera", 1985, autorA);
        biblioCentral.agregarLibro("978-4567-8901-2", "Emma", 1815, autorB);
        System.out.println("\n");

        // 4. Listar todos los libros con su información y la del autor.
        System.out.println("--- TAREA 4: Listar todos los libros y autores ---");
        biblioCentral.listarLibros();
        System.out.println("\n");

        // 5. Buscar un libro por su ISBN (978-2345-6789-0) y mostrar su información.
        System.out.println("--- TAREA 5: Buscar Libro por ISBN (978-2345-6789-0) ---");
        Libro libroBuscado = biblioCentral.buscarLibroPorIsbn("978-2345-6789-0");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
        System.out.println("\n");
        
        // 6. Filtrar y mostrar los libros publicados en un año específico (1813).
        System.out.println("--- TAREA 6: Filtrar Libros por Año (1813) ---");
        biblioCentral.filtrarLibrosPorAnio(1813);
        System.out.println("\n");

        // 7. Eliminar un libro por su ISBN (978-4567-8901-2) y listar los libros restantes.
        System.out.println("--- TAREA 7: Eliminar Libro (978-4567-8901-2) y Listar Restantes ---");
        biblioCentral.eliminarLibro("978-4567-8901-2");
        biblioCentral.listarLibros();
        System.out.println("\n");

        // 8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("--- TAREA 8: Mostrar Cantidad Total de Libros ---");
        int cantidad = biblioCentral.obtenerCantidadLibros();
        System.out.println("🔢 Cantidad total de libros en la biblioteca: " + cantidad);
        System.out.println("\n");
        
        // 9. Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("--- TAREA 9: Listar Autores Disponibles ---");
        biblioCentral.mostrarAutoresDisponibles();
    }
}
    