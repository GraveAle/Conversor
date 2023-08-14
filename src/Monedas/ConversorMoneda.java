package Monedas;

import javax.swing.JOptionPane;

import Principal.ValidaValor;



public class ConversorMoneda {
	
	public static void convierteMoneda() {
		
		String valorMoneda;
		Double monedaConvertida;
		
		valorMoneda = JOptionPane.showInputDialog(null, "Introduzca la cantidad a convetir");
		
		ValidaValor.validaSecuencia(valorMoneda);
		
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
									"Convertir Won sul-coreano a pesos"};

		 Object seleccionarConversion = JOptionPane.showInputDialog(null,
		             "Seleccione el tipo de conversión", "Monedas",
		             JOptionPane.INFORMATION_MESSAGE, null,
		             menuConversion, menuConversion[0]);
		 
		 if ("Convertir peso mxn a Dólar".equals(seleccionarConversion)) {
			  Dolar dolar = new Dolar();
			  JOptionPane.showMessageDialog(null, "Tienes $ " + dolar.convertirA(monedaConvertida) + " dolares");
		 } else if ("Convertir peso mxn a Euros".equals(seleccionarConversion)){
			 Euro euro = new Euro();
			 JOptionPane.showMessageDialog(null, "Tienes $ " + euro.convertirA(monedaConvertida) + " Euros");
		 } else if ("Convertir peso mxn a Libras Esterlinas".equals(seleccionarConversion)){
			 LibraEsterlina lb = new LibraEsterlina();
			 JOptionPane.showMessageDialog(null, "Tienes $ " + lb.convertirA(monedaConvertida) + " Libras Esterlinas");
		 } else if ("Convertir peso mxn a Yen Japonés".equals(seleccionarConversion)) {
			 YenJapones yenJapones = new YenJapones();
			 JOptionPane.showMessageDialog(null, "Tienes $ " + yenJapones.convertirA(monedaConvertida) + " Yenes Japoneses");
		 } else if ("Convertir peso mxn a Won sul-coreano".equals(seleccionarConversion)) {
			 WonSurcoreano wonSurcoreano = new WonSurcoreano();
			 JOptionPane.showMessageDialog(null, "Tienes $ " + wonSurcoreano.convertirA(monedaConvertida) +
					 "Wones Surcoreanos");
		 } else if ("Convertir Dólar a pesos".equals(seleccionarConversion)) {
			 Dolar dolar = new Dolar();
			 JOptionPane.showMessageDialog(null, "Tienes $ " + dolar.convierteP(monedaConvertida) + " pesos");
		 } else if ("Convertir Euros a pesos".equals(seleccionarConversion)){
			 Euro euro = new Euro();
			 JOptionPane.showMessageDialog(null, "Tienes $ " + euro.convierteP(monedaConvertida) + " pesos");
		 } else if ("Convertir Libras Esterlinas a pesos".equals(seleccionarConversion)){
			 LibraEsterlina lb = new LibraEsterlina();
			 JOptionPane.showMessageDialog(null, "Tienes $ " + lb.convierteP(monedaConvertida) + " pesos");
		 } else if ("Convertir Yen Japonés a pesos".equals(seleccionarConversion)){
			 YenJapones yenJapones = new YenJapones();
			 JOptionPane.showMessageDialog(null, "Tienes $ " + yenJapones.convierteP(monedaConvertida) + " pesos");
		 } else if ("Convertir Won sul-coreano a pesos".equals(seleccionarConversion)){
			 WonSurcoreano wonSurcoreano = new WonSurcoreano();
			 JOptionPane.showMessageDialog(null, "Tienes $ " + wonSurcoreano.convierteP(monedaConvertida) + " pesos");
		 } 
	
	}
}
