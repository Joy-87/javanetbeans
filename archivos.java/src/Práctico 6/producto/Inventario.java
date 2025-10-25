
package producto;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    // Atributo: Colección dinámica de productos
    private List<Producto> productos;

    /**
     * Constructor que inicializa el ArrayList.
     */
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    /**
     * Agrega un producto al inventario.
     */
    public void agregarProducto(Producto p) {
        // Validación básica: evitar productos con ID duplicado
        if (buscarProductoPorId(p.getId()) != null) {
            System.out.println("⚠️ Error: Ya existe un producto con el ID " + p.getId());
            return;
        }
        productos.add(p);
        System.out.println("✅ Producto agregado: " + p.getNombre());
    }

    /**
     * Muestra la información de todos los productos en el inventario.
     */
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("📦 El inventario está vacío.");
            return;
        }
        System.out.println("--- Listado Completo de Productos ---");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
        System.out.println("-------------------------------------");
    }

    /**
     * Busca un producto por su ID.
     * @return El Producto si se encuentra, o null en caso contrario.
     */
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null; // Producto no encontrado
    }

    /**
     * Elimina un producto por su ID.
     */
    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("❌ Producto eliminado: " + p.getNombre());
        } else {
            System.out.println("⚠️ Error: Producto con ID " + id + " no encontrado para eliminar.");
        }
    }

    /**
     * Actualiza la cantidad en stock de un producto.
     */
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("⬆️ Stock actualizado para " + p.getNombre() + ". Nuevo Stock: " + nuevaCantidad);
        } else {
            System.out.println("⚠️ Error: Producto con ID " + id + " no encontrado para actualizar stock.");
        }
    }

    /**
     * Filtra y lista productos por una categoría específica.
     */
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n--- Productos en la categoría: " + categoria + " (" + categoria.getDescripcion() + ") ---");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos en esta categoría.");
        }
        System.out.println("------------------------------------------------------------------");
    }

    /**
     * Calcula y retorna la suma total de la cantidad de todos los productos.
     */
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    /**
     * Encuentra y retorna el producto con la mayor cantidad en stock.
     */
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }

        Producto mayorStock = productos.get(0);
        int maxCantidad = mayorStock.getCantidad();

        for (int i = 1; i < productos.size(); i++) {
            Producto actual = productos.get(i);
            if (actual.getCantidad() > maxCantidad) {
                maxCantidad = actual.getCantidad();
                mayorStock = actual;
            }
        }
        return mayorStock;
    }

    /**
     * Filtra y lista productos cuyos precios estén dentro del rango [min, max].
     */
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.printf("\n--- Productos con precio entre $%.2f y $%.2f ---%n", min, max);
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos en el rango de precio especificado.");
        }
        System.out.println("---------------------------------------------------------------");
    }

    /**
     * Muestra todas las categorías disponibles con sus descripciones.
     */
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- Categorías de Producto Disponibles ---");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.printf("- %s: %s%n", cat.name(), cat.getDescripcion());
        }
        System.out.println("------------------------------------------");
    }
}