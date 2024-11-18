package introJava;
import java.util.Scanner;

public class Ej8 {
    public static void main(String args[]) {
        int edad;

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        edad = inputValue.nextInt();

        if (edad >=18) {

            System.out.println("Eres mayor de edad.");

        }else{

            System.out.println("No eres mayor de edad.");
        }

    }
}
