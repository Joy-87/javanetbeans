
package generadorqr;

public class Principal {

    public static void main(String[] args) {
        // 1. Crear el Usuario 
        Usuario usuario = new Usuario("Sofía Ramírez", "sramirez@empresa.com");
        
        // 2. Crear el GeneradorQR
        GeneradorQR generador = new GeneradorQR();
        
        // 3. DEMOSTRAR LA DEPENDENCIA DE CREACIÓN: 
        // GeneradorQR.generar() crea y devuelve un nuevo objeto CodigoQR.
        CodigoQR qrDeAcceso = generador.generar("ACCESO-5588", usuario);        
        System.out.println("Valor del QR: " + qrDeAcceso.getValor());
        System.out.println("Nombre del Usuario asociado (navegación): " + qrDeAcceso.getUsuario().getNombre());
    }
}

