package libro;
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    } 
    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }
    // Setter con validación: permite modificar el año de forma controlada
    public void setAnioPublicacion(int nuevoAnio) {
        // Validación: el año debe ser mayor que 0 y no puede ser en el futuro
        if (nuevoAnio > 0 && nuevoAnio <= 2025) { 
            this.anioPublicacion = nuevoAnio;
            System.out.println("El año de publicación ha sido actualizado a: " + nuevoAnio);
        } else {
            System.out.println("Error: El año de publicación no es válido.");
        }
    }
    public void mostrarInfo() {
        System.out.println("--- Información del Libro ---");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Año de Publicación: " + getAnioPublicacion());
    }
}