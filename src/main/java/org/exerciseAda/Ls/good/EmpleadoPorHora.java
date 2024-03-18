package org.exerciseAda.Ls.good;

public class EmpleadoPorHora extends Empleado {
    int horasTrabajadas;
    double salarioPorHora;

    public EmpleadoPorHora(String nombre, double salarioPorHora, int horasTrabajadas) {
        super(nombre, 0); // Salario base 0 para empleados por hora
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double getSalario() {
        return salarioPorHora * horasTrabajadas;
    }
}
