package EjercicioSingleton;

public class Main {
    public static void main(String[] args) {

    /*Supongamos que una app de control dietario necesita cierta informacion inicial para
    comparar con informacion final de una persona que sigue una plan especifico
    para bajar de peso (peso inicial, % grasa, masa muscular), usaria el
    patron singleton para asegurarme de instanciar solo un inicial y compararia con
    varias instancias a lo largo del tiempo segun vaya obteniendo diferentes resultados*/


        Inicial inicial = Inicial.getInstance(100, 21, 79);
        Inicial inicial2 = Inicial.getInstance(150, 33, 66);
        CursandoDieta mes2 = new CursandoDieta(97, 19, 81);
        CursandoDieta mes4 = new CursandoDieta(92, 12, 88);
        mes2.avanceDieta(inicial);
        mes4.avanceDieta(inicial2);

        //Se demuestra que se encuentran en la misma ubicacion en memoria
        System.out.println("ubicacion en memoria inicial: "+inicial);
        System.out.println("ubicacion en memoria inicial: "+inicial2);

    }
}
