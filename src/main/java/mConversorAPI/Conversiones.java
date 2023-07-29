package mConversorAPI;

import mConversorAPI.gui.ConversorDeDólares;

import javax.swing.*;
import java.text.DecimalFormat;

public class Conversiones {
	
	// Conversiones en dólares

	private static String formatearMonto(double monto) {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return df.format(monto);
	}

	private static void convertirUsdToMoneda(JTextArea textArea, double factorConversion) {
		double conversion = ConversorDeDólares.monto * factorConversion;
		double montoRedondeado = Math.round(conversion * 100.0) / 100.0;
		String montoFormateado = formatearMonto(montoRedondeado);
		textArea.setText(montoFormateado);
	}

	public static void convertirUsdToPEN(JTextArea textArea) {
		convertirUsdToMoneda(textArea, APIexchange.usdToPENRate);
	}

	public static void convertirUsdToKRW(JTextArea textArea) {
		convertirUsdToMoneda(textArea, APIexchange.usdToKRWRate);
	}

	public static void convertirUsdToMXN(JTextArea textArea) {
		convertirUsdToMoneda(textArea, APIexchange.usdToMXNRate);
	}

	public static void convertirUsdToJPY(JTextArea textArea) {
		convertirUsdToMoneda(textArea, APIexchange.usdToJPYRate);
	}

	public static void convertirUsdToGBP(JTextArea textArea) {
		convertirUsdToMoneda(textArea, APIexchange.usdToGBPRate);
	}

	public static void convertirUsdToEur(JTextArea textArea) {
		convertirUsdToMoneda(textArea, APIexchange.usdToEurRate);
	}

	public static void convertirUsdToCrc(JTextArea textArea) {
		convertirUsdToMoneda(textArea, APIexchange.usdToCrcRate);
	}
	
	// Conversiones en colones
	
//	public static void convertirCrcTOMoneda(double monto) {
//		double conversion = C
//	}
}
