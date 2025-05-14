public class Entrada {
    String NombreEvento;
    double PrecioEntrada;

    //Creamos/inicializamos el constructor
    public Entrada(String NombreEvento, double PrecioEntrada) {
        this.NombreEvento = NombreEvento;
        this.PrecioEntrada = PrecioEntrada;
    }
    // Método para mostrar la información
    public void mostrarInformacion(){
        System.out.println("Evento: " + NombreEvento + " | Precio: $" +PrecioEntrada );
    }
}
