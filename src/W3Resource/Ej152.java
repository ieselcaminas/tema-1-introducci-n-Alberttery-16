package W3Resource;

import java.util.Scanner;

public class Ej152 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Dime el primer numero: ");
        int num1 = in.nextInt();
        System.out.println("Dime el segundo numero: ");
        int num2 = in.nextInt();
        System.out.println("Dime el tercer numero: ");
        int num3 = in.nextInt();
        System.out.println("dime el cuarto numero: ");
        int num4 = in.nextInt();


        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("Los numeros son iguales.");
        } else {
            System.out.println("Los numeros no son iguales");
        }
    }
}
