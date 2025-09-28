
package impuestos;

public class Principal {

    public static void main(String[] args) {        
        Contribuyente contribuyente = new Contribuyente("Ricardo Gómez", "20-33555222-9");
        Impuestos impuestos = new Impuestos(15000.00, contribuyente);
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuestos);
    }
}
    
    

