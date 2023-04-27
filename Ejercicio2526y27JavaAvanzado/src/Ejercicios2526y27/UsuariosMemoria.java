package Ejercicios2526y27;
import java.util.ArrayList;

public class UsuariosMemoria extends GestionUsuarios{

    ArrayList<Usuario> usuarios = new ArrayList<>();

    @Override
    public ArrayList<Usuario> listarUsuarios() {
        return usuarios;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.nombreUsuario.equalsIgnoreCase(username.toLowerCase())) {
                return usuario;
            }
        }

        return null;
    }

    @Override
    public void crearUsuario(Usuario nuevoUsuario) {
        if (usuarios.stream().noneMatch(usuario -> usuario.nombreUsuario.equalsIgnoreCase(nuevoUsuario.nombreUsuario))) {
            usuarios.add(nuevoUsuario);
            incrementarInserciones();
        }

    }

    @Override
    public void borrarUsuario(String username) {
        usuarios.removeIf(usuario -> usuario.nombreUsuario.equalsIgnoreCase(username));
        incrementarEliminaciones();
    }
}
