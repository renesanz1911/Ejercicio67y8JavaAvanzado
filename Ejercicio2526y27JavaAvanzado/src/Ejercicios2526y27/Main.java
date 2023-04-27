package Ejercicios2526y27;

public class Main {
    public static void main(String []args) {

        GestionUsuarios gestionUsuarios;

        String tipo = "gagaga";
        if (tipo.equalsIgnoreCase("fichero")) {
            gestionUsuarios = new UsuariosFichero();
        } else {
            gestionUsuarios = new UsuariosMemoria();
        }
        Usuarios usuarios = new Usuarios(gestionUsuarios);

        Usuario usuario = new Usuario();
        usuario.nombreUsuario = "openbootcamp";
        usuario.nombre = "Open";
        usuario.apellidos = "Bootcamp";
        usuario.email = "ejemplos@open-bootcamp.com";
        usuario.nivelAcceso = 10;

        usuarios.crear(usuario);

        Usuario usuario2 = new Usuario();
        usuario2.nombreUsuario = "openbootcamp2";
        usuario2.nombre = "Open";
        usuario2.apellidos = "Bootcamp";
        usuario2.email = "ejemplos@open22-bootcamp.com";
        usuario2.nivelAcceso = 10;

        usuarios.crear(usuario2);

        Usuario openbootcamp = usuarios.obtener("openbootcamp2");
        System.out.println(openbootcamp.email);

        usuarios.borrarUsuario("openbootcamp2");
        for (Usuario a : usuarios.listar()) {
            System.out.println(a.nombreUsuario);
        }
        System.out.println("El total de usuarios creados es: " + gestionUsuarios.getTotalInserciones());
        System.out.println("El total de usuarios borrados es: " + gestionUsuarios.getTotalEliminaciones());
    }
}
