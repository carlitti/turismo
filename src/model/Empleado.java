package model;

/**
 * Clase que representa un empleado de la agencia.
 * Hereda de Persona.
 */
public class Empleado extends Persona {

    private String cargo;
    private double sueldo;

    /**
     * Constructor de Empleado.
     *
     * @param nombre nombre del empleado
     * @param edad edad
     * @param direccion dirección
     * @param cargo cargo laboral
     * @param sueldo sueldo del empleado
     */
    public Empleado(String nombre, int edad, Direccion direccion, String cargo, double sueldo) {
        super(nombre, edad, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    /**
     * @return cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo nuevo cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo nuevo sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Representación del empleado en texto
     */
    @Override
    public String toString() {
        return super.toString()
                + ", Cargo: " + cargo
                + ", Sueldo: $" + sueldo;
    }
}
