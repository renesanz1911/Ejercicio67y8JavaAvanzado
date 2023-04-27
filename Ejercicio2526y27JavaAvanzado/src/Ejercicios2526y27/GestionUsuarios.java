package Ejercicios2526y27;

import java.util.ArrayList;

abstract public class GestionUsuarios {
    private int totalInserciones = 0;
    private int totalEliminaciones = 0;

    public int getTotalInserciones() { return totalInserciones; }
    public int getTotalEliminaciones() { return totalEliminaciones; }

    protected void incrementarInserciones() { totalInserciones++; }
    protected void incrementarEliminaciones() { totalEliminaciones++; }

    abstract ArrayList<Usuario> listarUsuarios();
    abstract Usuario obtenerUsuario(String username);
    abstract void crearUsuario(Usuario nuevoUsuario);
    abstract void borrarUsuario(String username);



}
