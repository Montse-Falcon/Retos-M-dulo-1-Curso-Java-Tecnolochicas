import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declaracion de un saldo inicial
        var saldo = 1000.0;
        int opcion;


        //aplicamos la estructura do-while para el menú
        do {
            System.out.println("\nBienvenido al cajero automático");
            System.out.println("Escoja una opción: ");
            System.out.println("✅ 1. Consultar Saldo");
            System.out.println("\uD83D\uDCB0 2. Depositar Dinero");
            System.out.println("\uD83D\uDCB8 3. Retirar Dinero");
            System.out.println("\uD83D\uDC4B 4. Salir");

            opcion = scanner.nextInt(); // Se lee la opción que selecciono el usuari

            switch (opcion) {
                case 1 -> { //imprimir el saldo actual
                    System.out.println("\uD83D\uDCB8 Tú saldo actual es: $" + saldo);
                }
                case 2 -> { //Se ingresa la cantidad a depositar

                    System.out.println("Ingrese el monto a depositar: ");
                    double deposito = scanner.nextDouble(); // se almacena/leee el monto a depositar

                    if (deposito <= 0) { // Se valida que el monto se mayor a 0
                        System.out.println("❌ No se puede depositar, el monto debe ser mayor a 0.");
                        continue; // nos regresa al menú principal y no modifica nada
                    }

                    saldo += deposito; //suma el saldo con el deposito, actualiza el saldo
                    System.out.println("✅ Deposito realizado con éxito. " + "\nTu saldo actual es: $" + saldo);
                }
                case 3 -> { // se ingresa la cantidad a retirar
                    System.out.println("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble(); // se almacena/leee el monto a retirar

                    if (retiro <= 0) { // Se valida que el monto no sea menor a 0
                        System.out.println("❌ No puede retirar, el monto debe ser mayor a 0");
                        continue; //nos regresa al menú principal y no modifica nada
                    }
                    // se verifica que en la cuenta haya saldo suficiente
                    if (retiro > saldo) {
                        System.out.println("❌ Saldo insuficiente. \nTu saldo actual es: $" + saldo);
                    } else {
                        saldo -= retiro; // resta el saldo actual con el retiro, actualiza en saldo actual
                        System.out.println("✅ Retiro realizado con éxito. " + "\nTu saldo actual es: $" + saldo);
                    }
                }
                case 4 -> { // Salir del cajero
                    System.out.println("Gracias por usar este cajero. ¡Hasta la próxima! \uD83D\uDC4B ");
                }
                default -> { // no válido
                    System.out.println("\uD83D\uDC4B Opción no válida. Intente nuevamente.");
                }
            }
        } while (opcion != 4); // Se sigue repitiendo el menú, siempre y cuando el usuario no elija salir

        scanner.close(); // cerramos el buffer
    }
}
