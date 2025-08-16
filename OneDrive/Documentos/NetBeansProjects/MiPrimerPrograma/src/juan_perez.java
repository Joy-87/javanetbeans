/*Escribe un programa que muestre el siguiente mensaje en consola:
Nombre: Juan Pérez
Edad: 30 años
Dirección: "Calle Falsa 123"
Usa caracteres de escape (\n, \") en System.out.println().*/

public class juan_perez {
    public static void main(String[] args) { //psvm+tab
        String nombre, apellido; 
        nombre = "Juan";
        apellido = " Pérez"; //dejar un espacio despues de las comillas para que al imprimir por consola no se superponga con el nombre 
        int edad = 33;
        String direccion = "Calle Falsa 123";
        System.out.println("Nombre: "+ nombre + apellido +"\nEdad: "+edad+"\nDirección: "+direccion);
    }
}
