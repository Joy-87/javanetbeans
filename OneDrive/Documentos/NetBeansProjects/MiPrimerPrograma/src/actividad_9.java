import java.util.Scanner;

public class actividad_9 {
    
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Ingresa tu nombre: ");
String nombre = scanner.nextLine(); // ERROR,
System.out.println("Hola, " + nombre);
// El código tenia un error de tipo de dato
// La solución fue cambiar nextInt por nextLine
}
}