
package reproductor;

public class Principal {

    public static void main(String[] args) {
         
        Artista artista = new Artista("Queen", "Rock");                
        Cancion cancion = new Cancion("Bohemian Rhapsody", artista);
        Reproductor reproductor = new Reproductor();                
        reproductor.reproducir(cancion);
    }
}
   
    

