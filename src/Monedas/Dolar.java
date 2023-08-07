package Monedas;

public class Dolar extends Moneda{

	public Dolar () {
		tasaCambio = 0.059;
	}
	
	@Override
	public double convertirA(double cantidad) {
		return cantidad * tasaCambio;
	}

}
