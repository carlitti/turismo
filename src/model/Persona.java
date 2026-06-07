package model;

/**
 * Clase base que representa una persona.
 */
public class Persona {

    private String nombre;
    private int edad;
    private Direccion direccion; // composición

    /**
     * Constructor de Persona.
     *
     * @param nombre nombre de la persona
     * @param edad edad
     * @param direccion objeto Direccion
     */
    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad nueva edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return dirección
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * @param direccion nueva dirección
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Representación de la persona en texto
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Edad: " + edad +
                ", Dirección: " + direccion;
    }
}