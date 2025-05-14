package Reto1S1;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Paciente pac1 = new Paciente ();

        System.out.print  ("Ingresa el nombre del paciente: ");
        pac1.Nombrepa = input.nextLine();

        System.out.print ("Ingresa la edad: ");
        pac1.edad = input.nextInt();
        input.nextLine(); // Limpiar el buffer

        System.out.print ("Ingresa el nombre del paciente: ");
        pac1.Numeropa = input.nextLine();

        input.close (); //cerrar el buffer

        pac1.mostrarInformacion(); //imprimir la información obtenida por el usuario
    }
}
