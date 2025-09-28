
package naveespacial;
public class NaveEspacial {
    String nombre;
    double combustible;
    private static final double LIMITE_COMBUSTIBLE = 100.0;
    
    public NaveEspacial(String nombre, double combustibleInicial) {
        this.nombre = nombre;
        // Se valida el combustible inicial para que no supere el límite
        if (combustibleInicial <= LIMITE_COMBUSTIBLE) {
            this.combustible = combustibleInicial;
        } else {
            this.combustible = LIMITE_COMBUSTIBLE;
            System.out.println("ADVERTENCIA: El combustible inicial excede el límite. Se estableció en " + LIMITE_COMBUSTIBLE);
        }
    }    
    // Métodos
    public void despegar() {
        if (this.combustible >= 10) { // Se consume combustible para el despegue
            this.combustible -= 10;
            System.out.println("La nave " + this.nombre + " ha despegado. Combustible restante: " + this.combustible);
        } else {
            System.out.println("ERROR: No hay suficiente combustible para el despegue.");
        }
    }
    public void avanzar(double distancia) {
        // Asumimos 1 unidad de combustible por 10 unidades de distancia
        double consumo = distancia / 10.0;
        if (this.combustible >= consumo) {
            this.combustible -= consumo;
            System.out.println("La nave " + this.nombre + " avanza " + distancia + " km. Combustible restante: " + this.combustible);
        } else {
            System.out.println("ERROR: No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }
    public void recargarCombustible(double cantidad) {
        if (cantidad > 0) {
            if (this.combustible + cantidad <= LIMITE_COMBUSTIBLE) {
                this.combustible += cantidad;
                System.out.println("Se recargaron " + cantidad + " unidades. Combustible actual: " + this.combustible);
            } else {
                double exceso = (this.combustible + cantidad) - LIMITE_COMBUSTIBLE;
                this.combustible = LIMITE_COMBUSTIBLE;
                System.out.println("ERROR: La recarga excede el límite. Se llenó el tanque. Se perdieron " + exceso + " unidades.");
            }
        } else {
            System.out.println("ERROR: La cantidad a recargar debe ser positiva.");
        }
    }
    public void mostrarEstado() {
        System.out.println(" Estado de la Nave Espacial ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Combustible: " + this.combustible + " / " + LIMITE_COMBUSTIBLE);
       
    }
}