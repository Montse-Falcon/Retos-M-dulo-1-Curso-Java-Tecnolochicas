#🚀 Reto2 S2 – Simulador de Cajero Automático en Java

### 🎯 Objetivo general de la sesión
⚒️ Identificar y comprender los tipos de datos, variables, operadores, estructuras condicionales y ciclos en Java, para desarrollar programas con lógica básica mantenible y estructurada.

### 🎯 Objetivo del reto
💻 Implementar un programa que simule un cajero automático básico, aplicando estructuras de control como `while`, `switch`, `break` y `continue` para navegar entre opciones y validar operaciones del usuario.

## 💻 ¿Qué se implementó?
Se desarrolló una aplicación de consola en Java que simula las operaciones básicas de un cajero automático:

1. **Saldo inicial**  
   - Se define un saldo inicial (`double saldo = 1000.0`) al arrancar la aplicación.

2. **Interfaz de menú con `do-while`**  
   - Se presenta un menú repetitivo que ofrece las opciones:
     1. Consultar saldo  
     2. Depositar dinero  
     3. Retirar dinero  
     4. Salir  

3. **Lógica de operaciones**  
   - **Consultar Saldo**: muestra el saldo actual.  
   - **Depositar Dinero**:  
     - Se lee el monto a depositar.  
     - Se valida que sea mayor a 0.  
     - Se suma al saldo y se informa el nuevo total.  
   - **Retirar Dinero**:  
     - Se lee el monto a retirar.  
     - Se valida que sea mayor a 0 y que no supere el saldo disponible.  
     - Se resta del saldo y se informa el nuevo total, o bien se notifica saldo insuficiente.  
   - **Salir**: finaliza el programa mostrando un mensaje de despedida.

4. **Validaciones y mensajes**  
   - Para montos inválidos (≤ 0) y retiros superiores al saldo, se muestran mensajes de error y se regresa al menú sin modificar el saldo.
