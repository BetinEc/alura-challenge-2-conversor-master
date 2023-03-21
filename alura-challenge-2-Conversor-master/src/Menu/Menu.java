package Menu;

import javax.swing.JOptionPane;

import MedidaConverter.FuncionMedida;
import MonedasConverter.FunctionMonedas;
import TemperaturaConverter.FunctionTemperatura;
import TiempoConverter.FunctionTiempo;

public class Menu {

  public static void ejecutarMenu() {

    FunctionMonedas monedas = new FunctionMonedas();
    FunctionTiempo tiempo = new FunctionTiempo();
    FunctionTemperatura temperatura = new FunctionTemperatura();
    FuncionMedida medida = new FuncionMedida();

    try {
      String opciones;
      int menuSi = JOptionPane.YES_OPTION;

      do {
        opciones = (JOptionPane.showInputDialog(null, "Seleccione lo que desea convertir", "Menú ",
            JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Monedas", "Temperatura", "Tiempo","Medida" }, "Selección"))
            .toString();

        switch (opciones) {
          case "Monedas": {

         
            String input = JOptionPane.showInputDialog("Ingrese el valor de dinero a convertir");

            while (!esNumero(input)) {
              JOptionPane.showMessageDialog(null, "Ha ingresado un valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
              input = JOptionPane.showInputDialog(null, "Por favor ingrese el monto");
            }

            double valorRecibido = Double.parseDouble(input);
            monedas.ConvertirMoneda(valorRecibido);

            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
            System.out.println(seleccion);

          }
            break;

          case "Temperatura": {
            String input = JOptionPane.showInputDialog("Ingrese la Temperatura a convertir");
            while (!esNumero(input)) {
              JOptionPane.showMessageDialog(null, "Ha ingresado un valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
              input = JOptionPane.showInputDialog(null, "Por favor ingrese el valor");
            }

            double temperaturaRecibida = Double.parseDouble(input);
            temperatura.convertirTemperatura(temperaturaRecibida);

            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
            System.out.println(seleccion);
          }
            break;

          case "Tiempo": {
            String input = JOptionPane.showInputDialog("Ingrese el valor a convertir");
            while (!esNumero(input)) {
              JOptionPane.showMessageDialog(null, "Ha ingresado un valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
              input = JOptionPane.showInputDialog(null, "Por favor ingrese el valor");
            }

            double tiempoRecibido = Double.parseDouble(input);
            tiempo.convertirTiempo(tiempoRecibido);

            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
            System.out.println(seleccion);
          }
            break;
            
          case "Medida": {
              String input = JOptionPane.showInputDialog("Ingrese la medida a convertir");
              while (!esNumero(input)) {
                JOptionPane.showMessageDialog(null, "Ha ingresado un valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
                input = JOptionPane.showInputDialog(null, "Por favor ingrese el valor");
              }

              double medidaRecibido = Double.parseDouble(input);
              medida.convertirMedida(medidaRecibido);

              int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
              System.out.println(seleccion);
            }
              break;

          default:
            break;
        }
      } while (JOptionPane.YES_OPTION == menuSi);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "¡Vuelva pronto!");
    }
  }

 
  private static boolean esNumero(String num) {
    try {
      Double.parseDouble(num);
      return true;
    } catch (NumberFormatException nfe) {
      return false;
    }
  }
}
