
package naveespacial;


public class Principal {

   
    public static void main(String[] args) {
         // Tarea 1: Crear una nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Enterprise", 50.0);
        nave.mostrarEstado();

        // Tarea 2: Intentar avanzar sin recargar (se espera un error)
        System.out.println(" Intento de avance sin recargar ");
        nave.avanzar(100); // 100 km consumiría 10 unidades, lo cual es posible

        // Se puede añadir un despegue para consumir más combustible
        nave.despegar();
        nave.avanzar(500); // 500 km consumiría 50 unidades, lo que causaría un error ahora

        // Tarea 3: Recargar y avanzar correctamente
        System.out.println(" Recarga y avance correcto ");
        nave.recargarCombustible(60.0);

        nave.despegar(); // Intento de despegue con el tanque casi lleno
        nave.avanzar(500); // Ahora debería funcionar

        // Tarea 4: Mostrar el estado al final
        System.out.println(" Estado Final de la Nave ");
        nave.mostrarEstado();
    }
}
    

