
package libros;


public class Libros {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;


    public Libros(String titulo, String isbn, Autor autor, Editorial editorial){
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }
    public String getTitulo(){
        return titulo;
    } 
    public String getIsbn(){
        return isbn;
    }
    public Autor getAutor(){
        return autor;
    }
    public Editorial getEditorial(){
        return editorial;
    }
}
