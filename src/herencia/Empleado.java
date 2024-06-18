package herencia;

import clasesObjetos.Persona;

public class Empleado extends Persona {
    private int antiguedad;
    private double salario;
    private String puesto;

    public Empleado() {

    }

    public int getAntiguedad() {
        return this.antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void actualizarSalario(double incremento) {
        salario = salario + incremento;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                " antiguedad='" + getAntiguedad() + "'" +
                ", salario='" + getSalario() + "'" +
                ", puesto='" + getPuesto() + "'" +
                "}";
    }

}
