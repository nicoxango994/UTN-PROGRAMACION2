/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionpoo.entities;

/**
 *
 * @author Nico
 */
public class Gallina {
    
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    // Constructor
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    // Método: la gallina pone un huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    // Método: la gallina envejece
    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ahora tiene " + edad + " anios.");
    }

    // Método: mostrar el estado
    public void mostrarEstado() {
        System.out.println("ID Gallina: " + idGallina);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("----------------------------");
    }
    
}
