package Temperatura;

import Principal.ConvierteTemperatura;

public class GradosCelsius extends ConvierteTemperatura{

	@Override //Convirete celcius a Fahrenheit
	public double calcularA(Double temperatura) {
		
		return temperatura * 1.8 + 32;
	}

	@Override //Convierte celcius a Kelvin
	public double calcularB(Double temperatura) {
		
		return temperatura + 273.15;
	}

	
	
	
	
	
	
}
