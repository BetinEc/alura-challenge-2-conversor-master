package MedidaConverter;

import javax.swing.JOptionPane;

public class Medida {


  public void MetrosAMillas(double valorRecibido) {
    double millas = (valorRecibido / 1609.344 );
    millas = (double) Math.round(millas * 100) / 100; // Redondea a 2 decimales

    JOptionPane.showMessageDialog(null, valorRecibido + " Metros = " + millas + " millas"); // Muestra valor convertido
  }

  public void MillasAMetros(double valorRecibido) {
    double metros = valorRecibido * 1609.344;
    metros = (double) Math.round(metros * 100) / 100;

    JOptionPane.showMessageDialog(null, valorRecibido + " Millas =" + metros + " metros");
  }
  
  public void KilometrosAMillas(double valorRecibido) {
	    double millas1 = valorRecibido / 1.609344;
	    millas1 = (double) Math.round(millas1 * 100) / 100;

	    JOptionPane.showMessageDialog(null, valorRecibido + " Kilometros =" + millas1 + " Millas");
	  }
  
  public void MillasAKilometros(double valorRecibido) {
	    double kilometros = valorRecibido * 1.609344;
	    kilometros = (double) Math.round(kilometros * 100) / 100;

	    JOptionPane.showMessageDialog(null, valorRecibido + " Millas =" + kilometros + " Kilometros");
	  }
}