package introJava;
import java.util.Scanner;

public class Ej11 {
    public static void main(String args[]) {
        int x;
        int y;

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce los valores:");
        x = inputValue.nextInt();
        y = inputValue.nextInt();

        if (x < y) {

            System.out.println(x + " " + y);

        }else{

            System.out.println(y + " " + x);
        }
    }
}
