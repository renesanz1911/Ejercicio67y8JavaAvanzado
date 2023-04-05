package EjerciciosTryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ArchivoNoEncontrado {
    public void leeFichero(){
        try {
            InputStream fichero = new FileInputStream("/home/rene/Desktop/carpeta/fichero");
            byte[] datos = fichero.readAllBytes();
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo " + e.getClass());
        }catch(IOException e){
            System.out.println("Error I/O " + e.getClass());
        }

    }


}
