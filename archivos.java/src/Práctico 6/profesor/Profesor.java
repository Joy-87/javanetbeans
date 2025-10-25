
package profesor;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    // La lista de cursos que dicta (lado 'N' de la relación)
    private List<Curso> cursos; 

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public List<Curso> getCursos() {
        return cursos;
    }

    /**
     * Agrega el curso a su lista si no está y SINCRONIZA el lado del curso 
     * (llama a setProfesor del Curso, pero debe evitar un ciclo infinito).
     * @param c El curso a agregar.
     */
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            // Sincronización: asigna ESTE profesor al curso,
            // pero indicando que no debe volverse a llamar a agregarCurso.
            c.setProfesorInterno(this); 
        }
    }

    /**
     * Quita el curso de su lista y SINCRONIZA el lado del curso 
     * (deja profesor en null si corresponde).
     * @param c El curso a eliminar.
     */
    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            // Sincronización: quita la referencia del curso,
            // pero indicando que no debe volverse a llamar a eliminarCurso.
            c.setProfesorInterno(null); 
        }
    }

    /**
     * Muestra el ID, nombre, especialidad y la cantidad de cursos que dicta.
     */
    public void mostrarInfo() {
        System.out.printf("🧑‍🏫 Profesor ID: %s | Nombre: %s | Especialidad: %s | Cursos Dictados: %d%n",
                          id, nombre, especialidad, cursos.size());
    }

    /**
     * Muestra el código y nombre de los cursos que dicta.
     */
    public void listarCursos() {
        System.out.println("   --- Cursos de " + nombre + " (" + cursos.size() + ") ---");
        if (cursos.isEmpty()) {
            System.out.println("   (No dicta cursos actualmente)");
        }
        for (Curso c : cursos) {
            System.out.printf("   - [%s] %s%n", c.getCodigo(), c.getNombre());
        }
        System.out.println("   ----------------------------------------");
    }
    
    @Override
    public String toString() {
        return nombre + " (ID: " + id + ")";
    }
}