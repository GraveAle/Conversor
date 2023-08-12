package Principal;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        do {
            Object[] menuConversion = { "Conversor de moneda", "Conversor de temperatura" };

            Object seleccionarConversion = JOptionPane.showInputDialog(null,
                    "Seleccione una opcion de conversión", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    menuConversion, menuConversion[0]);

            if (seleccionarConversion != null) {
                if (seleccionarConversion.equals("Conversor de moneda")) {
                    Monedas.ConversorMoneda.convierteMoneda();
                } else if (seleccionarConversion.equals("Conversor de temperatura")) {
                    System.out.println("Codigo para convertir temperatura");
                }
            } else {
                break;
            }

        } while (Principal.ContinuaPrograma.deseaContinuar());
        
        JOptionPane.showMessageDialog(null, "Programa terminado");
    }
    
}

