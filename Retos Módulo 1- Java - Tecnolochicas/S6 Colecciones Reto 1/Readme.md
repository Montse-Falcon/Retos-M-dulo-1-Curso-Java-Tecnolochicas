# Reto1 S6 – Registro de Muestras en Java

### 🎯 Objetivo general de la sesión
⚒️ Comprender los elementos fundamentales de una clase en Java, tales como los constructores, métodos especiales (`equals()`, `hashCode()`, `toString()`), el uso de `record` y `Objects.equals()`, así como los principios de encapsulación e inmutabilidad, para estructurar clases seguras, limpias y eficientes.

### 🎯 Objetivo del reto
Practicar el uso de `ArrayList`, `HashSet` y `HashMap` en un contexto profesional relacionado con la biotecnología, para registrar muestras, identificar elementos únicos y asociar datos clave.

## 💻 ¿Qué se implementó?
Se desarrolló una aplicación de consola en Java que ilustra el uso de las principales colecciones de la API de Java (`List`, `Set`, `Map`) para gestionar un flujo de trabajo de registro de muestras:

1. **`ArrayList<String>`**  
   - Se utiliza para almacenar todas las especies recibidas en el orden de llegada.  
   - Se muestra la lista completa numerada, incluyendo duplicados para simular entradas repetidas.

2. **`HashSet<String>`**  
   - Se construye a partir del `ArrayList` para filtrar y obtener únicamente las especies únicas.  
   - Se imprime el conjunto resultante (el orden de impresión no está garantizado).

3. **`HashMap<String, String>`**  
   - Asocia cada **ID de muestra** (`String`) con su **investigador responsable** (`String`).  
   - Se recorre el mapa para mostrar todas las asignaciones clave → valor.  
   - Se realiza una búsqueda específica de un investigador a partir de un ID dado (`get(idBuscar)`).

Este flujo demuestra cómo usar colecciones para almacenar datos ordenados, filtrar duplicados y crear asociaciones clave-valor, así como las iteraciones sobre cada estructura.
