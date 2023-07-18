package mConversorAPI;

import java.text.DecimalFormat;

import javax.swing.JTextArea;

import mConversorAPI.gui.ConversorAPP;

public class Conversiones {

	 private static String formatearMonto(double monto) {
	        DecimalFormat df = new DecimalFormat("#,##0.00");
	        return df.format(monto);
	    }
	
	public static void convertirUsdToPEN(JTextArea textArea) {
		double conversion = ConversorAPP.monto * APIexchange.usdToPENRate;
		double montoRedondeado = Math.round(conversion * 100.0) / 100.0;
		 String montoFormateado = formatearMonto(montoRedondeado);
		   textArea.setText(montoFormateado);
	}

	public static void convertirUsdToKRW(JTextArea textArea) {
		double conversion = ConversorAPP.monto * APIexchange.usdToKRWRate;
		double montoRedondeado = Math.round(conversion * 100.0) / 100.0;
		 String montoFormateado = formatearMonto(montoRedondeado);
		 textArea.setText(montoFormateado);
	}

	public static void convertirUsdToMXN(JTextArea textArea) {
		double conversion = ConversorAPP.monto * APIexchange.usdToMXNRate;
		double montoRedondeado = Math.round(conversion * 100.0) / 100.0;
		 String montoFormateado = formatearMonto(montoRedondeado);
		  textArea.setText(montoFormateado);
	}

	public static void convertirUsdToJPY(JTextArea textArea) {
		double conversion = ConversorAPP.monto * APIexchange.usdToJPYRate;
		double montoRedondeado = Math.round(conversion * 100.0) / 100.0;
		 String montoFormateado = formatearMonto(montoRedondeado);
		  textArea.setText(montoFormateado);
	}

	public static void convertirUsdToGBP(JTextArea textArea) {
		double conversion = ConversorAPP.monto * APIexchange.usdToGBPRate;
		double montoRedondeado = Math.round(conversion * 100.0) / 100.0;
		 String montoFormateado = formatearMonto(montoRedondeado);
		  textArea.setText(montoFormateado);
	}

	public static void convertirUsdToEur(JTextArea textArea) {
		double conversion = ConversorAPP.monto * APIexchange.usdToEurRate;
		double montoRedondeado = Math.round(conversion * 100.0) / 100.0;
		 String montoFormateado = formatearMonto(montoRedondeado);
		  textArea.setText(montoFormateado);
	}

	public static void convertirUsdToCrc(JTextArea textArea) {
		double conversion = ConversorAPP.monto * APIexchange.usdToCrcRate;
		double montoRedondeado = Math.round(conversion * 100.0) / 100.0;
		 String montoFormateado = formatearMonto(montoRedondeado);
		 textArea.setText(montoFormateado);
	}
}
