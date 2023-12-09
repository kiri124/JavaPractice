import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerDatos {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                // Dividir la línea en partes usando la coma como separador
                String[] partes = linea.split(",");

                // Acceder a los datos
                String nombre = partes[0];
                int puntuacion = Integer.parseInt(partes[1]);

                // Puedes hacer algo con los datos, como mostrarlos en el juego
                System.out.println("Nombre: " + nombre + ", Puntuación: " + puntuacion);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
