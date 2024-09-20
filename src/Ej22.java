import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        int num;
        int positivos = 0;
        System.out.println("Introduzca 10 numeros");
        Scanner sc = new Scanner(System.in);
        for (int i = 0;
             i <= 10;
             i++){
            num = sc.nextInt();
            if (num > 0){
                positivos ++;
            }
        }
        System.out.println("Son positivos: " + positivos);
    }
}
