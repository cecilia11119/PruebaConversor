import javax.swing.JOptionPane;
public class PruebaValidacion {

	
		public static void main(String[] args) {
			String n1 = JOptionPane.showInputDialog(null, "ingrese el 1er numero");
			while (!isNumber(n1)) {
				n1 = JOptionPane.showInputDialog(null,
						"Numero invalido. Por favor ingrese otro numero");
			}

		}

		private static boolean isNumber(String n) {
			try {
				Integer.parseInt(n);
				return true;
			} catch (NumberFormatException nfe) {
				return false;
			}
		}
	
}
