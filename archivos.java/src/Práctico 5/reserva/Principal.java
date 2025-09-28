
package reserva;


public class Principal {

    
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente (" Julian Gómez "," 1122334455 ");
        Mesa mesa = new Mesa (" 14 "," 4 ");
        Reserva reserva = new Reserva (" 22-09-2025 "," 22:00 ", cliente, mesa);
        
        System.out.println("Datos de la reserva");
        System.out.println("Fecha: "+ reserva.getFecha());
        System.out.println("Hora: "+ reserva.getHora());
        System.out.println("Cliente: " + reserva.getCliente().getNombre()); // Muestra el cliente asociado
        System.out.println("Mesa: " + reserva.getMesa().getNumero());       // Muestra la mesa asociada
        
        
        
    }
    
}
