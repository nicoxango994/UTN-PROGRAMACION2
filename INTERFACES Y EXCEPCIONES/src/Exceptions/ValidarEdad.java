/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author Nico
 */
public class ValidarEdad {
        public static void verificarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120)
            throw new EdadInvalidaException("Edad inválida: " + edad);
    }

    public static void main(String[] args) {
        try {
            verificarEdad(150);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
