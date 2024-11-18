package Refuerzo;
import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {

        int hojas;

        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCCE LAS HOJAS");
        hojas = scanner.nextInt();

        if (hojas < 3) {
            System.out.println("Imposible");
        } else {
            System.out.println(hojas / 4);
        }
    }
}
