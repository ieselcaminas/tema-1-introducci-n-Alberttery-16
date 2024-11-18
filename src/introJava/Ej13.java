package introJava;
import java.util.Scanner;

public class Ej13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int orden;

        System.out.print("Ingrese un numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese un numero: ");
        num2 = sc.nextInt();
        System.out.print("Ingresa 1 para que sea ascendente o 0 para descendente: ");
        orden = sc.nextInt();

        if (orden == 1) {
            if (num1 > num2) {
                System.out.println("Números ordenados en orden Ascendente: " + num2 + ", " + num1);
            } else {
                System.out.println("Números ordenados en orden Ascendente: " + num1 + ", " + num2);
            }

        }
        if (orden == 0) {
            if (num1 > num2) {
                System.out.println("Números ordenados en orden Descendente: " + num1 + ", " + num2);
            } else {
                System.out.println("Números ordenados en orden Descendente: " + num2 + ", " + num1);
            }
        }
    }
}
