import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {

    public static void main(String[] args) {
            // ✅ Paso 1: Definir la carpeta de configuración y el archivo
            Path carpetaConfig = Paths.get("config");                          // Ruta relativa a ./config
            Path archivoParametros = carpetaConfig.resolve("parametros.txt");  // ./config/parametros.txt

        // ✅ Paso 3: Preparar el contenido de parámetros de simulación
        String parametros =
                "Tiempo de ciclo: 55.8 segundos\n" +
                        "Velocidad de línea: 1.2 m/s\n" +
                        "Número de estaciones: 8\n";

        try{
            // ✅ Paso 2: Crear la carpeta si no existe
            if (Files.notExists(carpetaConfig)) {
                Files.createDirectories(carpetaConfig);
                System.out.println("📁 Carpeta 'config/' creada.");
            }

            // ✅ Paso 4: Escribir el contenido en el archivo (crea o sobrescribe)
            Files.write( archivoParametros, parametros.getBytes());
            System.out.println("✏️ Archivo 'parametros.txt' escrito correctamente.");

            // ✅ Paso 5: Verificar que el archivo existe
            if (Files.exists(archivoParametros)) {
                System.out.println("✅ Archivo 'parametros.txt' existe en: " + archivoParametros);
            } else {
                System.out.println("⚠️ No se detectó 'parametros.txt' en la carpeta 'config/'.");
                return;
            }

            // ✅ Paso 6: Leer el contenido del archivo y mostrarlo
            String contenidoLeido = Files.readString(archivoParametros);
            System.out.println("\n📄 Contenido del archivo:");
            System.out.println(contenidoLeido);

        } catch (IOException e) {
            // Manejo de errores de E/S
            System.err.println("❌ Ocurrió un error al procesar el archivo de configuración:");
            e.getMessage();
        }
    }
}
