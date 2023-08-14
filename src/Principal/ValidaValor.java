package Principal;

import javax.swing.JOptionPane;

public class ValidaValor {
	
	
	public static void validaSecuencia (String valor) {
		
		while (valor != null && !Principal.ValidaValor.tryParseDouble(valor)) {
			
			valor = JOptionPane.showInputDialog(null, "Solo se aceptan números:", "Valor numerico",
		            JOptionPane.ERROR_MESSAGE);
	//Sustituir por anuncio
		}
	
		if (valor == null) {
		    JOptionPane.showMessageDialog(null, "Programa terminado");
		    System.exit(0); 
		}
		
	}
	
    public static boolean tryParseDouble(String valor) {
       
        if (valor == null || valor.isEmpty()) {
            return false;
        }

        
        for (char c : valor.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        try {
            Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
