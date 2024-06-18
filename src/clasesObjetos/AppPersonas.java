package clasesObjetos;

import java.util.Scanner;

public class AppPersonas {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        Persona individuo = new Persona();

        System.out.println("introduce un nombre");
        individuo.setName(consola.next());

        System.out.println("introduce un apellido 1");
        individuo.setApellido1(consola.next());

        System.out.println("introduce un apellido 2");
        individuo.setApellido2(consola.next());

        System.out.println("introduce un dni");
        individuo.setDni(consola.next());

        System.out.println("introduce una edad");
        individuo.setEdad(consola.nextInt());

        System.out.println(individuo);
    }
}
