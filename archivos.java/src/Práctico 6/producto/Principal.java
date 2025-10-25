
package producto;

public class Principal {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear al menos cinco productos y agregarlos al inventario.
        System.out.println("--- TAREA 1: Creación y Agregado de Productos ---");
        inventario.agregarProducto(new Producto("A101", "Laptop Gamer", 1850.50, 5, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("B202", "Camiseta Algodón", 25.00, 150, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("C303", "Mesa de Centro", 1500.00, 12, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("D404", "Chocolate Negro", 3.75, 200, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("E505", "Smartphone Pro", 2500.99, 8, CategoriaProducto.ELECTRONICA));
        System.out.println("\n");

        // 2. Listar todos los productos.
        System.out.println("--- TAREA 2: Listar todos los productos ---");
        inventario.listarProductos();
        System.out.println("\n");

        // 3. Buscar un producto por ID y mostrar su información.
        System.out.println("--- TAREA 3: Buscar producto por ID (C303) ---");
        Producto productoBuscado = inventario.buscarProductoPorId("C303");
        if (productoBuscado != null) {
            productoBuscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }
        System.out.println("\n");

        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica (ELECTRONICA).
        System.out.println("--- TAREA 4: Filtrar por Categoría (ELECTRONICA) ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        System.out.println("\n");
        
        // 5. Eliminar un producto por su ID (D404) y listar los productos restantes.
        System.out.println("--- TAREA 5: Eliminar producto (D404) y listar restantes ---");
        inventario.eliminarProducto("D404");
        inventario.listarProductos();
        System.out.println("\n");

        // 6. Actualizar el stock de un producto existente (A101).
        System.out.println("--- TAREA 6: Actualizar Stock (A101) ---");
        inventario.actualizarStock("A101", 15);
        inventario.listarProductos();
        System.out.println("\n");

        // 7. Mostrar el total de stock disponible.
        System.out.println("--- TAREA 7: Mostrar Total de Stock ---");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("📊 El stock total disponible en el inventario es: " + totalStock + " unidades.");
        System.out.println("\n");

        // 8. Obtener y mostrar el producto con mayor stock.
        System.out.println("--- TAREA 8: Producto con Mayor Stock ---");
        Producto productoMayorStock = inventario.obtenerProductoConMayorStock();
        if (productoMayorStock != null) {
            System.out.print("🏆 Producto con mayor stock: ");
            productoMayorStock.mostrarInfo();
        } else {
            System.out.println("El inventario está vacío.");
        }
        System.out.println("\n");

        // 9. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("--- TAREA 9: Filtrar Productos por Precio [$1000 - $3000] ---");
        inventario.filtrarProductosPorPrecio(1000.00, 3000.00);
        System.out.println("\n");

        // 10. Mostrar las categorías disponibles con sus descripciones.
        System.out.println("--- TAREA 10: Mostrar Categorías Disponibles ---");
        inventario.mostrarCategoriasDisponibles();
    }
}
    
    

