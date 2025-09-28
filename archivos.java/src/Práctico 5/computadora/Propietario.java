
package computadora;


public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // Relación bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    // Método para establecer la relación con la Computadora
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    
    // Método para obtener la Computadora
    public Computadora getComputadora() {
        return computadora;
    }
}