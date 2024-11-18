package Refuerzo;
import java.util.Scanner;

public class Ej5 {
    public static void main(String args[]) {

        int numero1;
        int numero2;
        int producto;

        System.out.println("Escribe un numero entero");

        Scanner scan = new Scanner(System.in);

        numero1 = scan.nextInt();

        if (numero1 ==0) {
            System.out.println("El producto de 0 por cualaquier numero es 0");

        } else {
            System.out.println("Dame un segundo numero");
        }
        numero2 = scan.nextInt();

        producto=numero1 * numero2;
        System.out.println("El producto de ambos números és " + producto );

    }
}
