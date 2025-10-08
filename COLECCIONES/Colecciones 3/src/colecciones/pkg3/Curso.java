/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.pkg3;

/**
 *
 * @author Nico
 */
public class Curso {
    
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Asigna o cambia el profesor, manteniendo la relación sincronizada.
     */
    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor == nuevoProfesor) {
            return; // no hay cambio
        }

        // Quitar del profesor anterior si existe
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }

        this.profesor = nuevoProfesor;

        // Agregar al nuevo profesor si no es null
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        String nombreProf = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Curso: " + nombre + " | Codigo: " + codigo + " | Profesor: " + nombreProf);
    }

    @Override
    public String toString() {
        return nombre + " (" + codigo + ")";
    }
}
