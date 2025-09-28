
package tarjetadecredito;


public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetadecredito;
    
    public Cliente( String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDni(){
        return dni;
    }
    public TarjetaDeCredito getTarjetadecredito(){
        return tarjetadecredito;
    }
    public void setTarjetadecredito(TarjetaDeCredito tarjetadecredito){
        this.tarjetadecredito = tarjetadecredito;
    }
}
