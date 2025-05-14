# Reto1 S3 – Simulador de Reservas de Vuelo en Java

### 🎯 Objetivo general de la sesión
⚒️ 🔎 Comprender los fundamentos de la programación orientada a objetos en Java, enfocándose en la creación y uso de clases y objetos, definición de métodos, control de acceso mediante modificadores y uso de Optional para el manejo seguro de valores nulos.

### 🎯 Objetivo del reto
Diseñar un sistema básico de reservas de vuelo aplicando los fundamentos de la Programación Orientada a Objetos en Java. Practicarás la creación de clases y objetos, el uso de atributos static y final, así como la definición de métodos con parámetros y valores de retorno.

## 💻 ¿Qué se implementó?
Se desarrolló una aplicación de consola en Java que simula la reserva y cancelación de asientos en un vuelo, mediante dos clases principales:

1. **Clase `Pasajero`**  
   - **Atributos**:  
     - `nombre` (String): nombre completo del pasajero.  
     - `pasaporte` (String): número de pasaporte.  
   - **Constructor**: inicializa ambos atributos.

2. **Clase `Vuelo`**  
   - **Atributos**:  
     - `codigoVuelo` (final String): código identificador del vuelo.  
     - `destino` (String): ciudad o país de destino.  
     - `horaSalida` (String): hora programada de salida.  
     - `asientoReservado` (Pasajero): referencia al pasajero que ha reservado, o `null` si está libre.  
   - **Constructor**: recibe código, destino y hora, y deja `asientoReservado` en `null`.  
   - **Métodos**:  
     - `boolean reservarAsiento(Pasajero p)`: reserva el asiento si está libre, asignando el objeto `Pasajero` y devolviendo `true`; si ya está ocupado, devuelve `false`.  
     - `boolean reservarAsiento(String nombre, String pasaporte)`: sobrecarga que crea internamente un nuevo `Pasajero` y delega en el método anterior.  
     - `void cancelarReserva()`: libera el asiento asignando `null` a `asientoReservado`.  
     - `String obtenerItinerario()`: genera un resumen con código, destino, hora de salida y estado de la reserva (libre o con pasajero).

3. **Clase `Principal`**  
   - Se crea un pasajero (`Ana Martínez`) y un vuelo (`UX123` a París, 14:30).  
   - Se invoca `reservarAsiento(Pasajero)` y se muestra un mensaje de éxito o fallo.  
   - Se imprime el itinerario con `obtenerItinerario()`.  
   - Se cancela la reserva y se vuelve a mostrar el itinerario.  
   - Finalmente, se prueba la sobrecarga `reservarAsiento(String, String)` con datos de “Mario Gonzalez”.

Este flujo demuestra la creación de objetos, la sobrecarga de métodos, y la manipulación de estado interno para reservar y cancelar asientos.
