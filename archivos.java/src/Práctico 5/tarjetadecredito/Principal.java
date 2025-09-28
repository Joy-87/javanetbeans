
package tarjetadecredito;


public class Principal {

   
    public static void main(String[] args) {
        Banco banco = new Banco ("Banco Patagonia ","30-71168442-8");
        Cliente cliente = new Cliente ("Juan Perez ","50.274.861");
        TarjetaDeCredito tarjetadecredito = new TarjetaDeCredito("4012 2036 3852 6473 ","09/26", banco, cliente);
        
        
        
        System.out.println("---Datos del banco---");
        System.out.println("Sucarsal: "+tarjetadecredito.getBanco().getNombre());
        System.out.println("C.U.I.T: "+tarjetadecredito.getBanco().getCuit());
        
        System.out.println("---Datos del cliente---");
        System.out.println("Nombre: "+tarjetadecredito.getCliente().getNombre());
        System.out.println("DNI: "+tarjetadecredito.getCliente().getDni());
        
        System.out.println("---Datos de la tarjeta---");
        System.out.println("Número: "+tarjetadecredito.getNumero());
        System.out.println("Vencimiento: "+tarjetadecredito.getFechaVencimiento());
    }
    
}
