/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia_polimorfismo;

import Kata1.Auto;
import Kata2.Circulo;
import Kata2.Figura;
import Kata2.Rectangulo;
import Kata3.Empleado;
import Kata3.EmpleadoPlanta;
import Kata3.EmpleadoTemporal;
import Kata4.Animal;
import Kata4.Gato;
import Kata4.Perro;
import Kata4.Vaca;
import java.util.ArrayList;

/**
 *
 * @author Nico
 */
public class Herencia_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Auto auto = new Auto("Toyota", "Corolla", 4);
            auto.mostrarInfo();
                
        System.out.println("----------------------------------------------------------------");
            
            Figura[] figuras = {
            new Circulo(3),
            new Rectangulo(4, 5)
        };

        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " - Area: " + f.calcularArea());
        }
        
        System.out.println("----------------------------------------------------------------");
        
         ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Juan", 150000));
        empleados.add(new EmpleadoTemporal("Ana", 80, 1500));

        for (Empleado emp : empleados) {
            System.out.println(emp.getNombre() + " - Sueldo: " + emp.calcularSueldo());

            if (emp instanceof EmpleadoPlanta) {
                System.out.println(" -> Es empleado de planta.");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println(" -> Es empleado temporal.");
            }
        }
        
        System.out.println("----------------------------------------------------------------");
        
        
            Animal[] animales = {
            new Perro(),
            new Gato(),
            new Vaca()
        };

        for (Animal a : animales) {
            a.hacerSonido();
            a.describirAnimal();
        }
        
    }
}
