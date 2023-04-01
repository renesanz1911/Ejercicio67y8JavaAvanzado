package EjercicioFuncionesLimpias;

import java.util.Arrays;

public class Alumno {
    public String sNombre;
    public int[] aNotasAlumno;

    public Double calculaPromedio (){
       int totalNotas = ((Arrays.stream(aNotasAlumno).reduce(0, Integer::sum)));
       return (double) totalNotas/aNotasAlumno.length;
    }

    public Alumno(String nombre, int[] notasAlumno) {
        this.aNotasAlumno = notasAlumno;
        this.sNombre= nombre;
    }
}
