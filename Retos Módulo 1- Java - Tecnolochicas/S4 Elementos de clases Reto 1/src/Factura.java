import java.util.Objects;
public class Factura {
    private String folio;
    private String cliente;
    private double total;

    //Constructor con parámetros para inicializar todos los atributos
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // toString() formato solicitado
    @Override
    public String toString() {
        return ("🧾 Factura [Folio = " + folio + "Cliente = " + cliente + "Total= $" + total + "]");
    }

    // equals(): dos facturas son iguales si su folio coincide
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass ()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio);
    }

    // 🔑 hashCode() basado únicamente en folio
    @Override
    public int hashCode () {return folio.hashCode(); }
}
