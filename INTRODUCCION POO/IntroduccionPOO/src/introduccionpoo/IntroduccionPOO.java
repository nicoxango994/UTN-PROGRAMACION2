/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionpoo;

import introduccionpoo.entities.Estudiante;
import introduccionpoo.entities.Gallina;
import introduccionpoo.entities.Libro;
import introduccionpoo.entities.Mascota;
import introduccionpoo.entities.NaveEspacial;

/**
 *
 * @author Nico
 */
public class IntroduccionPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Estudiante estudiante1 = new Estudiante("Lucia", "Perez", "Programacion 1", 7.5);

        // Mostrar información inicial
        estudiante1.mostrarInfo();
        // Subir calificación
        estudiante1.subirCalificacion(1.5);
        // Bajar calificación
        estudiante1.bajarCalificacion(3.0);
        // Mostrar información final
        estudiante1.mostrarInfo();
        
        Mascota mascota1 = new Mascota("Xango","Pitbull",8);
        mascota1.mostrarInfo();
        mascota1.cumplirAnios();
        
       Libro libro = new Libro("Cien Anios de Soledad", "Gabriel Garcia Marquez", 1967);

        // Mostrar información inicial
        libro.mostrarInfo();
        // Intentar cambiar el año con un valor inválido
        libro.setAñoPublicacion(-50);
        // Intentar con un valor válido
        libro.setAñoPublicacion(1970);
        // Mostrar información final
        libro.mostrarInfo();
        
        
        // Crear dos gallinas
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1);

        // Simular acciones
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.envejecer();
        g2.ponerHuevo();

        // Mostrar estados finales
        g1.mostrarEstado();
        g2.mostrarEstado();
        
        
        NaveEspacial nave = new NaveEspacial("SATURNO 15", 50);

        nave.mostrarEstado();
        nave.avanzar(40); // intenta avanzar sin recargar
        nave.despegar();  // intenta despegar
        nave.mostrarEstado();

        nave.recargarCombustible(30); // recarga
        nave.despegar();  // despega correctamente
        nave.avanzar(40); // avanza con suficiente combustible
        nave.mostrarEstado(); // estado final
    }
    
}
