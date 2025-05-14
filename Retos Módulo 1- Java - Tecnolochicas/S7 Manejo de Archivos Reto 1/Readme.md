# Reto1 S7 – Registro de Simulación en Java

### 🎯 Objetivo general de la sesión
⚒️ Aprender a utilizar la API java.nio.file (NIO.2) para manejar archivos y directorios de forma eficiente y segura, comprendiendo desde las operaciones básicas de lectura y escritura hasta funciones avanzadas como copiar, mover, verificar permisos y aplicar buenas prácticas de manejo de archivos en Java.

### 🎯 Objetivo del reto
🧠 Aplicar las clases `Path` y `File`s de la API `java.nio.file` (NIO.2) para crear un archivo de configuración de simulación, verificar su existencia y leer su contenido. Este ejercicio simula una tarea real del rol de Process Simulation Engineer, donde se documentan los parámetros antes de ejecutar una corrida de simulación.

## 💻 ¿Qué se implementó?
Se desarrolló una aplicación de consola en Java que realiza operaciones de entrada/salida de archivos para guardar y leer parámetros de simulación:

1. **Definición de rutas**  
   - Se utiliza `Paths.get("config")` para referenciar la carpeta `./config`.  
   - Se crea la ruta al archivo `parametros.txt` dentro de esa carpeta.

2. **Creación de directorio**  
   - Con `Files.notExists(carpetaConfig)` y `Files.createDirectories(...)` se asegura que la carpeta `config/` exista, imprimiendo un mensaje de confirmación.

3. **Escritura de archivo**  
   - Se prepara un `String` con parámetros de simulación (tiempo de ciclo, velocidad de línea, número de estaciones).  
   - Con `Files.write(...)` se crea o sobrescribe `parametros.txt` con dicho contenido, mostrando un mensaje de éxito.

4. **Verificación y lectura**  
   - Se comprueba la existencia del archivo con `Files.exists(...)`.  
   - Si existe, se lee todo el contenido en un `String` mediante `Files.readString(...)` y se imprime en consola.  
   - En caso de error de E/S, se captura `IOException` y se muestra un mensaje de fallo.

Este flujo cubre las operaciones básicas de manejo de archivos y directorios en Java NIO.
