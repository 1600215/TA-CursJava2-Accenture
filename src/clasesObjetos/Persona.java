package clasesObjetos;

public class Persona implements Comparable<Persona> {
    private String name;
    private String apellido1;
    private String apellido2;
    private String DNI;
    private int edad;

    public Persona() {

    }

    public Persona(Persona p) {
        this.name = p.name;
        this.apellido1 = p.apellido1;
        this.apellido2 = p.apellido2;
        this.DNI = p.DNI;
        this.edad = p.edad;
    }

    public Persona(String name, String apellido1, String apellido2, String dni, int edad) {
        this.name = name;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.DNI = dni;
        this.edad = edad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setDni(String dni) {
        this.DNI = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getName() {
        return this.name;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public String getDni() {
        return this.DNI;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + name + ", primerApellido=" + apellido1 + ", segundoApellido=" + apellido2 + ", DNI="
                + DNI + ", edad=" + edad + "]";
    }

    public boolean equals(Persona p) {
        return this.DNI == p.getDni();
    }

    @Override
    public int compareTo(Persona persona) {
        return this.edad - persona.edad;
    }
}
