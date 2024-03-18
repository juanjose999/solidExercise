package org.exerciseAda.dp.good;

import org.exerciseAda.dp.bad.CorreoElectronico;

public class Pedido {
    private Notificador notificador;

    public Pedido(Notificador notificador) {
        // La dependencia se inyecta desde fuera de la clase
        this.notificador = notificador;
    }

    public void realizarPedido() {
        notificador.enviarNotificacion("Se ha realizado un nuevo pedido");
        if (notificador instanceof CorreoElectronico) {
            ((CorreoElectronico) notificador).enviarCorreo("hola");
        }
    }
}
