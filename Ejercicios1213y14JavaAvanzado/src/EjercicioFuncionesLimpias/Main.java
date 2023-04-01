package EjercicioFuncionesLimpias;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> hListaPromedioAlumnos = new HashMap<>();
        Alumno oAlumno0 = new Alumno("Juanito" , new int[]{10, 5, 6, 7});
        Alumno oAlumno1 = new Alumno("Juanita" , new int[]{5, 8, 6, 9});
        Alumno oAlumno2 = new Alumno("Pepito" , new int[]{2, 9, 8, 7});
        Alumno oAlumno3 = new Alumno("Rocio" , new int[]{10, 9, 10, 10});
        Alumno oAlumno4 = new Alumno("Jorgito" , new int[]{4, 5, 5, 8});
        aniadeAlumno(oAlumno0, hListaPromedioAlumnos);
        aniadeAlumno(oAlumno1, hListaPromedioAlumnos);
        aniadeAlumno(oAlumno2, hListaPromedioAlumnos);
        aniadeAlumno(oAlumno3, hListaPromedioAlumnos);
        aniadeAlumno(oAlumno4, hListaPromedioAlumnos);
        muestraListaPromedios(hListaPromedioAlumnos);
    }
    public static void aniadeAlumno(Alumno alumno,Map<String,Double> lista){
        lista.put(alumno.sNombre, alumno.calculaPromedio());
    }
    public static void muestraListaPromedios (Map<String,Double> lista) {
      lista.forEach((k,v)-> System.out.println("nombre: " + k + "promedio: "+ v));
    }
}