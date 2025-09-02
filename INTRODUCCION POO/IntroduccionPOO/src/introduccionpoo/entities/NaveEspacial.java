/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionpoo.entities;

/**
 *
 * @author Nico
 */
public class NaveEspacial {
    
    private String nombre;
    private int combustible;
    private final int LIMITE_COMBUSTIBLE = 100; // límite máximo

    // Constructor
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        if (combustible <= LIMITE_COMBUSTIBLE) {
            this.combustible = combustible;
        } else {
            this.combustible = LIMITE_COMBUSTIBLE;
        }
    }

    // Métodos
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado (gasto 10 de combustible).");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia / 2; // 1 unidad de combustible = 2 de distancia
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzo " + distancia + " km. (consumio " + consumo + " de combustible).");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= LIMITE_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println(nombre + " recargo " + cantidad + " de combustible.");
        } else {
            combustible = LIMITE_COMBUSTIBLE;
            System.out.println(nombre + " recargo hasta el límite de " + LIMITE_COMBUSTIBLE + ".");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + LIMITE_COMBUSTIBLE);
    }
    
}
