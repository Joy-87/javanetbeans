
package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Biblioteca {
    private String nombre;
    // Atributo: Colección dinámica de libros
    private List<Libro> libros;

    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        // La composición se modela inicializando la colección aquí.
        this.libros = new ArrayList<>();
        System.out.println("✅ Biblioteca '" + nombre + "' creada.");
    }

    /**
     * Agrega un nuevo libro a la biblioteca.
     */
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        // Se crea el objeto Libro directamente al agregar, lo que refuerza la composición.
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
        System.out.println("✅ Libro agregado: " + titulo + " (ISBN: " + isbn + ")");
    }

    /**
     * Muestra la información de todos los libros.
     */
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("📦 La biblioteca está vacía.");
            return;
        }
        System.out.println("--- Libros en " + nombre + " (" + libros.size() + " en total) ---");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
        System.out.println("------------------------------------------------------------------");
    }

    /**
     * Busca un libro por su ISBN.
     * @return El Libro si se encuentra, o null.
     */
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Elimina un libro por su ISBN.
     */
    public void eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            // En composición, al eliminar de la colección (contenedor),
            // el objeto contenido se considera eliminado.
            System.out.println("❌ Libro eliminado: " + libroAEliminar.getTitulo());
        } else {
            System.out.println("⚠️ Error: Libro con ISBN " + isbn + " no encontrado.");
        }
    }

    /**
     * Retorna la cantidad total de libros.
     */
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    /**
     * Filtra y lista libros por un año de publicación específico.
     */
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n--- Libros publicados en el año " + anio + " ---");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros publicados en ese año.");
        }
        System.out.println("--------------------------------------------------");
    }
    
    /**
     * Muestra todos los autores únicos de los libros disponibles.
     */
    public void mostrarAutoresDisponibles() {
        // Usamos un HashSet para garantizar que cada autor se liste una sola vez
        Set<Autor> autoresUnicos = new HashSet<>();
        for (Libro libro : libros) {
            autoresUnicos.add(libro.getAutor());
        }

        System.out.println("\n--- Autores Disponibles en la Biblioteca ---");
        if (autoresUnicos.isEmpty()) {
            System.out.println("No hay libros, por lo tanto, no hay autores.");
            return;
        }
        for (Autor autor : autoresUnicos) {
            autor.mostrarInfo();
        }
        System.out.println("----------------------------------------------");
    }
}
