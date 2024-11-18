package introJava;
import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {

        double precio;
        double descuento;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        precio = scan.nextDouble();

        if (precio < 6) {
            System.out.println("No hay descuento.");

        } else if (precio >= 6 && precio < 60) {
            descuento = precio * 0.5;
            System.out.println("Precio final= " + descuento  );

        } else if (precio >= 60 && precio > 60) {

            descuento = precio * 0.90  ;

            System.out.println("Precio final= " + descuento  );

        }
    }
}
