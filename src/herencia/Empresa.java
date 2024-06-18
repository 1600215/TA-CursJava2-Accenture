package herencia;

public class Empresa {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();

        empleado.setName("Ramón");
        empleado.setApellido1("Pérez");
        empleado.setApellido2("Carvajal");
        empleado.setDni("494949V");
        empleado.setEdad(24);
        empleado.setAntiguedad(20);
        empleado.setPuesto("Jefe");
        empleado.setSalario(1800);

        System.out.println(empleado);

        empleado.actualizarSalario(150);

        System.out.println(empleado);
    }
}
