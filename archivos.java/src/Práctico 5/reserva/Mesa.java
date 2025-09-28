
package reserva;


public class Mesa {
    private String numero;
    private String capacidad;
    
    public Mesa ( String numero, String capacidad){
        this.numero = numero;
        this.capacidad = capacidad;
    }
    public String getNumero(){
        return numero;
    }
    public String getCapacidad(){
        return capacidad;
    }
}
