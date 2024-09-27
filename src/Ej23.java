import java.util.Scanner;

public class Ej23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Positivos = 0;
        int numero;

        System.out.println("Introduce números (introduce 0 para terminar):");

        while (true) {
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero > 0) {
                Positivos++;
            }
        }

        System.out.println("Hay " + Positivos + " numeros positivos.");
    }
}
