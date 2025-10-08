/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.pkg2;

/**
 *
 * @author Nico
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor; // Relacion de composición: el libro tiene un autor

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo +
                           " | ISBN: " + isbn +
                           " | Anio: " + anioPublicacion +
                           " | Autor: " + autor);
    }

    @Override
    public String toString() {
        return titulo + " (" + anioPublicacion + ") - " + autor.getNombre();
    }
}
