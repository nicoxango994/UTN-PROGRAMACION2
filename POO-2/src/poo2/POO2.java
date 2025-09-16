/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2;

import entities.Libro;

/**
 *
 * @author Nico
 */
public class POO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear libros con y sin editorial explícita
        Libro l1 = new Libro("Cien Anios de Soledad", "Gabriel Garcia Marquez");
        Libro l2 = new Libro("Rayuela", "Julio Cortazar", "Sudamericana");
        Libro l3 = new Libro("El Principito", "Antoine de Saint-Exupery");

        // Mostrar los libros iniciales
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        // Usar actualizarTitulo() sin prefijo
        l1.actualizarTitulo("Cien Anios de Soledad - 2da Edicion");

        // Usar actualizarTitulo() con prefijo
        l2.actualizarTitulo("Version Ilustrada", "Rayuela");

        // Mostrar libros después de actualizar títulos
        System.out.println("\nDespues de actualizar titulos:");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        // Cambiar la editorial global
        Libro.cambiarEditorial("Editorial Moderna");

        // Mostrar libros después de cambiar la editorial
        System.out.println("\nDespues de cambiar editorial:");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
    
}
