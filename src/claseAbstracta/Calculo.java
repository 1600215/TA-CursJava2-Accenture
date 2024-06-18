package claseAbstracta;

public class Calculo {
    private final static double LADO_CUADRADO = 2.0;

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();

        cuadrado.setLado(LADO_CUADRADO);

        System.out.println("El area del cuadrado es " + cuadrado.calcularArea());
        System.out.println("El perimetro del cuadrado es " + cuadrado.calcularPerimetro());
    }
}