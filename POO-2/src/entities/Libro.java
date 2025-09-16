package entities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nico
 */
public class Libro {
    
     // Atributos privados (encapsulamiento)
    private String titulo;
    private String autor;
    private static String editorial = "Independiente"; // valor por defecto

    // Constructor que recibe título y autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Constructor sobrecargado que recibe título, autor y editorial
    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        Libro.editorial = editorial; // modificar la editorial común
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static String getEditorial() {
        return editorial;
    }

    // Métodos sobrecargados para actualizar título
    public void actualizarTitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
    }

    public void actualizarTitulo(String prefijo, String nuevoTitulo) {
        this.titulo = prefijo + " " + nuevoTitulo;
    }

    // Método estático para cambiar editorial
    public static void cambiarEditorial(String nuevaEditorial) {
        editorial = nuevaEditorial;
    }

    // toString() para representar el objeto
    @Override
    public String toString() {
        return "Libro [Titulo=" + titulo + ", Autor=" + autor + ", Editorial=" + editorial + "]";
    }
}
