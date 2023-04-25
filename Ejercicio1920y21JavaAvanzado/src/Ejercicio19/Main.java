package Ejercicio19;

public class Main {
    public static void main(String[] args) {
        OptionParser optionParser = new OptionParser(args);
        optionParser.parser();
        System.out.println(optionParser.personas);
        System.out.println(optionParser.extraeCoincidentes("juan"));
    }
}
