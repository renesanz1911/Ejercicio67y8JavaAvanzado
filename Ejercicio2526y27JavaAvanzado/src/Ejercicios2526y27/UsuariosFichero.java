package Ejercicios2526y27;
import java.util.ArrayList;

public class UsuariosFichero extends GestionUsuarios {

    public String ficheroDatos = "usuarios.txt";
    ArrayTxtConversor conversor = new ArrayTxtConversor();

    @Override
    public ArrayList<Usuario> listarUsuarios() {
        return conversor.fromTxtToArray();
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        for (Usuario usuarioActual : conversor.fromTxtToArray()) {
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(username)) {
                return usuarioActual;
            }
        }

        return null;
    }

    @Override
    public void crearUsuario(Usuario nuevoUsuario) {
        ArrayList<Usuario> usuarios = conversor.fromTxtToArray();

        if (usuarios.stream().noneMatch(usuario -> usuario.nombreUsuario.equalsIgnoreCase(nuevoUsuario.nombreUsuario))) {
            usuarios.add(nuevoUsuario);
            conversor.fromArrayToTxt(usuarios);
            incrementarInserciones();
        }
    }

    @Override
    public void borrarUsuario(String username) {
        ArrayList<Usuario> usuarios = conversor.fromTxtToArray();
        usuarios.removeIf(usuario -> usuario.nombreUsuario.equalsIgnoreCase(username));
        conversor.fromArrayToTxt(usuarios);
        incrementarEliminaciones();
    }
}


