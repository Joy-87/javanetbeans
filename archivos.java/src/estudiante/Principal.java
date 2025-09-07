
package estudiante;


public class Principal {

   
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        System.out.println(est1.nombre + " " + est1.apellido + " " + est1.curso + " " + est1.calificacion);
        
        est1.nombre = "Laura";
        est1.apellido = "Rodriguez";
        est1.curso = "Programación";
        est1.calificacion = 8.5;
        
        System.out.println("Estudiante: "+est1.nombre + " " + est1.apellido + " " +"Curso: "+ est1.curso + " " +"Calificación: "+ est1.calificacion);
       
        est1.subirCalificacion(0.5);
        est1.bajarCalificacion(1.0);
        
        est1.mostrarInfo();
    
    }
    
}
