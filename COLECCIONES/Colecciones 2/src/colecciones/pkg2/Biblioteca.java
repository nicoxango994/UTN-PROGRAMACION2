/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.pkg2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nico
 */
public class Biblioteca {
        private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
        System.out.println("Libro agregado: " + titulo);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        System.out.println("\nLibros en la biblioteca \"" + nombre + "\":");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            libros.remove(encontrado);
            System.out.println("Libro eliminado: " + encontrado);
        } else {
            System.out.println("No se encontró un libro con ISBN: " + isbn);
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\nLibros publicados en el año " + anio + ":");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros publicados en " + anio + ".");
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("\nAutores disponibles en la biblioteca:");
        ArrayList<String> nombresMostrados = new ArrayList<>();

        for (Libro libro : libros) {
            Autor autor = libro.getAutor();
            if (!nombresMostrados.contains(autor.getNombre())) {
                autor.mostrarInfo();
                nombresMostrados.add(autor.getNombre());
            }
        }
    }
}
