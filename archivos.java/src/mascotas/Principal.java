
package mascotas;


public class Principal {

   
    public static void main(String[] args) {
        Mascotas mascota = new Mascotas();
        
        mascota.especie = "Canino";
        mascota.nombre = "Sasha";
        mascota.raza = "Boxer";
        mascota.nacimiento = 2020;
        
        mascota.mostrarInfo();
        
        int edad = mascota.calcularEdad();
        System.out.println(mascota.nombre + " cumplio " + edad + " años.");
    }
    
}
