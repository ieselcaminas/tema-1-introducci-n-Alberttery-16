package introJava;
import java.util.Scanner;

public class Ej10 {
    public static void main(String args[]) {
        int x;

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce el valor:");
        x = inputValue.nextInt();

        if (x >=0) {

            System.out.println("Es positivo.");

        }else{

            System.out.println("No es positivo.");
        }
    }
}
