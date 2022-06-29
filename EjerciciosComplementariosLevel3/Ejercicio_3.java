import java.util.Arrays;
import java.util.List;

public class Ejercicio_3 {
    public static void main(String[] args) {
    List<String> palabras = Arrays.asList("Batman","Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        Long count = palabras.stream()
                .filter(word -> word.startsWith("B") || word.startsWith("b"))
                .count();
        System.out.println(count);
    }
}