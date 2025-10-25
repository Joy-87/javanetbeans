
package producto;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }
    
    // Setter para actualizar stock
    public void setCantidad(int nuevaCantidad) {
        this.cantidad = nuevaCantidad;
    }

    /**
     * Muestra en consola la información completa del producto.
     */
    public void mostrarInfo() {
        System.out.printf("ID: %s | Nombre: %s | Precio: $%.2f | Stock: %d | Categoría: %s%n",
                          this.id, this.nombre, this.precio, this.cantidad, this.categoria);
    }
    
    /**
     * Sobreescribe el método toString() para mejorar la representación del objeto
     * (útil para depuración y listados).
     */
    @Override
    public String toString() {
        return String.format("Producto [ID=%s, Nombre=%s, Precio=%.2f, Stock=%d, Categoria=%s]",
                             id, nombre, precio, cantidad, categoria);
    }
}