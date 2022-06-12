import java.util.*;
//Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking
public class Ejercicio_1 {
public static void main(String[] args) {
    Scanner entra1 = new Scanner(System.in);
    Scanner entra2 = new Scanner(System.in);

    ArrayList<String> ciudades  = new ArrayList<>();
    String ciudad;
    int resp = 1;
    while (resp == 1){
      System.out.println("Ingrese una ciudad: ");
      ciudad = entra1.nextLine();
      ciudades.add(ciudad);
      System.out.println("Desea agregar otra ciudad? 1-si 0-no");
      resp = entra2.nextInt();
    }
    for(int i = 0; i < ciudades.size(); i++){
      System.out.println("#" + (i+1) + " - " + ciudades.get(i));
    }
    entra1.close();
    entra2.close();
  }
}