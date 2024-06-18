package clasesObjetos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListadoPersonas {

    public static void main(String[] args) {

        Persona p1 = new Persona("Alex", "Muñoz", "Velasco", "494921F", 24);
        Persona p2 = new Persona("Ana", "Gil", "Gil", "564566V", 28);
        Persona p3 = new Persona("Eric", "Palazon", "Torres", "654543J", 21);
        Persona p4 = new Persona("Sara", "Marin", "Paprika", "654321B", 22);

        List<Persona> listadoPersonas = new ArrayList<Persona>(); // Coleccion

        listadoPersonas.add(p1);
        listadoPersonas.add(p2);
        listadoPersonas.add(p3);
        listadoPersonas.add(p4);

        for (Persona persona : listadoPersonas) {
            System.out.println(persona);
        }

        Collections.sort(listadoPersonas);

        for (Persona persona : listadoPersonas) {
            System.out.println(persona);
        }
    }
}
