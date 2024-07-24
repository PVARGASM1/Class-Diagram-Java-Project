public class Consultorias  {
    // definir atributos 
    public String name_contact;
    public String name_company;
    public String email;
    public Int mobile;
    public String message;
    public StringBoolean type_service; // si el input es de select el dato como lo debo poner
    public Boolean documents; 

    //Contructor
    public Consultorias (String name_company, String name_company,String email, Int mobile, String message, Boolean type_service, Boolean documents){
        this.name_contact = name_contact;
        this.name_company = name_company
        this.email = email;
        this.mobile = mobile;
        this.message = message;
        this.type_service = type_service;
        this.documents = documents; 
    }
    //Crear metodo sin retorno por el void
    public void obtenerDatosConsultoria() {
        System.out.println("Contacto: " + name_contact + ", Empresa: " + name_company + ", Tipo Servicio: " + type_service);
    }
    
    // Creamos metodo de la clase Consultoria con retorno
    public String datosConsultoria (String name_company, String type_service){
        return this.name_company + type_service
    }

    //Principal-Objeto a partir del constructor
    public static void main (String[] args){
        Consultorias consultoria1 = new Consultorias ("Emermedica");

        //Llamar el método para mostrar datos de la constultoria
        consultoria1.obtenerDatosConsultoria();
    }
    
}