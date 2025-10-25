
package profesor;

public class Curso {
    private String codigo;
    private String nombre;
    // Referencia al objeto Profesor (lado '1' de la relación)
    private Profesor profesor; 

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // Inicialmente sin profesor asignado
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * ⭐ MÉTODO CLAVE PARA SINCRONIZACIÓN EXTERNA ⭐
     * Asigna o cambia el profesor, garantizando la coherencia bidireccional.
     * @param nuevoProfesor El nuevo profesor a asignar (puede ser null).
     */
    public void setProfesor(Profesor nuevoProfesor) {
        // 1. Romper la relación previa (si existe)
        if (this.profesor != null) {
            // Se quita de la lista del profesor anterior sin que el profesor 
            // intente sincronizar de vuelta a este curso (evita ciclo).
            this.profesor.getCursos().remove(this); 
        }

        // 2. Establecer la nueva relación
        this.profesor = nuevoProfesor;

        // 3. Establecer la relación inversa (si el nuevo profesor no es null)
        if (nuevoProfesor != null) {
            // Se agrega a la lista del nuevo profesor sin que el profesor 
            // intente sincronizar de vuelta a este curso (evita ciclo).
            if (!nuevoProfesor.getCursos().contains(this)) {
                nuevoProfesor.getCursos().add(this);
            }
        }
        
        System.out.println("🔄 Relación actualizada para el curso " + codigo);
    }
    
    /**
     * ⭐ MÉTODO INTERNO PARA SINCRONIZACIÓN BIDIRECCIONAL ⭐
     * Usado internamente por Profesor.agregarCurso/eliminarCurso para 
     * evitar recursión infinita (ciclo).
     */
    public void setProfesorInterno(Profesor p) {
        this.profesor = p;
    }

    /**
     * Muestra código, nombre y nombre del profesor (si tiene).
     */
    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "SIN ASIGNAR";
        System.out.printf("📚 Curso [%s] %s | Profesor: %s%n",
                          codigo, nombre, nombreProfesor);
    }
}