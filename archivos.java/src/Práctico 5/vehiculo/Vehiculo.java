
package vehiculo;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Conductor conductor; //Relación Bidireccional
    private Motor motor;
    
    public Vehiculo (String patente, String modelo, Conductor conductor,Motor motor){
        this.patente = patente;
        this.modelo = modelo;
       // 1. Establece la relación con el Conductor
        this.conductor = conductor;
        conductor.setVehiculo(this);
        
        // 2. Establece la relación con el Motor
        this.motor = motor;
    }
    public String getPatente(){
        return patente;
    }
    public String getModelo(){
        return modelo;
    }
     public Conductor getConductor(){
        return conductor;
    }
    public Motor getMotor(){
        return motor;
    }
    
}

