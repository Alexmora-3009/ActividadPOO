public class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public double calcularSalario() {
        return salario;
    }
    public double getSalario() {
        return salario;
    }
    public String getNombre() {
        return nombre;
    }
}
