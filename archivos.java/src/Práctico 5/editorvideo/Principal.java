
package editorvideo;

public class Principal {

    public static void main(String[] args) {
        // 1. Crear el Proyecto 
        Proyecto proyectoActual = new Proyecto("Campañas publicitarias Q4", 12);
        
        // 2. Crear el EditorVideo
        EditorVideo editor = new EditorVideo();
        
        Render videoFinal = editor.exportar("MP4-H265", proyectoActual);

        System.out.println("\n--- VERIFICACIÓN DEL ARCHIVO FINAL ---");
        System.out.println("Formato del Render: " + videoFinal.getFormato());
        System.out.println("Proyecto asociado (navegación): " + videoFinal.getProyecto().getNombre());
        System.out.println("Duración original: " + videoFinal.getProyecto().getDuracionMin() + " minutos.");
    }
}
    
