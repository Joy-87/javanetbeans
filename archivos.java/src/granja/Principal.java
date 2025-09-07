
package granja;


public class Principal {
    public static void main(String[] args) {
        Granja gallina1 = new Granja("G1",1);
        Granja gallina2 = new Granja("G2",2);
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        System.out.println(" Simulación ");
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();

        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina2.envejecer();

        // Mostrar el estado final de ambas
        System.out.println(" Estado Final ");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
    
    

