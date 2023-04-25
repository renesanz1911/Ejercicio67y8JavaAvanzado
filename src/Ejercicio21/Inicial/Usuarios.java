package Ejercicio21.Inicial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios {
    public String ficheroDatos = "usuarios.txt";

    public ArrayList<Usuario> listarUsuarios(){
        return fromTxtToArray();
    }

    public Usuario obtenerUsuario(String username) {
        for (Usuario usuarioActual : fromTxtToArray()) {
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(username)) {
                return usuarioActual;
            }
        }

        return null;
    }

    public void crearUsuario(Usuario nuevoUsuario) {
        ArrayList<Usuario> usuarios = fromTxtToArray();

        if (usuarios.stream().noneMatch(usuario -> usuario.nombreUsuario.equalsIgnoreCase(nuevoUsuario.nombreUsuario))){
            usuarios.add(nuevoUsuario);
            fromArrayToTxt(usuarios);
        }
    }

    public void borrarUsuario(String username) {
        ArrayList<Usuario> usuarios = fromTxtToArray();
        usuarios.removeIf(usuario -> usuario.nombreUsuario.equalsIgnoreCase(username));
        fromArrayToTxt(usuarios);
    }
    public void fromArrayToTxt(ArrayList<Usuario> usuarios){
        try {
            PrintStream printStream = new PrintStream(ficheroDatos);

            StringBuilder buffer = new StringBuilder();

            for (Usuario usuario : usuarios) {
                buffer.append(usuario.nombreUsuario).append(",").append(usuario.nombre).append(",")
                        .append(usuario.apellidos).append(",").append(usuario.email).append(",")
                        .append(usuario.nivelAcceso).append("\r\n");
            }
            printStream.print(buffer);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Usuario> fromTxtToArray() {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                String usuarioActual = scanner.next();
                String []partes = usuarioActual.split(",");

                Usuario usuario = new Usuario();
                usuario.nombreUsuario = partes[0];
                usuario.nombre = partes[1];
                usuario.apellidos = partes[2];
                usuario.email = partes[3];
                usuario.nivelAcceso = Integer.parseInt(partes[4]);

                usuarios.add(usuario);
            }

            scanner.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return usuarios;
    }
}
