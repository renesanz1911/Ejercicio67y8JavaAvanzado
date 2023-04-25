package Ejercicio19;

import java.util.ArrayList;

public class OptionParser {
    public ArrayList<Persona> personas = new ArrayList<>();
    private String[] args;


    private OptionParser(){}
    public OptionParser(String[]args){
        this.args = args;
    }

    public void parser(){
       for (int i = 0; i<args.length-1; i=i+2  ){
           personas.add(new Persona(args[i],args[i+1]));
       }
    }
    public ArrayList<Persona> extraeCoincidentes(String name){
        ArrayList<Persona> coincidentes = new ArrayList<>();
        personas.stream().filter(persona -> persona.getNombre()
                .equalsIgnoreCase(name))
                .forEach(coincidentes::add);
        return coincidentes;
    }
}