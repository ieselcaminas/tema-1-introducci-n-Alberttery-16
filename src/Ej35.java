import java.util.Scanner;

public class Ej35 {
    public static void main(String[] args) {
        System.out.println("Dime dos numeros: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int total = 0;

       do {
           n1 = n1 - n2;
       } while (n1 >= n2); {

       }
        total = total - n1;
        System.out.println(total);
    }
}