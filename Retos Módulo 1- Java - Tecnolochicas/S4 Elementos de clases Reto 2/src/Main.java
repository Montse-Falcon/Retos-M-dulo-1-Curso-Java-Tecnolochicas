public class Main {
    public static void main(String[] args) {
        // Crear una declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("TECE142356000", 8700.0);

        // Crear una cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("TECE142356000", 15500.0);

        // Mostrar la información
        System.out.println("📄 Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        // Validar RFC
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + rfcValido);
    }
}
