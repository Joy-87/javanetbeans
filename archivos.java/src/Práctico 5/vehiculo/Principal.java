
package vehiculo;
public class Principal {

    public static void main(String[] args) {
        Motor motor = new Motor (" Diesel Turbo "," MT-38475A91 ");
        Conductor conductor = new Conductor (" Miguel Rodriguez "," CL56789012 ");
        Vehiculo vehiculo = new Vehiculo(" A208LO "," Zeus ",conductor , motor);
        
        System.out.println("Vehículo creado: " + vehiculo.getModelo());
        System.out.println("Motor asociado: " + vehiculo.getMotor().getNumeroSerie());
        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        
    }
}
