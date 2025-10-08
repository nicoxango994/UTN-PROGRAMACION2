/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones.pkg1;

/**
 *
 * @author Nico
 */
public class Colecciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Inventario inventario = new Inventario();

        // Crear Productos
        inventario.agregarProducto(new Producto("P1", "Leche", 1200, 30, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P2", "Televisor", 250000, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P3", "Remera", 5000, 50, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P4", "Sillon", 180000, 5, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P5", "Pan", 800, 100, CategoriaProducto.ALIMENTOS));

        // Listar productos
        System.out.println("\n--- Lista de productos ---");
        inventario.listarProductos();

        // Buscar por ID
        System.out.println("\n--- Buscar producto P3 ---");
        Producto buscado = inventario.buscarProductoPorId("P3");
        if (buscado != null) buscado.mostrarInfo();

        // Filtrar categoria
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // Eliminar producto
        inventario.eliminarProducto("P2");
        System.out.println("\n--- Despues de eliminar Televisor ---");
        inventario.listarProductos();

        // Actualizar stock
        inventario.actualizarStock("P1", 60);

        // Mostrar total de stock
        System.out.println("\nTotal de unidades en stock: " + inventario.obtenerTotalStock());

        // Producto por mayor con Stock
        System.out.println("\nProducto con mayor stock:");
        System.out.println(inventario.obtenerProductoConMayorStock());

        // Filtrar por precio
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // Mostrar por categorias
        inventario.mostrarCategoriasDisponibles();
    }
    
}
