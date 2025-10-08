/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones.pkg3;

/**
 *
 * @author Nico
 */
public class Colecciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear Universidad
        Universidad uni = new Universidad("Universidad Tecnologica Nacional");

        // Crear profesores
        Profesor p1 = new Profesor("P1", "Laura Gonzalez", "Matemática");
        Profesor p2 = new Profesor("P2", "Carlos Perez", "Informática");
        Profesor p3 = new Profesor("P3", "Ana Torres", "Historia");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        // Crear cursos
        Curso c1 = new Curso("C101", "Algebra");
        Curso c2 = new Curso("C102", "Programacion I");
        Curso c3 = new Curso("C103", "Historia Argentina");
        Curso c4 = new Curso("C104", "Bases de Datos");
        Curso c5 = new Curso("C105", "Programación II");

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 4️⃣ Asignar profesores a cursos
        uni.asignarProfesorACurso("C101", "P1");
        uni.asignarProfesorACurso("C102", "P2");
        uni.asignarProfesorACurso("C104", "P2");
        uni.asignarProfesorACurso("C103", "P3");
        uni.asignarProfesorACurso("C105", "P2");

        // 5️⃣ Listar cursos y profesores
        uni.listarCursos();
        uni.listarProfesores();

        // 6️⃣ Cambiar el profesor de un curso
        System.out.println("\nReasignando 'Algebra' a la profesora Ana Torres...");
        c1.setProfesor(p3);

        uni.listarProfesores();

        // 7️⃣ Eliminar un curso y verificar sincronización
        System.out.println("\nEliminando el curso 'Programacion II'...");
        uni.eliminarCurso("C105");

        uni.listarProfesores();

        // 8️⃣ Eliminar un profesor y dejar sus cursos sin asignar
        System.out.println("\nEliminando al profesor Carlos Perez...");
        uni.eliminarProfesor("P2");

        uni.listarCursos();

        // 9️⃣ Reporte de cantidad de cursos por profesor
        uni.reporteCursosPorProfesor();
    }
    
}
