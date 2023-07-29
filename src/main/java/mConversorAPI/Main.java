package mConversorAPI;
import mConversorAPI.gui.Principal;

public class Main {

    public static void main(String[] args) {
        try {
            APIexchange.obtenerTasaDeCambios();
            Principal principal = new Principal();
            principal.setVisible(true);

        } catch (Exception e) {
            System.err.println("Ocurrió un error al iniciar la aplicación: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
