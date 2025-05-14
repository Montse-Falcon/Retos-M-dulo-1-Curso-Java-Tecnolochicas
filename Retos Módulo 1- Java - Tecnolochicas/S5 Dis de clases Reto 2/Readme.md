# Reto2 S5 – Simulador de Caja Registradora  en Java

### 🎯 Objetivo general de la sesión
⚒️ Comprender los elementos fundamentales de una clase en Java, tales como los constructores, métodos especiales (`equals()`, `hashCode()`, `toString()`), el uso de `record` y `Objects.equals()`, así como los principios de encapsulación e inmutabilidad, para estructurar clases seguras, limpias y eficientes.

### 🎯 Objetivo del reto
Diseñar un sistema de pagos en el que distintos métodos de pago (efectivo, tarjeta, transferencia) compartan una estructura común pero tengan comportamientos específicos. Aplicarás el uso de interfaces, clases abstractas, y polimorfismo para modelar un flujo flexible y extensible.

## 💻 ¿Qué se implementó?
Se desarrolló una aplicación de consola en Java que simula el procesamiento de distintos métodos de pago usando **interfaces**, **herencia** y **polimorfismo**:

1. **Interfaz `Autenticable`**  
   - Declara el método `boolean autenticar()`, que cada método de pago debe implementar para validar su autenticación.

2. **Clase abstracta `MetodoPago`**  
   - Implementa `Autenticable` y define el atributo protegido `monto`.  
   - Define el método abstracto `procesarPago()` y un método concreto `mostrarResumen()` para imprimir el tipo de pago y monto.

3. **Clases concretas de pago**  
   - **`PagoEfectivo`**  
     - `autenticar()` siempre devuelve `true`.  
     - `procesarPago()` simula pago en efectivo.  
   - **`PagoTarjeta`**  
     - Atributo extra `saldoDisponible`.  
     - `autenticar()` verifica que `saldoDisponible >= monto`.  
     - `procesarPago()` simula pago con tarjeta.  
   - **`PagoTransferencia`**  
     - Atributo `validadoExternamente` (boolean).  
     - `autenticar()` devuelve el valor de `validadoExternamente`.  
     - `procesarPago()` simula transferencia bancaria.

4. **Clase `CajaRegistradora` (main)**  
   - Crea un arreglo de `MetodoPago` con instancias de cada tipo (`PagoEfectivo`, `PagoTarjeta`, `PagoTransferencia`).  
   - Para cada pago:
     1. Llama a `autenticar()`.  
     2. Si es exitoso, imprime “✅ Autenticación exitosa.”, luego `procesarPago()` y `mostrarResumen()`.  
     3. Si falla, imprime “❌ Fallo de autenticación” junto con el tipo de pago.

Este diseño demuestra cómo unificar distintos comportamientos de pago bajo una interfaz común, aprovechando la herencia y el polimorfismo para procesar cada tipo de forma genérica.
