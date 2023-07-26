package mConversorAPI;

import mConversorAPI.gui.ConversorDeDólares;

public class Main {

    public static void main(String[] args) {
        try {
            APIexchange.obtenerTasaDeCambios();
            ConversorDeDólares conversor = new ConversorDeDólares();
            conversor.setVisible(true);

        } catch (Exception e) {
            System.err.println("Ocurrió un error al iniciar la aplicación: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
