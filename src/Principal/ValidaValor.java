package Principal;

public class ValidaValor {
    public static boolean tryParseDouble(String value) {
        // Verificar si el valor es nulo o vacío
        if (value == null || value.isEmpty()) {
            return false;
        }

        // Verificar si el valor contiene solo dígitos
        for (char c : value.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
