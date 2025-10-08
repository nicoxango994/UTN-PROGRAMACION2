/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.pkg3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nico
 */
public class Universidad {
    
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        }
        return null;
    }

    /**
     * Asigna un profesor a un curso usando sus identificadores.
     */
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso == null || profesor == null) {
            System.out.println("No se encontró el curso o el profesor.");
            return;
        }
        curso.setProfesor(profesor);
        System.out.println("Asignado el profesor " + profesor.getNombre() + " al curso " + curso.getNombre());
    }

    /**
     * Elimina un curso y rompe la relación con su profesor si la hubiera.
     */
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            System.out.println("Curso eliminado: " + curso.getNombre());
        } else {
            System.out.println("No se encontro el curso con codigo " + codigo);
        }
    }

    /**
     * Elimina un profesor y deja sus cursos sin asignar.
     */
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            for (Curso c : new ArrayList<>(profesor.getCursos())) {
                c.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.println("Profesor eliminado: " + profesor.getNombre());
        } else {
            System.out.println("No se encontró el profesor con ID " + id);
        }
    }

    public void listarProfesores() {
        System.out.println("\nProfesores en " + nombre + ":");
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
        }
    }

    public void listarCursos() {
        System.out.println("\nCursos en " + nombre + ":");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    /**
     * Reporte: cantidad de cursos dictados por profesor.
     */
    public void reporteCursosPorProfesor() {
        System.out.println("\nReporte: cantidad de cursos por profesor:");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " - " + p.getCursos().size() + " cursos");
        }
    }
}
