/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionpoo.entities;

/**
 *
 * @author Nico
 */
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
        public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        // Validación: no puede ser menor a 0 ni mayor a 10
        if (calificacion < 0) {
            this.calificacion = 0;
        } else if (calificacion > 10) {
            this.calificacion = 10;
        } else {
            this.calificacion = calificacion;
        }
    }

    // Método para mostrar la información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("-------------------------");
    }

    // Método para subir calificación
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("La calificacion subio a: " + calificacion);
    }

    // Método para bajar calificación
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0; // No permitir calificaciones negativas
        }
        System.out.println("La calificacion bajo a: " + calificacion);
    }

    
}
