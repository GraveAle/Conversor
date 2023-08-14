package Temperatura;

import Principal.ConvierteTemperatura;

public class Kelvin extends ConvierteTemperatura{

	@Override //Convierte Kelvin
	public double calcularA(Double temperatura) {
		
		return temperatura - 273.15;
	}

	@Override // Fahrenheit
	public double calcularB(Double temperatura) {
		
		return (1.8) * (temperatura - 273.15) + 32;
	}

}
