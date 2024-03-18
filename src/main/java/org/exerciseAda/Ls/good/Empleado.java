package org.exerciseAda.Ls.good;

public class Empleado {
    String nombre;
    double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double getSalario() {
        return salarioBase;
    }
}
