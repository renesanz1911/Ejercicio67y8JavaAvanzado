package EjercicioRefactoring;

public class Main {
    public static void main(String[] args) {

    /*Decidi utilizar un builder en este ejercicio de refactoring porque tenia un constructor un
    poco largo*/


        Inicial inicial = Inicial.getInstance(100, 21, 79);
        Inicial inicial2 = Inicial.getInstance(150, 33, 66);
        CursandoDieta mes2 = new DietaBuilder(97)
                .conPorcMusculo(81)
                .conPorcGrasa(19)
                .conTipoDieta("cetogenica")
                .build();
        CursandoDieta mes4 = new DietaBuilder(94)
                .conPorcMusculo(84)
                .conPorcGrasa(16)
                .conTipoDieta("full lechuga")
                .build();
        //Se demuestra que se encuentran en la misma ubicacion en memoria
        System.out.println("ubicacion en memoria inicial: "+inicial);
        System.out.println("ubicacion en memoria inicial: "+inicial2);
        mes2.avanceDieta(inicial);
        mes4.avanceDieta(inicial);

    }
}
