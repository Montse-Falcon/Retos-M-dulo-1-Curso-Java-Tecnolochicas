# Reto1 S4 – Simulador de Facturas con Igualdad en Java

### 🎯 Objetivo general de la sesión
⚒️ Comprender los elementos fundamentales de una clase en Java, tales como los constructores, métodos especiales (`equals()`, `hashCode()`, `toString()`), el uso de `record` y `Objects.equals()`, así como los principios de encapsulación e inmutabilidad, para estructurar clases seguras, limpias y eficientes.

### 🎯 Objetivo del reto
💼 Modelar facturas emitidas para un sistema contable, reforzando el uso de constructores, `equals()`, `hashCode()` y `toString()`.

## 💻 ¿Qué se implementó?
Se desarrolló una pequeña aplicación en Java que modela facturas e ilustra la personalización de los métodos `toString()`, `equals()` y `hashCode()`:

1. **Clase `Factura`**  
   - **Atributos privados**:  
     - `folio` (String): identificador único de la factura.  
     - `cliente` (String): nombre del cliente.  
     - `total` (double): monto total de la factura.  
   - **Constructor**: inicializa los tres atributos.  
   - **Método `toString()`**:  
     - Anotado con `@Override`, devuelve un formato legible con emoji de factura, por ejemplo:  
       ```
       🧾 Factura [Folio = FWAT0214 Cliente = Elena Ruiz Total = $13850.0]
       ```
   - **Método `equals(Object obj)`**:  
     - Dos facturas se consideran iguales si comparten el mismo `folio`.  
   - **Método `hashCode()`**:  
     - Calculado únicamente a partir de `folio`, garantizando consistencia con `equals()`.

2. **Clase `Main`**  
   - Crea dos instancias de `Factura` con el mismo `folio` pero distinto cliente y total.  
   - Imprime ambas usando `System.out.println()`, que invoca `toString()`.  
   - Compara la igualdad de objetos con `equals()` y muestra el resultado en consola.

Este reto permite entender cómo personalizar la representación de objetos y definir criterios de igualdad y dispersión (hash code) en Java.
