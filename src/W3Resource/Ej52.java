package W3Resource;
import java.util.Scanner;

public class Ej52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();

        if(num1 + num2 == num3){
            System.out.println("El resultado es verdad.");
        }else{
            System.out.println("El resultado es falso.");
        }
    }

}
