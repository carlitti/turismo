package app;

import model.*;

/**
 * Clase principal para ejecutar el sistema.
 */
public class Main {

    /**
     * Método principal que ejecuta el sistema
     */
    public static void main(String[] args) {

        // Crear direcciones
        Direccion dir1 = new Direccion("Los Lagos 123", "Llanquihue", "Los Lagos");
        Direccion dir2 = new Direccion("Av. del Mar 456", "Puerto Varas", "Los Lagos");
        Direccion dir3 = new Direccion("Ruta 5 Sur Km 10", "Frutillar", "Los Lagos");

        // Crear personas
        Persona persona1 = new Persona("Carlos Gonzalez", 25, dir1);
        Persona persona2 = new Persona("Maria Perez", 30, dir2);

        // Crear empleado (herencia)
        Empleado empleado1 = new Empleado("Juan Lopez", 35, dir3, "Guía Turístico", 800000);

        // Mostrar datos
        System.out.println("=== PERSONAS ===");
        System.out.println(persona1);
        System.out.println(persona2);

        System.out.println("\n=== EMPLEADO ===");
        System.out.println(empleado1);

        // Demostración de composición
        System.out.println("\n=== DIRECCIÓN DEL EMPLEADO ===");
        System.out.println(empleado1.getDireccion());
    }
}