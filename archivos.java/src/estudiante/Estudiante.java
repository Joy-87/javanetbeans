/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante;

/**
 *
 * @author u7ser
 */
public class Estudiante {
    
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    public void subirCalificacion(double puntos){
        this.calificacion += puntos;
        System.out.println("Calificación de " + this.nombre + " subió " + puntos + " puntos.");
    }
    public void bajarCalificacion(double puntos){
        this.calificacion -= puntos;
        System.out.println("Calificación de " + this.nombre + " subió " + puntos + " puntos.");    
    }
    public void mostrarInfo(){
        System.out.println("Información del estudiante ");
        System.out.println("Nombre y Apellido: " + this.nombre +" "+ apellido);
        System.out.println("Curso: " + this.curso);
        System.out.println("Calificación: " + this.calificacion);
    }
}
