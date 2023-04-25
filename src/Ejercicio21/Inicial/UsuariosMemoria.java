package Ejercicio21.Inicial;
import java.util.ArrayList;

public class UsuariosMemoria {
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public ArrayList<Usuario> listarUsuarios() {
        return usuarios;
    }
    public Usuario obtenerUsuario(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.nombreUsuario.equalsIgnoreCase(username.toLowerCase())) {
                return usuario;
            }
        }

        return null;
    }

    public void crearUsuario(Usuario nuevoUsuario) {
        if (usuarios.stream().noneMatch(usuario -> usuario.nombreUsuario.equalsIgnoreCase(nuevoUsuario.nombreUsuario))){
            usuarios.add(nuevoUsuario);
        }
    }

    public void borrarUsuario(String username) {
        usuarios.removeIf(usuario -> usuario.nombreUsuario.equalsIgnoreCase(username));
    }
}
