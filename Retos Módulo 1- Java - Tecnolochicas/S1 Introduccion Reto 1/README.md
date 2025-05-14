# Reto1 S1 – Registro de Paciente en Java

### 🎯 Objetivo general de la sesión
⚒️ Identificar y comprender los conceptos básicos de Java, incluyendo Programación Orientada a Objetos (POO), para aplicarlos en la creación de programas sencillos.

### 🎯 Objetivo del reto
⚒️ Desarrollar un programa en Java que registre los datos de un paciente, aplicando los fundamentos de clases, objetos, atributos, métodos y la entrada de datos por consola.

## 💻 ¿Qué se implementó?
Se desarrolló una pequeña aplicación en Java que permite:
- Definir una clase `Paciente` con atributos:
  - `Nombrepa` (String): nombre del paciente.  
  - `edad` (int): edad del paciente.  
  - `Numeropa` (String): número de expediente del paciente.
- Implementar un método `mostrarInformacion()` en la clase `Paciente` para imprimir por consola los datos cargados.
- En la clase `Principal`:
  1. Se usa `Scanner` para leer desde teclado el nombre, edad y número de expediente.  
  2. Se crea una instancia de `Paciente`, se asignan los valores ingresados y, finalmente, se llama a `mostrarInformacion()` para desplegar la información.

El flujo completo permite al usuario introducir los datos de un paciente y visualizar un informe básico en consola.
