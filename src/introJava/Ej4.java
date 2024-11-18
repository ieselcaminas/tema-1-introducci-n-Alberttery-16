package introJava;
import java.util.Scanner;

public class Ej4 {
    public static void main (String argv[]) {
        float lado;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce el lado:");
        lado = inputValue.nextFloat();

        System.out.println(lado * lado);
    }
}
