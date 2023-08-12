package Principal;

import javax.swing.JOptionPane;

public class ContinuaPrograma {
	
	public static boolean deseaContinuar() {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Continuar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return opcion == JOptionPane.YES_OPTION;
    }
	
}
