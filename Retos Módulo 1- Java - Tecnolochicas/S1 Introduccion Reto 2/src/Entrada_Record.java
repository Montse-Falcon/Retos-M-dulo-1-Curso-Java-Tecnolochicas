public record Entrada_Record(String NombreEvento, double PrecioEntrada) {
    public void mostrarInformacion() {
        System.out.println("Evento: " + NombreEvento + " | Precio: $" +PrecioEntrada );
    }
}
