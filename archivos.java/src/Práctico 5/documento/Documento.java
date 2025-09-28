
package documento;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // REFERENCIA para la Composición

    // Recibe la FirmaDigital en el constructor
    public Documento(String titulo, String contenido, FirmaDigital firmaDigital) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = firmaDigital; // Asocia la Firma (Composición)
    }
    
    public String getTitulo() { 
        return titulo; 
    }
    public String getContenido() { 
        return contenido; 
    }
    public FirmaDigital getFirmaDigital() { 
        return firmaDigital; 
    }
}

