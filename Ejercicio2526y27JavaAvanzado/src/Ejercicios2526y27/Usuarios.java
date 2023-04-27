package Ejercicios2526y27;

import java.util.ArrayList;

public class Usuarios {
    GestionUsuarios gestionUsuarios;


    public Usuarios(GestionUsuarios gestionUsuarios) {
        this.gestionUsuarios = gestionUsuarios;
    }

    protected Usuarios(){}



    public ArrayList<Usuario> listar() {
        return gestionUsuarios.listarUsuarios();
    }


    public Usuario obtener (String username) {
        return gestionUsuarios.obtenerUsuario(username);
    }


    public void crear(Usuario nuevoUsuario) {
        gestionUsuarios.crearUsuario(nuevoUsuario);
    }


    public void borrarUsuario(String username) {
        gestionUsuarios.borrarUsuario(username);
    }
}
