import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        //Pregunta al usuario
        System.out.print ("Ingrese el Nombre del Medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.print ("Ingrese el Precio: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print ("Ingrese la cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        //Cálculo del total (con prioridad de operadores)
        double total = (precioUnitario * cantidad);


        // Descuento si el total supera $500
        boolean aplicaDescuento = total > 500;

        //Asignación del descuento (15%)
        double descuento = aplicaDescuento ? total *0.15 : 0 ;

        //Cálculo final
        double totalFinal = total - descuento;

        //Salida formateada
        System.out.println("\n Resumen de la Compra");
        System.out.println("Medicamento: " + medicamento + "Piezas: " + cantidad);
        System.out.println("Precio Unitario:  $" + precioUnitario);
        System.out.println("Total sin descuento:  $" + total);
        System.out.println("¿Aplica descuento? " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}
