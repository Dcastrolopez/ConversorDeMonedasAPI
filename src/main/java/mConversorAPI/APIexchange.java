package mConversorAPI;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import javax.swing.JOptionPane;

import org.json.JSONObject;

public class APIopenexchangerates {

	public static void main(String[] args) {
		obtenerTasaDeCambios();
	}

	public static void obtenerTasaDeCambios() {

		try {
			URL url = new URL("https://openexchangerates.org/api/latest.json?app_id=78c191b2a32546f6a2852884ed467f6e");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();

			int responseCode = conn.getResponseCode();
			if (responseCode != 200) {
				throw new RuntimeException("Ocurrió un error: " + responseCode);
			} else {
				StringBuilder informationString = new StringBuilder();
				Scanner scanner = new Scanner(url.openStream());

				while (scanner.hasNext()) {
					informationString.append(scanner.nextLine());
				}

				scanner.close();

				JSONObject jsonObject = new JSONObject(informationString.toString());
				System.out.println(jsonObject);
				
				// Obtener las tasas de cambio
				JSONObject rates = jsonObject.getJSONObject("rates");

				// Definir monedas y tasas correspondientes
				String[] monedas = { "CRC", "EUR", "GBP", "JPY", "MXN", "PEN", "KRW" };
				double[] tasas = new double[monedas.length];

				for (int i = 0; i < monedas.length; i++) {
					tasas[i] = rates.getDouble(monedas[i]);
				}

				// Asignar las tasas de cambio a variables individuales
				double usdToCrcRate = tasas[0];
				double usdToEurRate = tasas[1];
				double usdToGBPRate = tasas[2];
				double usdToJPYRate = tasas[3];
				double usdToMXNRate = tasas[4];
				double usdToPENRate = tasas[5];
				double usdToKRWRate = tasas[6];

				System.out.println(usdToCrcRate);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
