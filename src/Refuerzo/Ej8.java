package Refuerzo;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        int num1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un numero entero");

        num1 = scan.nextInt();

        if (num1 % 2 == 0 || num1 % 3 == 0) {
            System.out.println("El numero " + num1 + " es multiplo de 2 y 3");
        } else {
            System.out.println("El numero " + num1 + " NO es multiplo de 2 y 3");
        }

        if (num1 % 2 == 0) {
            System.out.println("El numero " + num1 + " es multiplo de 2");
        } else {
            System.out.println("El numero " + num1 + " NO es multiplo de 2");
        }

        if (num1 % 3 == 0) {
            System.out.println("El numero " + num1 + " es multiplo de  3");
        } else {
            System.out.println("El numero " + num1 + " NO es multiplo de 3");
        }
    }
}
