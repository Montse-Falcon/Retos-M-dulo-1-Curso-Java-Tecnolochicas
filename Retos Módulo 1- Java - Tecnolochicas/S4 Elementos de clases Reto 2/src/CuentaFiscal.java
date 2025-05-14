import java.util.Objects;

public class CuentaFiscal {
    private final String rfc;
    private double saldoDisponible;

    // Constructor
    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("El saldo no puede ser negativo.");
            this.saldoDisponible = 0;
        }
    }

    // Getters
    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    // Validación del RFC con Objects.equals()
    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    public void mostrarCuenta(){
        System.out.println("\uD83C\uDFE6 Cuenta Fiscal registrada con RFC: " + rfc + " . Saldo disponible: $" + saldoDisponible);
    }
}
