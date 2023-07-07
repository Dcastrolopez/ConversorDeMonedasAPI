package mConversorAPI;

import javax.swing.JOptionPane;
import mConversorAPI.InvalidInputException;;

public class Conversiones {
	public static double monto;

	public static void convertirMonedas() throws InvalidInputException {

		// Tipo de cambios
		Object[] monedas = { "De Dólares a Colones", "De Dólares a Euros", "De Dólares a Libras", "De Dólares a Yen",
				"De Dólares a Won Coreano", "De Dólares a Pesos Méxicanos", "De Dólares a Soles" };

		String monedaSeleccionada = (String) JOptionPane.showInputDialog(null,
				"Elija la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null,
				monedas, monedas[0]);
		if (monedaSeleccionada != null) {
			JOptionPane.showMessageDialog(null, "Has seleccionado " + monedaSeleccionada);
		}
		// Obtener monto inicial
		String montoString = JOptionPane.showInputDialog(null, "Ingrese el monto:");

		try {
			monto = Double.parseDouble(montoString); // Asignar el valor a la variable estática
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Asegúrate de haber ingresado únicamente números");
			throw new InvalidInputException("Caracteres invalidos");
		}

		if (montoString != null) {
			JOptionPane.showMessageDialog(null, "El monto introducido es: " + monto);
		}
	}
}
