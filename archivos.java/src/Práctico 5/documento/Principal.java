
package documento;

public class Principal {

    public static void main(String[] args) {
        Usuario usuario = new Usuario (" Julian Alvarez "," jalvarez@gmail.com ");
        FirmaDigital firmaDigital = new FirmaDigital (" al159753 "," 22/09/2025 ", usuario);
        Documento documento = new Documento (" Análitico secundario "," Materias aprobadas ", firmaDigital);
        
        System.out.println("--- Documentación del Documento ---");
        System.out.println("Título: " + documento.getTitulo());
        System.out.println("Contenido: " + documento.getContenido());
        
        
        System.out.println("\n--- Datos de la Firma Digital  ---");
        System.out.println("Código Hash: " + documento.getFirmaDigital().getCodigoHash());
        System.out.println("Fecha de firma: " + documento.getFirmaDigital().getFecha());
        
        
        System.out.println("\n--- Datos del Usuario (desde la Firma) ---");
        System.out.println("Firmado por: " + documento.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Email del firmante: " + documento.getFirmaDigital().getUsuario().getEmail());
    }
}