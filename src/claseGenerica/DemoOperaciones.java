package claseGenerica;

public class DemoOperaciones {
    public static void main(String[] args) {
        Operaciones<Integer> opI = new Operaciones<Integer>();

        int numInt = 5;

        System.out.println("La suma es " + opI.suma(numInt));
        System.out.println("La resta es " + opI.resta(numInt));
        System.out.println("El producto es " + opI.producto(numInt));
        System.out.println("La division es " + opI.division(numInt));

        Operaciones<Double> opD = new Operaciones<Double>();

        double numDouble = 12.34;

        System.out.println("La suma es " + opD.suma(numDouble));
        System.out.println("La resta es " + opD.resta(numDouble));
        System.out.println("El producto es " + opD.producto(numDouble));
        System.out.println("La division es " + opD.division(numDouble));
    }
}
