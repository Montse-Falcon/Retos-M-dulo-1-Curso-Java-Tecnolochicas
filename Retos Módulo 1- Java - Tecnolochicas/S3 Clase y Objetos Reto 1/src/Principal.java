// Principal.java
public class Principal {
    public static void main(String[] args) {
        // Crear pasajero y vuelo
        Pasajero ana = new Pasajero("Ana Martínez", "X1234567");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        //  Reservar asiento (usando objeto Pasajero)
        if (vuelo.reservarAsiento(ana)) {
            System.out.println("\n✅ Reserva realizada con éxito.\n");
        } else {
            System.out.println("\n❌ No se pudo realizar la reserva.\n");
        }

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar la reserva
        System.out.println("❌ Cancelando reserva...\n");
        vuelo.cancelarReserva();

        // Mostrar itinerario tras cancelar
        System.out.println(vuelo.obtenerItinerario());

        //Reservar usando nombre y pasaporte
        if (vuelo.reservarAsiento("Mario Gonzalez", "Y7654321")) {
            // Mostrar itinerario final
            System.out.println(vuelo.obtenerItinerario());
        } else {
            System.out.println("❌ No se pudo realizar la reserva con datos manuales.");
        }
    }
}
