package MedidaConverter;

import javax.swing.JOptionPane;

public class FuncionMedida {

  Medida medida = new Medida();

  public void convertirMedida(double medidaRecibida) {
    String opciones = (JOptionPane.showInputDialog(null, "Seleccione el valor a convertir", "Medida",
        JOptionPane.PLAIN_MESSAGE, null, new Object[] {
            "Metros a Millas", "Millas a Metros","Kilometros a Millas", "Millas a Kilometros"
        }, "Selección")).toString();

    switch (opciones) {
      case "Metros a Millas":
        medida.MetrosAMillas(medidaRecibida);
        break;
      case "Millas a Metros":
        medida.MillasAMetros(medidaRecibida);
        break;
      case "Kilometros a Millas":
          medida.KilometrosAMillas(medidaRecibida);
          break;
      case "Millas a Kilometros":
          medida.MillasAKilometros(medidaRecibida);
          break;
        
      default:
        break;
    }
  }
}