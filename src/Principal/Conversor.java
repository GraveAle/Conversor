package Principal;

public class Conversor {
	
	protected double tasaCambio;
	protected double tasaPeso;
	
	public double convertirA (double cantidad) {
		 return cantidad * tasaCambio;
	}
	
	public double convierteP (double cantidad) {
		return cantidad * tasaPeso;
	}

}
