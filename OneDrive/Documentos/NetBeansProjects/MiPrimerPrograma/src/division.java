import java.util.Scanner;

public class division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = num1 / num2;
        
        System.out.println("El resultado de la división con decimales es: " + resultado);
        
        
    }
}