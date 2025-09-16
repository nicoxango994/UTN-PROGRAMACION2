/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import entities.Empleado;

/**
 *
 * @author Nico
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Crear empleados con ambos constructores
        Empleado e1 = new Empleado(1, "Ana Lopez", "Gerente", 50000);
        Empleado e2 = new Empleado("Luis Perez", "Analista");
        Empleado e3 = new Empleado("Carla Gomez", "Programador");
        Empleado e4 = new Empleado("Juan Perez", "Programador");

        // Aplicar metodos sobrecargados de actualizacion de salario
        e1.actualizarSalario(10); // 10% de aumento
        e2.actualizarSalario(5000); // aumento fijo
        e3.actualizarSalario(15); // 15% de aumento

        // Imprimir informacion de cada empleado
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
  
}
