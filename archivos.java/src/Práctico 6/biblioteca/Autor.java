
package biblioteca;

public class Autor {
    
    private String id;
    private String nombre;
    private String nacionalidad;

    // Constructor completo
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    // Método requerido: mostrarInfo()
    public void mostrarInfo() {
        System.out.printf("  [Autor] ID: %s | Nombre: %s | Nacionalidad: %s%n",
                          this.id, this.nombre, this.nacionalidad);
    }
    
    // Sobreescritura de toString() para mejor visualización
    @Override
    public String toString() {
        return String.format("%s (%s - %s)", nombre, id, nacionalidad);
    }
}

