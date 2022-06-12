import java.util.Scanner;
public class Ejercicio2v2 {
    public static void main(String[] args){
        Scanner ingre = new Scanner(System.in);
        System.out.println("Imtroduce un numero");
        int numero1 = ingre.nextInt();
        System.out.println("Introduce un numero");
        int numero2 = ingre.nextInt();

        System.out.println(numero1 + "+" + numero2 + "=" + numero1 + numero2);
        //Error operator-is undefined for the argument type
        //System.out.println(numero1 + "-" + numero2 + "=" + numero1 - numero2);
        System.out.println(numero1 + "/" + numero2 + "=" + numero1 / numero2);
        System.out.println(numero1 + "%" + numero2 + "=" + numero1 % numero2);
        ingre.close();
    }
}
