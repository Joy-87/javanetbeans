
package empleados;


public class Principal {

    public static void main(String[] args) {
       
        System.out.println("--- Creación de empleados ---");

        // Instancia un empleado usando el constructor completo
        Empleados emp1 = new Empleados("Juan Pérez", "Desarrollador", 50000.0);
        System.out.println(emp1);

        // Instancia un empleado usando el constructor con salario por defecto
        Empleados emp2 = new Empleados("Ana García", "Diseñadora Gráfica");
        System.out.println(emp2);

        // Instancia un tercer empleado para verificar el contador
        Empleados emp3 = new Empleados("Carlos López", "Gerente", 85000.0);
        System.out.println(emp3);
        System.out.println("\n--- Total de empleados creados: " + Empleados.mostrarTotalEmpleados() + " ---\n");

        System.out.println("--- Aumentos salariales ---");

        // Aumentar salario de emp1 en un porcentaje
        emp1.actualizarSalario(10.0); // Aumento del 10%
        System.out.println("Salario actualizado de " + emp1.getNombre() + " (aumento por porcentaje):");
        System.out.println(emp1);

        // Aumentar salario de emp2 en una cantidad fija
        emp2.actualizarSalario(5000); // Aumento de $5000
        System.out.println("\nSalario actualizado de " + emp2.getNombre() + " (aumento por cantidad fija):");
        System.out.println(emp2);

        System.out.println("\n--- Total de empleados final: " + Empleados.mostrarTotalEmpleados() + " ---");
    }
}
    