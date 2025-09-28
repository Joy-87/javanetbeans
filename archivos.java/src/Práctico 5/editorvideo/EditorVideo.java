
package editorvideo;

public class EditorVideo {
    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("\n--- INICIANDO EXPORTACIÓN (RENDER) ---");
        System.out.println("Exportando proyecto '" + proyecto.getNombre() + "'...");
                
        Render nuevoRender = new Render(formato, proyecto);
        
        System.out.println("Exportación completada.");
        return nuevoRender;
    }
}

