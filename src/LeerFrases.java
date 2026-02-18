import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFrases {
    public static void main(String[] args) {
        String nombreArchivo = "frases.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido del fichero: ");

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            System.out.println("-------------------------------");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}