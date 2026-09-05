public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, double salario, int horasTrabajadas, double valorHora) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }
    @Override
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }

}
