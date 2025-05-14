// Main.java
public class Main {
    public static void main(String[] args) {
        // 🧾 Creamos dos facturas con el mismo folio pero distinto cliente/total
        Factura f1 = new Factura("FWAT0214 ", "Elena  Ruiz ", 13850.0);
        Factura f2 = new Factura("FWATA001 ", "Comercial BBB ", 3450.7);

        // 📄 Mostramos ambas usando toString()
        System.out.println(f1);
        System.out.println(f2);

        // 🔍 Comparamos si son iguales (mismo folio)
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}
