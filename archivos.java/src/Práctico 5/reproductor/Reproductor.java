
package reproductor;

public class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("--- REPRODUCIENDO MÚSICA ---");
        System.out.println("Reproduciendo: " + cancion.getTitulo());
                
        System.out.println("Artista: " + cancion.getArtista().getNombre());
        System.out.println("Género: " + cancion.getArtista().getGenero());
        System.out.println("----------------------------");
    }        
}

