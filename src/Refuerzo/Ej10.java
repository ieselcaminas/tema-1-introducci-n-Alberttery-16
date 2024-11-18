package Refuerzo;
import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        int num1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un numero entero");

        num1 = scan.nextInt();

        if (num1 % 2 == 0  && num1 % 3 == 0) {
            System.out.println("El numero " + num1 + " es multiplo de 2 y  3");
        }else{
            if (num1 % 2 != 0  && num1 % 3 != 0)
                System.out.println("El numero " + num1 + " NO ES MULTIPLO de 2 Y 3");
        }
    }
}
