# Reto2 S4 – Simulador de Cuenta Fiscal en Java

### 🎯 Objetivo general de la sesión
⚒️ Comprender los elementos fundamentales de una clase en Java, tales como los constructores, métodos especiales (`equals()`, `hashCode()`, `toString()`), el uso de `record` y `Objects.equals()`, así como los principios de encapsulación e inmutabilidad, para estructurar clases seguras, limpias y eficientes.

### 🎯 Objetivo del reto
📄 Modelar una declaración de impuestos con `record` y validarla contra una cuenta fiscal usando encapsulación y comparación segura con `Objects.equals()`.

## 💻 ¿Qué se implementó?
Se desarrolló una aplicación de consola en Java que modela una cuenta fiscal y verifica la validez de un RFC a partir de una declaración de impuestos:

1. **Clase `CuentaFiscal`**  
   - **Atributos**:  
     - `rfc` (final String): RFC del contribuyente, inmutable.  
     - `saldoDisponible` (double): saldo que puede ser usado, validado para no quedar negativo.  
   - **Constructor**:  
     - Recibe RFC y saldo; si el saldo es negativo, lo ajusta a 0 e imprime un aviso.  
   - **Métodos**:  
     - `getRfc()` y `getSaldoDisponible()`: getters estándar.  
     - `boolean validarRFC(DeclaracionImpuestos d)`: compara el RFC de la cuenta con el de la declaración usando `Objects.equals()`.  
     - `void mostrarCuenta()`: imprime un resumen con emoji de banco y muestra el RFC y saldo.

2. **Record `DeclaracionImpuestos`**  
   - Componentes:  
     - `rfcContribuyente` (String): RFC declarado.  
     - `montoDeclarado` (double): monto de impuestos reportado.  

3. **Clase `Main`**  
   - Crea un `DeclaracionImpuestos` con RFC y monto.  
   - Crea una `CuentaFiscal` con el mismo RFC y un saldo inicial.  
   - Imprime por consola la información de la declaración y de la cuenta.  
   - Llama a `validarRFC(...)` para confirmar que el RFC de la declaración coincide con el de la cuenta, e imprime el resultado.

Este flujo muestra el uso de `final`, validaciones en el constructor, el uso de `record` para datos inmutables, y la comparación segura de Strings con `Objects.equals()`.
