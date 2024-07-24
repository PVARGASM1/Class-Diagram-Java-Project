public class Compra  {
    // definir atributos 
    public double id_buy ;
    public String pay_method;
    public double buy_date ;
    public Int value;
   
    //Constructor
    public Compra (double id_buy, String pay_method, double buy_date, Int value){
        this.id_buy = id_buy;
        this.pay_method = pay_method;
        this.buy_date = buy_date;
        this.value = value;        
    }
    //Crear metodo sin retorno por el void
    public void obtenerValueCompra() {
        System.out.println("Valor: " + value);
    }

    //Creamos metodos de la clase Compra con retorno
    public String obtenerDatosCompra (double id_buy, Int value){
        return this.id_buy + value
    }

    //Principal - Objeto a partir del constructor
    public static void main(Int[] args){
        Compra compra1 = new Compra (200, "abc123");

        //Llamar el método para mostrar valor compra.
        compra1.obtenerValueCompra();
    }
}