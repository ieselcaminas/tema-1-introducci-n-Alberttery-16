package introJava;
import java.util.Scanner;

public class Ej14 {
    public static void main(String args[]) {
        int nota;

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce la nota entera:");
        nota = inputValue.nextInt();

        if ((nota < 0) || (nota > 10)) {
            System.out.println("Nota invalida");
        }else if (nota < 3) {
            System.out.println("Muy deficiente");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else if (nota <= 10) {
            System.out.println("Sobresaliente");
        }
    }
}