import java.util.ArrayList;
import java.util.List;

public class Ejercicio_4 {
    
    public static void main(String[] args){
        ArrayList<String> estudiantes=new ArrayList<>();
        estudiantes.add("Pilar");
        estudiantes.add("Nohelia");
        estudiantes.add("Soffy");
        estudiantes.add("Alison");
        estudiantes.add("Alejandra");
        estudiantes.add("Rossana");
        estudiantes.add("Gaby");
        estudiantes.add("Enrique");
        estudiantes.add("Jose");
        estudiantes.add("Mauro");
        estudiantes.add("Braian");
        estudiantes.add("Elvio");
        estudiantes.add("Estefania");
        estudiantes.add("Arianna");
        estudiantes.add("Marita");
        

        List<String> curso1 = estudiantes.subList(0,5);
        List<String> curso2 = estudiantes.subList(5,10);
        List<String> curso3 = estudiantes.subList(10,15);

        System.out.println("---------");
        System.out.println("CURSO 1:");
        for (String lista: curso1){
            System.out.println(lista);
        }
        System.out.println("---------");
        System.out.println("CURSO 2:");
        for (String lista:curso2){
            System.out.println(lista);
        }
        System.out.println("---------");
        System.out.println("CURSO 3:");
        for (String lista:curso3){
            System.out.println(lista);
        }
    }
}
