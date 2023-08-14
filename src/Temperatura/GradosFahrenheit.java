package Temperatura;

import Principal.ConvierteTemperatura;

public class GradosFahrenheit extends ConvierteTemperatura{

	
	
	@Override //Grados Fahrenheit a grados Celsius
	public double calcularA(Double temperatura) {
		return (temperatura - 32) / 1.8;
	}

	@Override //Convierte a Kelvin
	public double calcularB(Double temperatura) {
		
		return  0.556 * (temperatura - 32) + 273.15;
	}
	
}
