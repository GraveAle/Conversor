package Temperatura;

import javax.swing.JOptionPane;

import Principal.ValidaValor;

public class ConversorTemperatura {
	
	public static void convierteTemperatura() {
		
		String valorTemperatura;
		Double valorInicial;
		Double temperaturaConvertida;
		
		valorTemperatura = JOptionPane.showInputDialog(null, "Introduzca la temperatura a convertir: ");
		
		ValidaValor.validaSecuencia(valorTemperatura);
		
		temperaturaConvertida = Double.valueOf(valorTemperatura);
		valorInicial = temperaturaConvertida;
		
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
			 GradosCelsius gradosCelsius = new GradosCelsius();
			 JOptionPane.showMessageDialog(null, valorInicial + " °C equivalen a " + gradosCelsius.calcularA(temperaturaConvertida) + " °F");	 
		 } else if ("Grados Celcius a Kelvin".equals(seleccionarConversion)) {
			 GradosCelsius gradosCelsius = new GradosCelsius();
			 JOptionPane.showMessageDialog(null, valorInicial + " °C equivalen a " + gradosCelsius.calcularB(temperaturaConvertida) + " Kelvin");	
		 } else if ("Grados Fahrenheit a Grados Celcius".equals(seleccionarConversion)) {
			 GradosFahrenheit gradosFahrenheit = new GradosFahrenheit();
			 JOptionPane.showMessageDialog(null, valorInicial + " °F equivalen a " + gradosFahrenheit.calcularA(temperaturaConvertida) + " °C");	
		 } else if ("Grados Fahrenheit a Kelvin".equals(seleccionarConversion)) {
			 GradosFahrenheit gradosFahrenheit = new GradosFahrenheit();
			 JOptionPane.showMessageDialog(null, valorInicial + " °F equivalen a " + gradosFahrenheit.calcularB(temperaturaConvertida) + " °Kelvin");	
		 } else if ("Kelvin a Grados Celcius".equals(seleccionarConversion)) {
			 Kelvin kelvin = new Kelvin();
			 JOptionPane.showMessageDialog(null, valorInicial + " K equivalen a " + kelvin.calcularA(temperaturaConvertida) + " °C");	
		 } else if ("Kelvin a Grados Fahrenheit".equals(seleccionarConversion)) {
			 Kelvin kelvin = new Kelvin();
			 JOptionPane.showMessageDialog(null, valorInicial + " K equivalen a " + kelvin.calcularB(temperaturaConvertida) + " °F");	
		 }
		 
	}
}
