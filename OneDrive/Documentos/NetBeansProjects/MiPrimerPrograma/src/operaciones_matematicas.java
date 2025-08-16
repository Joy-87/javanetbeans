import java.util.Scanner;
        
public class operaciones_matematicas {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        
        System.out.println("Ingrese dos números para realizar las operaciones de suma, resta, división y multiplicación: ");
        
        System.out.print ("Ingrese el primer número: ");
        int num1 = input.nextInt(); 
        
        System.out.print ("Ingrese el segundo número mayor a cero: ");
        int num2 = input.nextInt();
        
        System.out.println("suma: "+ (num1 + num2));
        System.out.println("Resta: "+(num1 - num2));
        System.out.println("División: "+(num1/num2));
        System.out.println("Multiplicación: "+ (num1*num2));
        
    }
  
}
