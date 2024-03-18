package org.exerciseAda.oc.good;

import org.exerciseAda.oc.bad.TipoVehiculo;

public class Bicicleta implements Vehiculo{
    @Override
    public void imprimirTipoVehiculo() {
        System.out.println("Vehiculo Tipo bicicleta");
    }
}
