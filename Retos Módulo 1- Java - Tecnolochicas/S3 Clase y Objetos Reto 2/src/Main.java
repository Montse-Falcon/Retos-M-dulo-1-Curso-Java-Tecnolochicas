
public class Main {
    public static void main(String[] args) {
        // Creamos dos facturas: una con RFC y otra sin RFC (null)
        Factura facturaConRfc = new Factura(2600.0, "Servicio de consultoría", "ABTTC010101XYZ");
        Factura facturaSinRfc = new Factura(78000.0, "Reparación de equipo", null);

        // 🖨️ Imprimimos el resumen de ambas facturas
        System.out.println(facturaConRfc.getResum());
        System.out.println(facturaSinRfc.getResum());
    }
}
