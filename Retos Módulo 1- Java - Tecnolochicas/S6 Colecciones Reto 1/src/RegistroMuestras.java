import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {

        // Paso 1: Creamos un ArrayList para registrar todas las especies en el orden de llegada.
        ArrayList<String> listaMuestras = new ArrayList<>();

        listaMuestras.add("Homo sapiens");
        listaMuestras.add("Mus musculus");
        listaMuestras.add("Arabidopsis thaliana");
        listaMuestras.add("Homo sapiens");  // duplicado intencional

        //Mostramos la lista completa en el orden en que llegaron
        System.out.println("\uD83D\uDCE5 Muestras  recibidas en orden.");
        for (int i = 0; i < listaMuestras.size(); i++) {
            System.out.println((i + 1) + "." + listaMuestras.get(i));
        }

        // Paso 2: Creamos un HashSet a partir del ArrayList para filtrar y obtener solo especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(listaMuestras);

        // Imprimimos las especies únicas procesadas (el orden no está garantizado)
        System.out.println("\n✅ Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // Paso 3: Creamos un HashMap para asociar cada ID de muestra con el investigador responsable.
        HashMap<String, String> mapaInvestigadores = new HashMap<>();

        // asociamos los ID con el investigador
        mapaInvestigadores.put("M-001", "Dra. Polet");
        mapaInvestigadores.put("M-002", "Dr. Cortéz");
        mapaInvestigadores.put("M-003", "Dra. Jileca");

        // Mostramos la asignación de cada muestra a su investigador
        System.out.println("\n👩‍🔬 Asignación de muestras a investigadores:");
        for (Map.Entry<String, String> entry : mapaInvestigadores.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Paso 4: Paso 4: Búsqueda de investigador responsable de una muestra específica
        String idBuscar = "M-002"; // Puedes cambiar este valor si lo deseas
        System.out.println("\n🔍 Investigador responsable de la muestra " + idBuscar + ": " + mapaInvestigadores.get(idBuscar));

    }
}