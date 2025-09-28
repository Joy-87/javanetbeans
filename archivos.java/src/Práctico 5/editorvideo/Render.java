
package editorvideo;

public class Render {
    private String formato;
    private Proyecto proyecto; 
    
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
        System.out.println("  [Render creado] Formato: " + formato);
        System.out.println("  Asociado al proyecto: " + proyecto.getNombre());
    }
    public String getFormato() { 
        return formato; 
    }    
    public Proyecto getProyecto() { 
        return proyecto; 
    }
}

