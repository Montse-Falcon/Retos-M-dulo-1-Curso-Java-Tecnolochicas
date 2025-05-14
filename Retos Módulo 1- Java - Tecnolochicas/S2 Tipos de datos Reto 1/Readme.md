# 🚀 Reto2 S2 – SimuladorFarmacia en Java
### 🎯 Objetivo general de la sesión
⚒️ Identificar y comprender los tipos de datos, variables, operadores, estructuras condicionales y ciclos en Java, para desarrollar programas con lógica básica mantenible y estructurada.

### 🎯 Objetivo del reto
⚒️ Desarrollar un programa que calcule el total de una compra en farmacia y aplique un descuento si supera cierta cantidad. Este reto refuerza el uso de operadores aritméticos, asignación, entrada por consola, e inferencia de tipo con `var`.

## 💻 ¿Qué se implementó?
Se desarrolló una aplicación en Java que simula la compra de un medicamento en una farmacia, con lógica de descuento:

1. **Lectura de datos**  
   - Se emplea `Scanner` para solicitar al usuario:
     - Nombre del medicamento (`String`).  
     - Precio unitario (`double`).  
     - Cantidad de piezas a comprar (`int`).  

2. **Cálculo del importe**  
   - Se calcula el total bruto:  
     ```java
     double total = precioUnitario * cantidad;
     ```
   - Si el total supera \$500, se aplica un 15 % de descuento:  
     ```java
     boolean aplicaDescuento = total > 500;
     double descuento = aplicaDescuento ? total * 0.15 : 0;
     ```
   - Se determina el total final restando el descuento:  
     ```java
     double totalFinal = total - descuento;
     ```

3. **Salida formateada**  
   - Se imprime en consola un resumen que incluye:
     - Nombre del medicamento y cantidad.  
     - Precio unitario.  
     - Total sin descuento.  
     - Indicador de si aplica descuento.  
     - Monto del descuento y total a pagar.
