package W3Resource;
import java.util.Scanner;

public class Ej153 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Dime el primer numero: ");
        double n1 = in.nextDouble();
        System.out.print("Dime el segundo numero: ");
        double n2 = in.nextDouble();

        System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
    }
}

