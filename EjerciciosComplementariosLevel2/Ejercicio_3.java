import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio_3 {
    public static void main(String[] args){
        ArrayList<String> cartas = new ArrayList<>();
        for (int i =0; i<13;i++){
            cartas.add("cartas"+(i+1));
        }
        System.out.println("---------");
        System.out.println("ORDENADO");
        for (String lista: cartas){
            System.out.println(lista);
        }
        Collections.reverse(cartas);
        System.out.println("---------");
        System.out.println("ORDEN INVERSO");
        for (String lista: cartas){
            System.out.println(lista);
        }
        Collections.shuffle(cartas);
        System.out.println("---------");
        System.out.println("ALEATORIO");
        for(String lista:cartas){
            System.out.println(lista);
        }
    }
}

