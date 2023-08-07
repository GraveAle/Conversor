package Monedas;

public class PesoMexicano extends Moneda{

	public PesoMexicano () {
		tasaCambio = 1;
	}
	
	@Override
	public double convertirA(double cantidad) {
		return cantidad;
	}
	
}
