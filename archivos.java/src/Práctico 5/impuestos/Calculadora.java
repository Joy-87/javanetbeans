
package impuestos;

public class Calculadora {
     public void calcular(Impuestos impuestos) {
        
        double montoBase = impuestos.getMonto();
        double totalCalculado = montoBase * 1.21; // Ejemplo: agrega 21% de IVA
        
        System.out.println("--- CÁLCULO DE IMPUESTO ---");
        System.out.println("Contribuyente: " + impuestos.getContribuyente().getNombre());
        System.out.println("Monto Base: $" + montoBase);
        System.out.println("Monto Total (+IVA): $" + totalCalculado);        
    }
}

