package introJava;
import java.util.Scanner;

public class Ej12 {
    public static void main(String args[]) {
        int x;
        int y;

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce los valores:");
        x = inputValue.nextInt();
        y = inputValue.nextInt();

        if (x > y) {

            System.out.println(x);

        }else{

            System.out.println(y);
        }
    }
}
