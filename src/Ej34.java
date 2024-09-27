import java.util.Scanner;

public class Ej34 {
    public static void main(String[] args) {
        System.out.println("Dime dos numeros: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int total = 0;

        for (int i = 1;
             i <= n2;
             i++) {
            total = total - n1;
        }
        System.out.println(total);
    }
}
