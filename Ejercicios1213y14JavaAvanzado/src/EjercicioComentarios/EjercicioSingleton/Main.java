package EjercicioComentarios.EjercicioSingleton;
/*Aqui habia un comentario demasiado largo y enrredado.

Se utiliza un patron singleton para poder inicializar solo un objeto de la clase Inicial, de forma que
siempre se compara un mismo objeto de la clase Inicial con las distintas etapas de la evolucion del
paciente, que seran representadas por las instancias de la clase CursandoDieta.

Ademas se realizo una refactorizacion del constructor de la clase CursandoDieta por medio del patron
Builder, para lo cual, generamos la CLase DietaBuilder.
*/
public class Main {
    public static void main(String[] args) {
        Inicial inicial = Inicial.getInstance(100, 21, 79);
        Inicial inicial2 = Inicial.getInstance(150, 33, 66);
        CursandoDieta cursandoDietaMes2 = new DietaBuilder(97)
                .conPorcMusculo(81)
                .conPorcGrasa(19)
                .conTipoDieta("cetogenica")
                .build();
        CursandoDieta cursandoDietaMes4 = new DietaBuilder(94)
                .conPorcMusculo(84)
                .conPorcGrasa(16)
                .conTipoDieta("vegana")
                .build();

        //Se demuestra que se encuentran en la misma ubicacion en memoria
        System.out.println("ubicacion en memoria inicial: "+inicial);
        System.out.println("ubicacion en memoria inicial: "+inicial2);

        //Se realiza la comparacion entre las distintas etapas del paciente (inicial y cursandoDieta)
        cursandoDietaMes2.avanceDieta(inicial);
        cursandoDietaMes4.avanceDieta(inicial);

    }
}
