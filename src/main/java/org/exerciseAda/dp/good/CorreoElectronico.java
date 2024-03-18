package org.exerciseAda.dp.good;

public class CorreoElectronico implements Notificador {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando correo electrónico: ");
    }
}