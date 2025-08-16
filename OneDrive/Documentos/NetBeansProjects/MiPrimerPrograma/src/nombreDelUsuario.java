
import java.util.Scanner;


public class nombreDelUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        String nombre;
        int edad;
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        System.out.println(nombre);
        System.out.println(edad);
    }
 
}
