https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png

# 🧠 Evaluación – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Carlos Felipe Gonzalez Cereceda
- **Sección:** Programación orientada a objetos
- **Carrera:** Técnico en Desarrollo de aplicaciones.
- **Sede:** Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la evaluación de la asignatura Desarrollo Orientado a Objetos I.

Se desarrolló un sistema en Java que simula una agencia de turismo, permitiendo modelar distintas entidades relacionadas con personas, como clientes y empleados.

El sistema aplica principios fundamentales de la Programación Orientada a Objetos (POO), tales como:

- ✅ Encapsulamiento (uso de atributos privados y métodos getters/setters)
- ✅ Herencia (la clase Empleado hereda de Persona)
- ✅ Composición (la clase Persona contiene un objeto Direccion)

El objetivo principal es representar de manera estructurada la información de las personas vinculadas a la agencia, mejorando la organización y reutilización del código.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── app/
│   └── Main.java        # Clase principal que ejecuta el programa
└── model/
    ├── Persona.java     # Clase base
    ├── Empleado.java    # Clase que hereda de Persona
    └── Direccion.java   # Clase utilizada en composición
