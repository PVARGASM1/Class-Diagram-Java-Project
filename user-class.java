public class Usuarios {
    // definir atributos 
    public String name;
    public String email;
    private String password;

    //Constructor
    public Usuarios(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password; 
    }

    //Crear metodo sin retorno por el void
    public void obtenerDatosUser() {
        System.out.println("Nombre: " + name);
    }

    //Crear metodo de la clase Usuarios con retorno
    public String datosUser (String name, String email){
        return this.name + email
    }

    //Principal - Objeto a partir del constructor 
    public static void main(String[] args){
        Usuarios usuario1 = new Usuarios ("Andrea", "pav@gmail.com");

        //Llamar el método para mostrar el datos del usuario.
        usuario1.datosUser();
    }
    
}