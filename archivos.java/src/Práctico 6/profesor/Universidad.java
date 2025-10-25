
package profesor;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        System.out.println("Universidad " + nombre + " creada.");
    }

    // Métodos de gestión
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
        System.out.println("✅ Profesor agregado: " + p.getNombre());
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
        System.out.println("✅ Curso agregado: " + c.getNombre());
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Asigna un profesor a un curso usando el método setProfesor del Curso, 
     * lo cual garantiza la sincronización bidireccional.
     */
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);

        if (c == null) {
            System.out.println("⚠️ Error: Curso con código " + codigoCurso + " no encontrado.");
            return;
        }
        if (p == null) {
            System.out.println("⚠️ Error: Profesor con ID " + idProfesor + " no encontrado.");
            return;
        }

        c.setProfesor(p);
        System.out.println("👍 Asignación: " + p.getNombre() + " asignado al curso " + c.getNombre());
    }

    public void listarProfesores() {
        System.out.println("\n--- Profesores de la " + nombre + " ---");
        profesores.forEach(Profesor::mostrarInfo);
    }

    public void listarCursos() {
        System.out.println("\n--- Cursos de la " + nombre + " ---");
        cursos.forEach(Curso::mostrarInfo);
    }

    /**
     * Elimina un curso. Debe romper la relación con su profesor.
     */
    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            // Romper la relación antes de eliminar. El setProfesor(null) 
            // se encarga de eliminarlo de la lista del profesor.
            c.setProfesor(null); 
            cursos.remove(c);
            System.out.println("❌ Curso eliminado: " + c.getNombre());
        } else {
            System.out.println("⚠️ Error: Curso " + codigo + " no encontrado para eliminar.");
        }
    }

    /**
     * Elimina un profesor. Debe dejar en null la referencia en todos sus cursos.
     */
    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            // Copiamos la lista para evitar problemas al modificarla mientras iteramos
            List<Curso> cursosADesvincular = new ArrayList<>(p.getCursos());
            
            // Desvincular: llama a setProfesor(null) para cada curso
            for (Curso c : cursosADesvincular) {
                System.out.println("   - Desvinculando curso " + c.getCodigo());
                c.setProfesor(null); 
            }
            
            profesores.remove(p);
            System.out.println("❌ Profesor eliminado: " + p.getNombre() + " y sus cursos desvinculados.");
        } else {
            System.out.println("⚠️ Error: Profesor " + id + " no encontrado para eliminar.");
        }
    }
    
    /**
     * Muestra un reporte simple de cursos por profesor.
     */
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n--- REPORTE: Cantidad de Cursos por Profesor ---");
        for(Profesor p : profesores) {
            System.out.printf(" - %s (%s): %d cursos%n", p.getNombre(), p.getId(), p.getCursos().size());
        }
        System.out.println("-------------------------------------------------");
    }
}
