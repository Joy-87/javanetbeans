
package celular;


public class Principal {


    public static void main(String[] args) {
        // 1. Creamos un objeto Bateria que puede existir por sí mismo
        Bateria bateria = new Bateria("Li-1234", 4500);

        // 2. Creamos un objeto Usuario que puede existir por sí mismo
        Usuario usuario = new Usuario("Maria Lopez", "98765432");

        // 3. Creamos un objeto Celular, pasándole las instancias de Bateria y Usuario
        Celular celular1 = new Celular("1122334455", "Samsung", "S21", bateria, usuario);

        // 4. Verificamos las relaciones
        
        System.out.println("Datos del Celular:");
        System.out.println("  Marca: " + celular1.getMarca());
        System.out.println("  IMEI: " + celular1.getImei());
        
        System.out.println("\nDatos de la Batería (a través del Celular):");
        System.out.println("  Modelo de la Batería: " + celular1.getBateria().getModelo());
        
        System.out.println("\nDatos del Usuario (a través del Celular):");
        System.out.println("  Nombre del Usuario: " + celular1.getUsuario().getNombre());
        
        System.out.println("\nVerificamos la bidireccionalidad:");
        System.out.println("  Marca del celular del Usuario: " + usuario.getCelular().getMarca());
    }
}   
 