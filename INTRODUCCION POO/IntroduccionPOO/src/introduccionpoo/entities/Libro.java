/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionpoo.entities;

/**
 *
 * @author Nico
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Constructor

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }
    
    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    // Setter con validación para añoPublicacion
    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 0 && añoPublicacion <= 2025) { // validamos rango lógico
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("Anioo de publicacion invalido: " + añoPublicacion);
        }
    }

    // Método para mostrar la info
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Anio: " + añoPublicacion);
        System.out.println("----------------------------");
    }

}
