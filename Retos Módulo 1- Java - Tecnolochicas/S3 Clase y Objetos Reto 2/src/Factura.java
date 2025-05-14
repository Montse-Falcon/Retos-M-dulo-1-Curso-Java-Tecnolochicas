
import java.util.Optional;


public class Factura {
    // Atributos privados
    private double monto;
    private String  descripcion;  // 🔒
    private Optional<String> rfc;

    // Métodos de constructor públicos
    public Factura(double monto, String descripcion, String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc= Optional.ofNullable(rfc);
    }

    // Métodos publicos que devuelven información
    public  String getResum () {
        String resumen = "\uD83D\uDCC4  Generada : \n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        resumen += "RFC: " + rfc.orElse("No proporcionado" + "\n");

        return resumen;
    }

}
