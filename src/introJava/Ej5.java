package introJava;
import java.util.Scanner;

public class Ej5 {
    public static void main (String argv[]) {
        int x;
        int y;
        int suma;
        int resta;
        int mult;
        int div;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce el numero 1:");
        x = inputValue.nextInt();

        System.out.println("Introduce el numero 2:");
        y = inputValue.nextInt();

        suma = x + y;
        System.out.println("La suma es " + suma);

        resta = x - y;
        System.out.println("La resta es " + resta);

        mult = x * y;
        System.out.println("La multiplicacion es " + mult);

        div = x / y;
        System.out.println("La division es " + div);

    }
}
