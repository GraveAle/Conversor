package Monedas;

import javax.swing.JOptionPane;


public class ConversorMoneda {
	
	public static void convierteMoneda() {
		
		String valorMoneda;
		Double monedaConvertida;
		
		valorMoneda = JOptionPane.showInputDialog(null, "Introduzca la cantidad a convetir");
		
		while (!Principal.ValidaValor.tryParseDouble(valorMoneda)) {
			valorMoneda = JOptionPane.showInputDialog(null,"Solo se aceptan números: ", "Valor numerico", JOptionPane.ERROR_MESSAGE);			
		}
		
		monedaConvertida = Double.valueOf(valorMoneda);
		
		Object[] menuConversion = { "Convertir peso mxn a Dólar", 
									"Convertir peso mxn a Euros",
									"Convertir peso mxn a Libras Esterlinas",
									"Convertir peso mxn a Yen Japonés",
									"Convertir peso mxn a Won sul-coreano",
									"Convertir Dólar a pesos", 
									"Convertir Euros a pesos",
									"Convertir Libras Esterlinas a pesos",
									"Convertir Yen Japonés a pesos",
									"Convertir Won sul-coreano a pesos "};

		 Object seleccionarConversion = JOptionPane.showInputDialog(null,
		             "Seleccione el tipo de conversión", "Input",
		             JOptionPane.INFORMATION_MESSAGE, null,
		             menuConversion, menuConversion[0]);
		 
		 if ("Convertir peso mxn a Dólar".equals(seleccionarConversion)) {
			  Dolar dolar = new Dolar();
			  JOptionPane.showMessageDialog(null, dolar.convertirA(monedaConvertida));
		 }
	
	}
}
