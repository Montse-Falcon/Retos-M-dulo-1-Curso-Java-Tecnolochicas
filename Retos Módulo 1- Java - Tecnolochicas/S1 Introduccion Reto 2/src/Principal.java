import java.util.Scanner;

public class Principal {
    public static void main (String [] args) {

    //Creación de objetos
        Entrada entrada1 = new Entrada ("Concierto Enhypen de Kpop", 10000.00);
        Entrada entrada2 = new Entrada ("Concierto Blackpink de Kpop", 15045.78);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        //Reto adicional record
        Entrada_Record entrada3 = new Entrada_Record("Concierto BIGBANG de Kpo", 23456.67);
        entrada3.mostrarInformacion();
    }
}
