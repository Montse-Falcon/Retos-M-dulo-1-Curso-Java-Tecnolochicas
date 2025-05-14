# 🚀 Reto1 S5 – Simulador de Unidades de Emergencia en Java

### 🎯 Objetivo general de la sesión
⚒️ Explorar los conceptos fundamentales de la programación orientada a objetos en Java: **herencia, composición, interfaces, clases abstractas y polimorfismo**, para escribir código más limpio, reutilizable y flexible.
### 🎯 Objetivo del reto
📄 Modelar una declaración de impuestos con `record` y validarla contra una cuenta fiscal usando encapsulación y comparación segura con `Objects.equals()`.

## 💻 ¿Qué se implementó?
Se desarrolló una aplicación en Java que modela el despliegue de distintas unidades de emergencia (ambulancia, patrulla y bomberos) mediante herencia, composición y polimorfismo:

1. **Clase abstracta `UnidadEmergencia`**  
   - **Atributo**:  
     - `nombre` (String): identifica la unidad.  
   - **Método concreto**:  
     - `activarUnidad()`: imprime el mensaje de activación con emoji de sirena.  
   - **Método abstracto**:  
     - `responder()`: debe ser implementado por cada subclase para definir su respuesta específica.

2. **Componentes comunes**  
   - `SistemaGPS`: método `localizar()` que imprime la ubicación actual.  
   - `Sirena`: método `activarSirena()` que indica la activación de la sirena.  
   - `Operador`: modelo del operador con método `reportarse()` para indicar que está listo.

3. **Subclases de `UnidadEmergencia`**  
   - **`Ambulancia`**  
     - En `responder()`: “🩺 Ambulancia en camino al hospital más cercano.”  
   - **`Patrulla`**  
     - En `responder()`: “🚓 Patrulla atendiendo situación de seguridad ciudadana.”  
   - **`UnidadBomberos`**  
     - En `responder()`: “🔥 Unidad de bomberos respondiendo a incendio estructural.”  

   Cada subclase introduce sus propios objetos `SistemaGPS`, `Sirena` y `Operador`, y define un método `iniciarOperacion()` que ejecuta el flujo completo:
   1. `activarUnidad()`  
   2. `gps.localizar()`  
   3. `sirena.activarSirena()`  
   4. `operador.reportarse()`  
   5. `responder()`  

4. **Clase `CentralEmergencias`**  
   - Crea instancias de `Ambulancia`, `Patrulla` y `UnidadBomberos`.  
   - Llama a `iniciarOperacion()` en cada unidad, mostrando en consola el proceso de activación y respuesta.

Este diseño ilustra la reutilización de código común, la especialización de comportamientos mediante herencia/polimorfismo y la composición de objetos auxiliares.
