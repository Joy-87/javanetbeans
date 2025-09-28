
package computadora;
public class Computadora {
    
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // Relación de composición
    private Propietario propietario; // Asociación bidireccional

    // El constructor recibe solo los datos de la Computadora y el Propietario
    public Computadora(String marca, String numeroSerie, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        // Composición: se crea la PlacaMadre dentro del constructor
        this.placaMadre = new PlacaMadre("ASUS ROG", "Intel Z590");
        this.propietario = propietario;
        // Asociación bidireccional: establece la conexión de regreso al Propietario
        propietario.setComputadora(this);
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }
    
    public Propietario getPropietario() {
        return propietario;
    }
}