# Reto2 S7 – Analizador de Logs en Java

### 🎯 Objetivo general de la sesión
⚒️ Aprender a utilizar la API `java.nio.file` (NIO.2) para manejar archivos y directorios de forma eficiente y segura, comprendiendo desde las operaciones básicas de lectura y escritura hasta funciones avanzadas como copiar, mover, verificar permisos y aplicar buenas prácticas de manejo de archivos en Java.

### 🎯 Objetivo del reto
🧠 Aplicar el uso de `BufferedReader`, `try-with-resources` y manejo de excepciones para analizar grandes archivos de logs generados por pruebas automatizadas. Este reto simula una tarea del rol de Automated Testing Engineer (QA), enfocada en el procesamiento eficiente de información y la trazabilidad de errores.

## 💻 ¿Qué se implementó?
Se desarrolló una aplicación de consola en Java que lee y analiza un archivo de logs (`errores.log`), cuenta y reporta líneas de error y advertencia, y maneja fallos de E/S registrándolos en otro archivo:

1. **Lectura de logs**  
   - Se abre `errores.log` con `BufferedReader` sobre `Files.newBufferedReader(…)`.  
   - Se recorre línea a línea, incrementando `totalLineas`.  
   - Para cada línea, se compara en mayúsculas para detectar y contar las ocurrencias de `"ERROR"` y `"WARNING"`.

2. **Resumen de resultados**  
   - Al finalizar la lectura, se imprime en consola un informe con:
     - Total de líneas leídas.  
     - Número de errores y advertencias.  
     - Porcentajes de líneas que contienen `"ERROR"` y `"WARNING"`, formateados a dos decimales.

3. **Manejo de excepciones**  
   - Si ocurre un `IOException` al leer `errores.log`, se imprime el stack trace en consola.  
   - Se crea o sobrescribe `registro_fallos.txt` usando `BufferedWriter` para guardar el mensaje de error (`e.getMessage()`).  
   - Se notifica en consola si el mensaje de fallo fue registrado o si falló la escritura.

Este reto demuestra el uso de Java NIO (`Files`, `Path`), flujos de lectura y escritura con buffer, manejo de excepciones y cálculo de estadísticas básicas.
