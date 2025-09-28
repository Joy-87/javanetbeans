
package libros;


public class Principal {

    
    public static void main(String[] args) {
        Autor autor = new Autor ("Dan Brown ","Estadounidense");
        Editorial editorial = new Editorial ("Planeta ","diagonal 662");
        Libros libros = new Libros ("El último secreto ", "9788408272993", autor, editorial);
        
        
        
        System.out.println("---Datos del autor---");
        System.out.println("Nombre: "+libros.getAutor().getNombre());
        System.out.println("Nacionalidad: "+libros.getAutor().getNacionalidad());
        
        System.out.println("---Datos del libro---");
        System.out.println("Titulo: "+libros.getTitulo());
        System.out.println("ISBN: "+libros.getIsbn());
        
        System.out.println("---Datos de la editorial---");
        System.out.println("Editorial: "+libros.getEditorial().getNombre());
        System.out.println("Dirección: "+libros.getEditorial().getDireccion());
    }
    
}
