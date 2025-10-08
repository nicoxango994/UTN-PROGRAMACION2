/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones.pkg2;

/**
 *
 * @author Nico
 */
public class Colecciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear Biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Crear Autores
        Autor a1 = new Autor("A1", "Gabriel Garcia Marquez", "Colombiana");
        Autor a2 = new Autor("A2", "Isabel Allende", "Chilena");
        Autor a3 = new Autor("A3", "Julio Cortazar", "Argentina");

        // Agregar Libros
        biblioteca.agregarLibro("ISBN001", "Cien anios de soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "El amor en los tiempos del colera", 1985, a1);
        biblioteca.agregarLibro("ISBN003", "La casa de los espiritus", 1982, a2);
        biblioteca.agregarLibro("ISBN004", "Rayuela", 1963, a3);
        biblioteca.agregarLibro("ISBN005", "Bestiario", 1951, a3);

        // Listar todos los libros
        biblioteca.listarLibros();

        // Buscar pos ISBN
        System.out.println("\nBuscando libro con ISBN002:");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN002");
        if (buscado != null) buscado.mostrarInfo();

        // Filtrar por año
        biblioteca.filtrarLibrosPorAnio(1967);

        // Eliminar un libro
        biblioteca.eliminarLibro("ISBN005");
        System.out.println("\nLibros despues de eliminar 'Bestiario':");
        biblioteca.listarLibros();

        // Mostrar cantidad total de libros
        System.out.println("\nTotal de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());

        // Mostrar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
    
    
}
