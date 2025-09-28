
package computadora;


public class Principal {
    public static void main(String[] args) {
      
        // 1. Creamos un Propietario
        Propietario propietario1 = new Propietario("Carlos García", "35445566");
        
        // 2. Creamos una Computadora, que internamente crea una PlacaMadre y se asocia con el Propietario
        Computadora computadora = new Computadora("HP", "XYZ-12345", propietario1);
        
        // 3. Verificamos los datos
        System.out.println("--- Datos de la Computadora ---");
        System.out.println("Marca: " + computadora.getMarca());
        System.out.println("Número de serie: " + computadora.getNumeroSerie());
        
        System.out.println("\n--- Datos de la Placa Madre ---");
        System.out.println("Modelo: " + computadora.getPlacaMadre().getModelo());
        System.out.println("Chipset: " + computadora.getPlacaMadre().getChipset());
        
        System.out.println("\n--- Datos del Propietario ---");
        System.out.println("Nombre: " + computadora.getPropietario().getNombre());
        System.out.println("DNI: " + computadora.getPropietario().getDni());
        
        System.out.println("\n--- Verificación de la relación bidireccional ---");
        System.out.println("Número de serie de la computadora (desde el Propietario): " + propietario1.getComputadora().getNumeroSerie());
    }
}