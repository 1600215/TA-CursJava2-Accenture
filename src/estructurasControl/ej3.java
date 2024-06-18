package estructurasControl;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        boolean incorrecto = true;

        do {
            System.out.println("Introduce num");
            num = teclado.nextInt();

            if (num > 0) {
                System.out.println("Num correcto");
                incorrecto = false;
            } else {
                System.out.println("Num incorrecto");
            }
        } while (incorrecto);
    }
}
