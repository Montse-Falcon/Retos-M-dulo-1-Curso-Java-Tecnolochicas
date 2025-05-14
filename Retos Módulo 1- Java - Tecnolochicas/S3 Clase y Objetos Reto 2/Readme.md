# Reto2 S3 – Simulador de Facturas en Java

### 🎯 Objetivo general de la sesión
⚒️ Identificar y comprender los tipos de datos, variables, operadores, estructuras condicionales y ciclos en Java, para desarrollar programas con lógica básica mantenible y estructurada.

### 🎯 Objetivo del reto
Diseñar una clase `Factura` aplicando los principios de encapsulación con modificadores de acceso y utilizando la clase `Optional` para manejar valores que pueden ser nulos, como el RFC del cliente.

## 💻 ¿Qué se implementó?
Se desarrolló una aplicación de consola en Java para modelar facturas con campo RFC opcional, aprovechando la clase `Optional`:

1. **Clase `Factura`**  
   - **Atributos privados**:  
     - `monto` (double): importe de la factura.  
     - `descripcion` (String): detalle del servicio o producto.  
     - `rfc` (Optional<String>): RFC del emisor, que puede o no estar presente.  
   - **Constructor**: recibe monto, descripción y un `String` de RFC (que puede ser `null`), inicializando `rfc = Optional.ofNullable(rfc)`.  
   - **Método `getResum()`**:  
     - Construye un resumen con emoji de documento.  
     - Incluye descripción, monto y muestra el RFC si está presente, o “No proporcionado” en caso contrario, usando `rfc.orElse(...)`.

2. **Clase `Main`**  
   - Crea dos instancias de `Factura`:  
     - Una con RFC válido (`"ABTTC010101XYZ"`).  
     - Otra con RFC `null` (no proporcionado).  
   - Llama a `getResum()` en ambas y las imprime en consola, demostrando el uso de `Optional` para manejar datos ausentes.

Este reto muestra cómo encapsular datos y manejar la ausencia de valores de forma segura y expresiva con `Optional`.
