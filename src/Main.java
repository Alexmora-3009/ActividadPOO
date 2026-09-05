import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ==============================
        // EJERCICIO 1 - PERSONAS
        // ==============================

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Carlos", 25, "1001234567"));
        personas.add(new Persona("Laura", 17, "1002345678"));
        personas.add(new Persona("Andres", 21, "1003456789"));
        personas.add(new Persona("Valentina", 16, "1004567890"));
        personas.add(new Persona("Miguel", 30, "1005678901"));
        personas.add(new Persona("Sofia", 19, "1006789012"));
        personas.add(new Persona("Daniel", 15, "1007890123"));
        personas.add(new Persona("Camila", 24, "1008901234"));
        personas.add(new Persona("Juan", 18, "1009012345"));
        personas.add(new Persona("Mariana", 28, "1010123456"));

        for (Persona persona : personas) {

            if (persona.esMayorDeEdad()) {
                System.out.println("Nombre: " + persona.getNombre()
                        + " - Es mayor de edad");
            } else {
                System.out.println("Nombre: " + persona.getNombre()
                        + " - No es mayor de edad");
            }
        }


        // ==============================
        // EJERCICIO 2 - EMPLEADOS
        // ==============================

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoTiempoCompleto(
                "Carlos", 2000000, 300000));

        empleados.add(new EmpleadoPorHoras(
                "Laura", 0, 40, 15000));

        empleados.add(new EmpleadoTiempoCompleto(
                "Andres", 2500000, 400000));

        empleados.add(new EmpleadoPorHoras(
                "Valentina", 0, 35, 14000));

        empleados.add(new EmpleadoTiempoCompleto(
                "Miguel", 1800000, 250000));

        empleados.add(new EmpleadoPorHoras(
                "Sofia", 0, 48, 15000));

        empleados.add(new EmpleadoTiempoCompleto(
                "Daniel", 2200000, 350000));

        empleados.add(new EmpleadoPorHoras(
                "Camila", 0, 36, 15000));

        empleados.add(new EmpleadoTiempoCompleto(
                "Juan", 1900000, 350000));

        empleados.add(new EmpleadoPorHoras(
                "Mariana", 0, 40, 15500));


        for (Empleado empleado : empleados) {

            System.out.println("Empleado: " + empleado.getNombre()
                    + " - Salario: " + empleado.calcularSalario());
        }


        // ==============================
        // EJERCICIO 3 - CALCULADORA
        // ==============================

        Calculadora calculadora = new Calculadora();

        double resultadoSuma = calculadora.sumar(20, 30);
        calculadora.mostrarResultado("Suma", resultadoSuma);

        double resultadoResta = calculadora.restar(50, 20);
        calculadora.mostrarResultado("Resta", resultadoResta);

        double resultadoMultiplicacion = calculadora.multiplicar(10, 5);
        calculadora.mostrarResultado("Multiplicación", resultadoMultiplicacion);

        double resultadoDivision = calculadora.dividir(100, 4);
        calculadora.mostrarResultado("División", resultadoDivision);
    }
}
