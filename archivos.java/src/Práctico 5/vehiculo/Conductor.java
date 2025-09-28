
package vehiculo;


public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; //Relación Bidireccional
    
    public Conductor( String nombre, String licencia){
        this(nombre, licencia, null);
    }
    public Conductor( String nombre, String licencia, Vehiculo vehiculo){
        this.nombre = nombre;
        this.licencia = licencia; 
        this.vehiculo = vehiculo;
    }
    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }
    
    // Método para establecer la relación con el vehiculo
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    // Método para obtener el vehiculo
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}

