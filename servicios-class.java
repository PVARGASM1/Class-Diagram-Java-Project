public class Servicios extends Consultorias {
    // definir atributos de la subclase
    public String descripcion_servicio;
    
    //Constructor
    public Servicios (String descripcion_servicio){
        this.descripcion_servicio = descripcion_servicio;
    }

    //Crear metodo sin retorno
    public void obtenerServicio(){
        System.out.println("El servicio de la consultoria es: " + descripcion_servicio);
    }

    // Getters y Setters 
    public String getServicio() {
        return descripcion_servicio;
    }

    public void setServicio(String descripcion_servicio) {
        this.descripcion_servicio = descripcion_servicio;
    }
}