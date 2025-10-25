
package producto;

    public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    private final String descripcion;

    // Constructor para asociar la descripción
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter para acceder a la descripción
    public String getDescripcion() {
        return descripcion;
    }
}

