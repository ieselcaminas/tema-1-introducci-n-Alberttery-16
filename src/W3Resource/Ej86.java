package W3Resource;

import java.util.Scanner;

public class Ej86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num = sc.nextInt();

        do{
            if (num % 2 == 0){
                num /= 2;
            } else {
                num *= 3;
                num++;
            }
        }while(num != 1);
        System.out.println(num);
    }
}
