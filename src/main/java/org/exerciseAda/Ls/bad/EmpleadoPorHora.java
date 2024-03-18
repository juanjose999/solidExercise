package org.exerciseAda.Ls.bad;

public class EmpleadoPorHora extends Empleado{
    int horasTrabajadas;

    public EmpleadoPorHora(String nombre, double salarioPorHora, int horasTrabajadas) {
        super(nombre,salarioPorHora);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double getSalario() {
        return salario * horasTrabajadas; // implementacion distinta al de la clase padre
    }
}
