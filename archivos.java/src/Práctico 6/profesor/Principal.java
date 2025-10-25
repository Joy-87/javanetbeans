
package profesor;

public class Principal {

    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Tecnológica Central");

        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor("P101", "Dr. Ana Gómez", "Estructuras de Datos");
        Profesor p2 = new Profesor("P102", "Ing. Juan Pérez", "Desarrollo Web");
        Profesor p3 = new Profesor("P103", "Lic. Marta Ríos", "Algoritmos y Lógica");
        
        Curso c1 = new Curso("C201", "Programación Avanzada II");
        Curso c2 = new Curso("C202", "Bases de Datos Relacionales");
        Curso c3 = new Curso("C203", "Introducción a Java");
        Curso c4 = new Curso("C204", "Estructuras Lineales");
        Curso c5 = new Curso("C205", "Backend con Spring");

        // 2. Agregar profesores y cursos a la universidad.
        System.out.println("\n--- TAREA 2: Agregando Profesores y Cursos ---");
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos.
        System.out.println("\n--- TAREA 3: Asignación Inicial de Profesores ---");
        uni.asignarProfesorACurso("C201", "P101"); // Dr. Ana Gómez (Estructuras)
        uni.asignarProfesorACurso("C204", "P101"); // Dr. Ana Gómez (Estructuras)
        uni.asignarProfesorACurso("C202", "P102"); // Ing. Juan Pérez (Web)
        uni.asignarProfesorACurso("C205", "P102"); // Ing. Juan Pérez (Web)
        uni.asignarProfesorACurso("C203", "P103"); // Lic. Marta Ríos (Algoritmos)

        // 4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("\n--- TAREA 4: Verificación Inicial de Relaciones ---");
        uni.listarCursos();
        uni.listarProfesores();
        p1.listarCursos();
        p2.listarCursos();
        
        // 5. Cambiar el profesor de un curso y verificar sincronización.
        System.out.println("\n--- TAREA 5: Cambiar Profesor de C205 (Juan -> Ana) ---");
        // El curso C205 pasa de P102 (Juan) a P101 (Ana)
        uni.asignarProfesorACurso("C205", "P101"); 
        
        System.out.println("\n--- Verificación post-cambio: Juan (P102) ya no tiene C205 ---");
        p2.listarCursos(); // Debe quedar solo C202
        System.out.println("\n--- Verificación post-cambio: Ana (P101) tiene ahora C205 ---");
        p1.listarCursos(); // Debe tener C201, C204 y C205
        
        // 6. Remover un curso (C203) y confirmar que ya no aparece en la lista del profesor (P103).
        System.out.println("\n--- TAREA 6: Eliminar Curso C203 ---");
        uni.eliminarCurso("C203"); 
        
        System.out.println("\n--- Verificación post-eliminación: Marta (P103) no debe tener cursos ---");
        p3.listarCursos();
        
        // 7. Remover un profesor (P102) y dejar profesor = null en los cursos que dictaba (C202).
        System.out.println("\n--- TAREA 7: Eliminar Profesor P102 (Juan Pérez) ---");
        uni.eliminarProfesor("P102");
        
        System.out.println("\n--- Verificación post-eliminación: Curso C202 debe quedar sin profesor ---");
        uni.buscarCursoPorCodigo("C202").mostrarInfo();

        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        uni.mostrarReporteCursosPorProfesor();
    }
}
    
