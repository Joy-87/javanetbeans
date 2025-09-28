package granja;
public class Granja {
    
    String idGallina;
    int edad;
    int huevosPuestos;
    
    public Granja(String idGallina, int edad){
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;   
    }
    //Método para que la gallina ponga
    public void ponerHuevo(){
        this.huevosPuestos++;
        System.out.println("La gallina n°"+ this.idGallina + " ha puesto un huevo. Total: "+ this.huevosPuestos);
    }
    //Método para que la gallina envejezca
    public void envejecer(){
        this.edad++;
        if (this.edad >= 1) { 
            this.huevosPuestos += 300; // Un estimado de huevos por año
        System.out.println("La gallina n°"+ this.idGallina + "ha envejecido. Ahora tiene " + this.edad + " años");
        }
    }
    public void mostrarEstado(){
        System.out.println("Estado de la gallina " + this.idGallina);
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("Huevos puestos: " + this.huevosPuestos);
    }
}