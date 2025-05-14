import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        // Rutas de los archivos
        Path archivoLogs = Paths.get("errores.log");
        Path archivoRegistroFallos = Paths.get("registro_fallos.txt");

        // Contadores para el análisis
        int totalLineas = 0;
        int conteoErrores = 0;
        int conteoWarnings = 0;

        // Intentamos leer el archivo de logs
        try (BufferedReader lector = Files.newBufferedReader(archivoLogs)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;
                // Normalizamos a mayúsculas para buscar sin distinción de case
                String lineaUpper = linea.toUpperCase();
                if (lineaUpper.contains("ERROR")) {
                    conteoErrores++;
                }
                if (lineaUpper.contains("WARNING")) {
                    conteoWarnings++;
                }
            }

            // Imprimimos el resumen
            System.out.println("📊 Resumen del análisis de errores.log");
            System.out.println("-------------------------------------------------");
            System.out.printf("Total de líneas leídas      : %d%n", totalLineas);
            System.out.printf("Cantidad de errores (ERROR) : %d%n", conteoErrores);
            System.out.printf("Cantidad de advertencias    : %d%n", conteoWarnings);

            if (totalLineas > 0) {
                double porcentajeErrores   = conteoErrores   * 100.0 / totalLineas;
                double porcentajeWarnings = conteoWarnings * 100.0 / totalLineas;
                System.out.printf("%% Líneas con ERROR         : %.2f%%%n", porcentajeErrores);
                System.out.printf("%% Líneas con WARNING       : %.2f%%%n", porcentajeWarnings);
            }

        } catch (IOException e) {
            // En caso de error al leer el log, mostramos y registramos el fallo
            System.err.println("❌ Ocurrió un error al procesar el archivo de logs:");
            e.printStackTrace();

            String mensajeError = "Error al procesar 'errores.log': " +
                    e.getMessage() +
                    System.lineSeparator();

            // Intentamos escribir el mensaje en el archivo de registro de fallos
            try (BufferedWriter writer = Files.newBufferedWriter(archivoRegistroFallos)) {
                writer.write(mensajeError);
                System.err.println("✅ Mensaje de fallo registrado en 'registro_fallos.txt'.");
            } catch (IOException ex) {
                System.err.println("⚠️ No se pudo escribir en 'registro_fallos.txt': " + ex.getMessage());
            }
        }
    }
}
