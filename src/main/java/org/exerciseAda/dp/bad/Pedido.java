package org.exerciseAda.dp.bad;

public class Pedido {
    private CorreoElectronico correo;

    public Pedido() {
        // Aquí se crea una instancia lo cual es un mala practica
        this.correo = new CorreoElectronico();
    }

    public void realizarPedido() {
        correo.enviarCorreo("Se ha realizado un nuevo pedido");
    }
}
