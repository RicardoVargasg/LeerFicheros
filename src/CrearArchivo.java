import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "frases.txt";

        String[] Frases = {
                "En un lugar de la Mancha",
                "de cuyo nombre no quiero acordarme,",
                "no ha mucho tiempo que vivía un hidalgo,",
                "de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredo."
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {

            for (String frase : Frases) {
                bw.write(frase);
                bw.newLine();
            }

            System.out.println("Archivo creado");

        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
}