package Temperatura;

import javax.swing.JOptionPane;

import Principal.ValidaValor;

public class ConversorTemperatura {
	
	public static void convierteTemperatura() {
		
		String valorTemperatura;
		Double temperaturaConvertida;
		
		valorTemperatura = JOptionPane.showInputDialog(null, "Introduzca la temperatura a convertir: ");
		
		ValidaValor.validaSecuencia(valorTemperatura);
		
		temperaturaConvertida = Double.valueOf(valorTemperatura);
		
		Object[] menuConversion = {	"Grados Celcius a Grados Fahrenheit",
									"Grados Celcius a Kelvin",
									"Grados Fahrenheit a Grados Celcius",
									"Grados Fahrenheit a Kelvin",
									"Kelvin a Grados Celcius",
									"Kelvin a Grados Fahrenheit"};

		 Object seleccionarConversion = JOptionPane.showInputDialog(null,
		             "Seleccione el tipo de conversión", "Monedas",
		             JOptionPane.INFORMATION_MESSAGE, null,
		             menuConversion, menuConversion[0]);
		 if ("Grados Celcius a Grados Fahrenheit".equals(seleccionarConversion)) {
			 
		 }
		 
	}
}
