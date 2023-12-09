import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class EscribirDatos {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt"))) {
            // Datos de ejemplo
            String nombre = "Jugador1";
            int puntuacion = 1000;

            // Escribir datos en el archivo
            writer.write(nombre + "," + puntuacion);
            writer.newLine();

            // Puedes agregar más datos de la misma manera
            // ...

            System.out.println("Datos escritos en el archivo correctamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
