package introJava;
import java.util.Scanner;

public class Ej25 {
    public static void main(String[] args) {

        long factorial = 1 ;
        int num ;

        Scanner scan = new Scanner(System.in);
        System.out.println("introduce un numero: ");
        num = scan.nextInt();


        for(int i = 1; i<= num; i++){

            factorial *= i ;

        }
        System.out.println("El factorial de " + num + " es " + factorial);

    }
}
