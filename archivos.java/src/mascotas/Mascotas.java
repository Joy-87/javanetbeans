
package mascotas;

import java.util.Scanner;


public class Mascotas {
    String nombre;
    String especie;
    String raza;
    int nacimiento;
    
    
    public void mostrarInfo(){
        System.out.println("Mascota");
        System.out.println(especie + " de nombre: " + nombre);
        System.out.println("Nació en el año " + nacimiento );
        
    }
    public int calcularEdad(){
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese el año actual: ");
        int anio = input.nextInt();
        return (anio - this.nacimiento);
    }
}
