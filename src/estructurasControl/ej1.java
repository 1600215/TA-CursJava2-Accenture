package estructurasControl;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("introduce un numero: ");
        num = teclado.nextInt();

        if (num % 5 == 0) {
            System.out.println("Multiplo de 5");
        } else {
            System.out.println("NO multiplo de 5");
        }
    }
}
