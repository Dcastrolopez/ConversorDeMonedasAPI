package mConversorAPI;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

class APIexchange {

	static double usdToCrcRate;
	static double usdToEurRate;
	static double usdToGBPRate;
	static double usdToJPYRate;
	static double usdToMXNRate;
	static double usdToPENRate;
	static double usdToKRWRate;

	public static void main(String[] args) {
		obtenerTasaDeCambios();
	}
	private static final String[] monedas = { "CRC", "EUR", "GBP", "JPY", "MXN", "PEN", "KRW" };
	private static final String API_URL = "https://openexchangerates.org/api/latest.json?app_id=78c191b2a32546f6a2852884ed467f6e";
	public static void obtenerTasaDeCambios() {

		try {
			URL url = new URL(API_URL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();

			int responseCode = conn.getResponseCode();
			if (responseCode != 200) {
				throw new RuntimeException("Ocurrió un error: " + responseCode);
			} else {
				StringBuilder informationString = new StringBuilder();
				try (Scanner scanner = new Scanner(url.openStream())) {
					while (scanner.hasNext()) {
						informationString.append(scanner.nextLine());
					}
				}

				JSONObject jsonObject = new JSONObject(informationString.toString());

				// Obtener las tasas de cambio
				JSONObject rates = jsonObject.getJSONObject("rates");
				// Definir monedas y tasas correspondientes
				System.out.println();

				double[] tasas = new double[monedas.length];

				for (int i = 0; i < monedas.length; i++) {
					tasas[i] = rates.getDouble(monedas[i]);
				}
				
				// Asignar las tasas de cambio a variables individuales
				usdToCrcRate = tasas[0];
				usdToEurRate = tasas[1];
				usdToGBPRate = tasas[2];
				usdToJPYRate = tasas[3];
				usdToMXNRate = tasas[4];
				usdToPENRate = tasas[5];
				usdToKRWRate = tasas[6];

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
