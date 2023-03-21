package MonedasConverter;

import javax.swing.JOptionPane;

public class FunctionMonedas {

	Monedas monedas = new Monedas();

	public void ConvertirMoneda(double ValorRecibido) {

		String opciones = (JOptionPane.showInputDialog(null, "Seleccione la moneda a convertir", "monedas ",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						"Dolar a Euro", "Euro a Dolar", "Dolar a Libra", "Libra a Dolar", "Dolar a Yen",
						"Yen a Dolar"  
				}, "Selección")).toString();

		switch (opciones) {
			case "Dolar a Euro":
			monedas.ConvertirDolarAEuro(ValorRecibido);
				break;
			case "Euro a Dolar":
				monedas.ConvertirEuroADolar(ValorRecibido);
				break;
			case "Dolar a Libra":
				monedas.ConvertirDolarALibra(ValorRecibido);
				break;
			case "Libra a Dolar":
				monedas.ConvertirLibraADolar(ValorRecibido);
				break;
			case "Dolar a Yen":
				monedas.ConvertirDolarAYen(ValorRecibido);
				break;
			case "Yen a Dolar":
				monedas.ConvertirYenADolar(ValorRecibido);
				break;
			default:
				break;
		}
	}
}