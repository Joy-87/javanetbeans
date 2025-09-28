
package generadorqr;

public class GeneradorQR {
    public CodigoQR generar(String valor, Usuario usuario) {
        System.out.println("\n--- GENERANDO CÓDIGO QR ---");
                
        CodigoQR nuevoCodigo = new CodigoQR(valor, usuario);
        
        System.out.println("Generación completada para " + usuario.getNombre());
        return nuevoCodigo;
    }
}

