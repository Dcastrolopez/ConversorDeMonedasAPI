package mConversorAPI;

import mConversorAPI.gui.ConversorAPP;

public class Main {

    public static void main(String[] args) {
        ConversorAPP conversor = new ConversorAPP();
        conversor.setVisible(true);
        APIexchange.obtenerTasaDeCambios();
//        Conversiones.convertirMonedas();
    }
}
