# Reto2 S6 – Gestión de Temas en Java

### 🎯 Objetivo general de la sesión
⚒️ Comprender los elementos fundamentales de una clase en Java, tales como los constructores, métodos especiales (`equals()`, `hashCode()`, `toString()`), el uso de `record` y `Objects.equals()`, así como los principios de encapsulación e inmutabilidad, para estructurar clases seguras, limpias y eficientes.

### 🎯 Objetivo del reto
Practicar el uso de:
- `Comparable` y `Comparator` para ordenar temas de clase.
- `CopyOnWriteArrayList` para gestionar de forma segura una lista de temas activos.
- C`oncurrentHashMap` para mantener un repositorio de recursos compartidos por tema, accesible de forma segura desde distintos usuarios.

## 💻 ¿Qué se implementó?
Se desarrolló una aplicación de consola en Java que demuestra el uso de colecciones concurrentes, ordenamientos y mapas:

1. **`CopyOnWriteArrayList<Tema>`**  
   - Lista segura para acceso concurrente que almacena objetos `Tema`.  
   - Se añaden temas con título y prioridad (1=urgente, 2=importante, 3=opcional).

2. **Ordenamientos**  
   - **Orden natural (alfabético)**:  
     - La clase `Tema` implementa `Comparable<Tema>` comparando títulos (`compareToIgnoreCase`).  
     - Se aplica `Collections.sort(GestionTemas)` para ordenar según el título.  
   - **Orden personalizado (por prioridad)**:  
     - Uso de `Comparator.comparingInt(Tema::getPrioridad)`.  
     - Llamada a `GestionTemas.sort(...)` para ordenar de menor a mayor prioridad.

3. **`ConcurrentHashMap<String, String>`**  
   - Repositorio concurrente que asocia cada título de tema con su URL de recurso.  
   - Permite inserciones y lecturas sin bloqueo explícito.  
   - Se recorre `keySet()` para mostrar título → enlace de recurso.

4. **Clase `Tema`**  
   - Atributos: `Titulo` (String) y `prioridad` (int).  
   - Constructor y getters.  
   - `compareTo(...)` para orden natural.  
   - `toString()` formateado como “Tema: \<Título\> | Prioridad: \<n\>”.

Este reto ilustra la combinación de colecciones concurrentes, interfaces de ordenamiento y estructuras de mapeo clave-valor en Java.
