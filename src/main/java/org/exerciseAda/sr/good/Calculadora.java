package org.exerciseAda.sr.good;

public class Calculadora {
    private Sumar sumador;
    private Restar restar;
    private Multiplicar multiplicar;
    private Dividir dividir;

    public Calculadora(){
        this.sumador = new Sumar();
        this.restar = new Restar();
        this.multiplicar = new Multiplicar();
        this.dividir = new Dividir();
    }
    public double sumar(double a, double b) {
        return sumador.sumar(a,b);
    }

    public double restar(double a, double b) {
        return restar.restar(a, b);
    }

    public double multiplicar(double a, double b) {
        return multiplicar.multiplicar(a, b);
    }

    public double dividir(double a, double b) {
        return dividir.dividir(a, b);
    }
}
