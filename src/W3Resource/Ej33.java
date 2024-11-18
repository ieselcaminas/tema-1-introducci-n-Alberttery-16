package W3Resource;
import java.util.Scanner;

public class Ej33 {
    public static void main(String[] args) {

        int suma = 0;
        long num;
        long digito;

        Scanner scanner = new Scanner(System.in);

        System.out.print("pon una integral ");
        num = scanner.nextInt();

        do {
            digito = num % 10;
            suma += digito;
            num = num / 10;
        } while (num > 0);
        System.out.println(suma);
    }
}
