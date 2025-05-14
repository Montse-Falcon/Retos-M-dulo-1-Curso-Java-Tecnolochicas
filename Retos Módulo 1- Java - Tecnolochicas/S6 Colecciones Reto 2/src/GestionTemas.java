import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class GestionTemas {
    public static void main (String[] args) {

        //1️⃣ Creamos una lista concurrente de temas
        CopyOnWriteArrayList<Tema> GestionTemas = new CopyOnWriteArrayList<>();

        // 2️⃣ Añadimos varios temas con su prioridad (1=urgente, 2=importante, 3=opcional)
        GestionTemas.add(new Tema ("Redes Básicas", 2));
        GestionTemas.add(new Tema ("Humanidades IV", 1));
        GestionTemas.add(new Tema ("Control", 3));
        GestionTemas.add(new Tema ("Comunicaciones analogicas", 2));

        // 3️⃣ Orden natural: orden alfabético por título (uso de Comparable<Tema>)
        Collections.sort(GestionTemas);
        System.out.println ("\n \uD83D\uDCDA Temas ordenados alfabéticamente: ");
        for (Tema t: GestionTemas) {
            System.out.println (t);
        }

        // 4️⃣ Orden personalizado: por prioridad ascendente (uso de Comparator)
        GestionTemas.sort(Comparator.comparingInt(Tema::getPrioridad));
        System.out.println("\n \uD83D\uDEA6  Temas ordenados por prioridad (1-3):");
        for (Tema t : GestionTemas) {
            System.out.println(t);
        }

        // 5️⃣ Creamos un repositorio concurrente de recursos por tema
        ConcurrentHashMap<String, String> recurso = new ConcurrentHashMap<>();

        // 6️⃣ Mostramos el repositorio de recursos
        recurso.put ("Redes Básicas", "https://recursos.edu/Redes");
        recurso.put ("Humanidades IV", "https://recursos.edu/Humanidades");
        recurso.put ("Control ", "https://recursos.edu/Control");
        recurso.put ("Comunicaciones analogicas", "https://recursos.edu/Comunicaciones");


        System.out.println("\n \uD83C\uDF10 Repositorio de los recursos: ");
        for (String clave : recurso.keySet()) {
            System.out.println(clave + " - " + recurso.get(clave));
        }

    }

}