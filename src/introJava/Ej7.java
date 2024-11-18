package introJava;
import java.util.Scanner;

public class Ej7 {
    public static void main(String args[]) {
        double precio;
        double precio_rebajado;
        double descuento;

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce el precio real:");
        precio = inputValue.nextDouble();

        System.out.println("Introduce el precio rebajado:");
        precio_rebajado = inputValue.nextDouble();
        descuento = (precio - precio_rebajado)/precio * 100;

        System.out.println("EL descuento es:" + descuento + "%");
        descuento = inputValue.nextDouble();

    }
}
