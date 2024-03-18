package org.exerciseAda.oc.good;

import org.exerciseAda.sr.good.Dividir;
import org.exerciseAda.sr.good.Multiplicar;
import org.exerciseAda.sr.good.Restar;
import org.exerciseAda.sr.good.Sumar;

public class VehiculosPrint {

    private Motocicleta motocicleta;
    private Carro carro;
    private Bicicleta bicicleta;
    public VehiculosPrint(){
        this.carro = new Carro();
        this.bicicleta = new Bicicleta();
        this.motocicleta = new Motocicleta();
    }

}
