
package cuentabancaria;

public class Principal {

    public static void main(String[] args) {
        ClaveSeguridad clave = new ClaveSeguridad("1234AB", "25/08/2025");               
        Titular titular = new Titular("Laura Fernández", "35444111");                
        CuentaBancaria cuenta = new CuentaBancaria("0123456789", "550000.50", clave, titular);
                      
        System.out.println("--- Datos de la Cuenta ---");
        System.out.println("CBU: " + cuenta.getCbu());
        System.out.println("Saldo: $" + cuenta.getSaldo());
                
        System.out.println("\n--- Clave de Seguridad ---");
        System.out.println("Código: " + cuenta.getClaveSeguridad().getCodigo());
        System.out.println("Última Modificación: " + cuenta.getClaveSeguridad().getUltimaModificacion());
        
        System.out.println("\n--- Datos del Titular ---");
        System.out.println("Nombre: " + cuenta.getTitular().getNombre());
                        
        System.out.println("DNI: " + titular.getDni());
        System.out.println("CBU: " + titular.getCuentaBancaria().getCbu());
    }
}
    
    

