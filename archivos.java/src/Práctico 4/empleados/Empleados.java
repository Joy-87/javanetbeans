package empleados;
public class Empleados {

    // Atributos con encapsulamiento
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático para el contador de empleados
    private static int totalEmpleados = 0;

    // Atributo estático para el generador de IDs
    private static int nextId = 1;

    // Constructor sobrecargado: recibe todos los atributos
    public Empleados(String nombre, String puesto, double salario) {
        // Uso de 'this' para asignar los valores a los atributos
        this.id = nextId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Incrementa el contador estático
    }

    // Constructor sobrecargado: recibe solo nombre y puesto
    public Empleados(String nombre, String puesto) {
        // Uso de 'this' para asignar valores y llamar al otro constructor
        this(nombre, puesto, 25000.0); // Salario por defecto
    }

    // Métodos sobrecargados para actualizarSalario
    // 1. Aumento por porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // 2. Aumento por cantidad fija
    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Sobrescribir el método toString para una representación legible
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: $" + String.format("%.2f", salario);
    }
}