package herencia;

public class Comercial extends Empleado {
    private double comision;

    public Comercial() {
    }

    public double getComision() {
        return this.comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public void calcularComisión(double incComisión) {
        comision = comision + incComisión;
    }

    public void calcularComisión(double incComisión, double plus) { // Sobrecarga
        comision = comision + incComisión + plus;
    }

    @Override
    public void actualizarSalario(double incremento) {
        double salarioActual = this.getSalario();

        if (this.getAntiguedad() <= 5) {
            calcularComisión(25.0);
        } else {
            calcularComisión(25.0, 100);
        }

        double nuevaComision = comision;
        this.setSalario(salarioActual + incremento + nuevaComision);
    }
}
