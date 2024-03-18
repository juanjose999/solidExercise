package org.exerciseAda.is.bad;

public class Trabajador1 implements Actividades {

    @Override
    public void programar() {
        System.out.println("la persona 1 esta programando.");
    }

    @Override
    public void cocinando() {
        System.out.println("la persona 1 no tiene pasion por cocinar.");
    }
}
