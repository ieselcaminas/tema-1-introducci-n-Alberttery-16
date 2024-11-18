package Refuerzo;
import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Dime un numero:");
        numero = sc.nextInt();

        if (numero % 2 != 0) {
            numero++;
        }
        System.out.println("Los 5 primeros números pares a partir de " + numero + " son:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numero);
            numero += 2; // Incrementar en 2 para obtener el siguiente número par
        }
    }

}
