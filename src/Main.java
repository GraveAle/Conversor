import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		Object[] menuConversion = { "Conversor de moneda", "Conversor de temperatura"};

		 Object seleccionarConversion = JOptionPane.showInputDialog(null,
		             "Seleccione una opcion de conversión", "Input",
		             JOptionPane.INFORMATION_MESSAGE, null,
		             menuConversion, menuConversion[0]);
	}
}
