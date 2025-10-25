
package biblioteca;

public class Libro {
    private String isbn;
    private String titulo; 
    private int anioPublicacion;
    private Autor autor; 

    // Constructor completo
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }
    
    // ⭐ MÉTODO AÑADIDO PARA LA CORRECCIÓN ⭐
    public String getTitulo() { 
        return titulo; 
    }
    // ----------------------------------------

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public Autor getAutor() {
        return autor;
    }

    // Método requerido: mostrarInfo()
    public void mostrarInfo() {
        System.out.printf("   - Título: %s | ISBN: %s | Año: %d%n",
                          this.titulo, this.isbn, this.anioPublicacion);
        // Muestra la información del autor asociado
        System.out.print("     ");
        this.autor.mostrarInfo();
    }
    
    // Sobreescritura de toString()
    @Override
    public String toString() {
        return String.format("Libro [ISBN=%s, Título='%s', Año=%d, Autor='%s']",
                             isbn, titulo, anioPublicacion, autor.getNombre());
    }
}
