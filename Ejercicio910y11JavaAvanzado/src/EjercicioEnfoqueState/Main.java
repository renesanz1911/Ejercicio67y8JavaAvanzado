package EjercicioEnfoqueState;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente(29);
        System.out.println(paciente.estado.dietaYPesas());
        System.out.println(paciente.estado.regimenCompleto());
        System.out.println(paciente.estado.dietaYPesas());
        System.out.println(paciente.estado.pesas());
    }
}
/*elegi este patron de diseño porque me parecio interesante para esta aplicacion en particular
* dependiendo del estado del paciente se escoge un tratamiento u otro.*/
