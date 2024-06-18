package claseGenerica;

public class Operaciones<N extends Number> {
    double suma(N number) {
        return number.doubleValue() + 2;
    }

    double resta(N number) {
        return number.doubleValue() - 2;
    }

    double producto(N number) {
        return number.doubleValue() * 2;
    }

    double division(N number) {
        return number.doubleValue() / 2;
    }
}
