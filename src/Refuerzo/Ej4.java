package Refuerzo;
import java.util.Scanner;

public class Ej4 {
    public static void main(String args[]) {

        int numero1;
        int numero2;

        System.out.println("Escribe un numero entero que sea multiplo de 10");

        Scanner scan = new Scanner(System.in);

        numero1 = scan.nextInt();

        if (numero1 % 10 == 0) {

            System.out.println("El numero " + numero1 + " es multiplo de 10");

            System.out.println("Escribe un numero entero ");
            numero2 = scan.nextInt();

            if (numero2 % 10 == 0) {
                System.out.println("El numero " + numero2 + " es multiplo de 10");
            } else {
                System.out.println("No es multiplo de 10");
            }
        } else {
            System.out.println("No es multiplo de 10");
        }

    }
}
