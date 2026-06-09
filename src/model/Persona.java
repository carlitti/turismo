package model;

/**
 * Clase base que representa una persona.
 */
public class Persona {

    private String nombre;
    private int edad;
    private Direccion direccion;

    /**
     * Constructor de Persona.
     *
     * @param nombre nombre de la persona
     * @param edad edad
     * @param direccion dirección (composición)
     */
    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Edad: " + edad +
                ", Dirección: " + direccion;
    }
}