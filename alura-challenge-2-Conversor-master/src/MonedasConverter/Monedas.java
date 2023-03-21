package MonedasConverter;

import javax.swing.JOptionPane;

public class Monedas {

	// DE DOLAR A EURO >

	public void ConvertirDolarAEuro(double valorRecibido) {
		double moneda = valorRecibido * 0.93300;

		moneda = (double) Math.round(moneda * 1000000) / 1000000.0; // 6 decimales

		JOptionPane.showMessageDialog(null, "Dolares " + valorRecibido + " = Euros " + moneda); // Muestra valor convertido
	}
	
	// DE EURO A DOLAR >
	
	public void ConvertirEuroADolar(double valorRecibido) {
		double moneda = valorRecibido / 0.93300;

		moneda = (double) Math.round(moneda * 1000000) / 1000000.0; // 6 decimales

		JOptionPane.showMessageDialog(null, "Euros" + valorRecibido + " = Dolares " + moneda); // Muestra valor convertido
	}
	
	// DE DOLAR A LIBRA >
	
	public void ConvertirDolarALibra(double valorRecibido) {
		double moneda = valorRecibido * 0.81466;

		moneda = (double) Math.round(moneda * 1000000) / 1000000.0; // 6 decimales

		JOptionPane.showMessageDialog(null, "Dolares" + valorRecibido + " = Libras " + moneda); // Muestra valor convertido
	}
	
	// DE LIBRA A DOLAR >
	
	public void ConvertirLibraADolar(double valorRecibido) {
		double moneda = valorRecibido / 0.81466;

		moneda = (double) Math.round(moneda * 1000000) / 1000000.0; // 6 decimales

		JOptionPane.showMessageDialog(null, "Libras" + valorRecibido + " = Dolares " + moneda); // Muestra valor convertido
	}
	
	// DE DOLAR A YEN >
	public void ConvertirDolarAYen(double valorRecibido) {
		double moneda = valorRecibido * 131.12500;

		moneda = (double) Math.round(moneda * 1000000) / 1000000.0; // 6 decimales

		JOptionPane.showMessageDialog(null, "Dolares" + valorRecibido + " = Yens " + moneda); // Muestra valor convertido
	}
	
	
	// DE YEN A DOLAR >
	
	public void ConvertirYenADolar(double valorRecibido) {
		double moneda = valorRecibido / 131.12500;

		moneda = (double) Math.round(moneda * 1000000) / 1000000.0; // 6 decimales

		JOptionPane.showMessageDialog(null, "Yens" + valorRecibido + " = Dolares " + moneda); // Muestra valor convertido
	}
}