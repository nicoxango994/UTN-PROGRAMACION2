/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.pkg1;

/**
 *
 * @author Nico
 */
public class Producto {
    
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    // Constructor
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // Getters
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

    // Setters
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println(this);
    }

    // Sobrescribir toString()
    @Override
    public String toString() {
        return "ID: " + id +
               " | Nombre: " + nombre +
               " | Precio: $" + precio +
               " | Cantidad: " + cantidad +
               " | Categoria: " + categoria +
               " (" + categoria.getDescripcion() + ")";
    }
}
