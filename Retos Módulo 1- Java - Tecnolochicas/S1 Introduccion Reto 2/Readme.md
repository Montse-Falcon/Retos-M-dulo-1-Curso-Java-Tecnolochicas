# Reto2 S1 – Gestión de Entradas  en Java
### 🎯 Objetivo general de la sesión
⚒️ Identificar y comprender los conceptos básicos de Java, incluyendo Programación Orientada a Objetos (POO), para aplicarlos en la creación de programas sencillos.

### 🎯 Objetivo del reto
⚒️ Desarrollar un programa en Java que permita registrar la información básica de entradas para eventos, aplicando los fundamentos de clases, objetos, atributos, métodos y el uso de constructores.

## 💻 ¿Qué se implementó?
Se desarrolló una pequeña aplicación en Java para modelar y mostrar información de **entradas a eventos**, con dos aproximaciones:

1. **Clase `Entrada`**  
   - Atributos:  
     - `NombreEvento` (String): nombre del evento.  
     - `PrecioEntrada` (double): precio de la entrada.  
   - Constructor que inicializa ambos atributos.  
   - Método `mostrarInformacion()` que imprime en consola el nombre del evento y su precio.

2. **Record `Entrada_Record`** (Java 16+)  
   - Define un `record` con los mismos dos componentes (`NombreEvento`, `PrecioEntrada`).  
   - Añade manualmente el método `mostrarInformacion()` para mostrar los datos.

3. **Clase `Principal`**  
   - Crea instancias de `Entrada` (`entrada1`, `entrada2`) y de `Entrada_Record` (`entrada3`).  
   - Llama a `mostrarInformacion()` en cada instancia para desplegar en consola los datos de los eventos.

Con ello, se compara la definición tradicional de una clase con la sintaxis compacta de un `record`, validando que ambos enfoques permiten modelar datos inmutables y comportamientos simples.
