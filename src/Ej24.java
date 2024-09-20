import java.util.Scanner;

public class Ej24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaNotas = 0;
        int Notas = 0;
        boolean hayDiez = false;

        System.out.println("Introduce tus notas (introduce -1 para terminar):");

        while (true) {
            int nota = scanner.nextInt();

            if (nota == -1) {
                break;
            }

            if (nota >= 0 && nota <= 10) {
                sumaNotas += nota;
                Notas++;

                if (nota == 10) {
                    hayDiez = true;
                }
            } else {
                System.out.println("Por favor, introduce una nota válida (0-10).");
            }
        }

        if (Notas > 0) {
            double media = (double) sumaNotas / Notas;
            System.out.println("La nota media es: " + media);
            if (hayDiez) {
                System.out.println("Hay al menos un 10.");
            } else {
                System.out.println("No hay ningún 10.");
            }
        } else {
            System.out.println("No se introdujeron notas válidas.");
        }
    }
}
