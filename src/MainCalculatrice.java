import javax.swing.JOptionPane;

public class MainCalculatrice {
	// Main
	public static void main(String[] args) {
		Calculatrice calculatrice = new Calculatrice();
		JOptionPane.showMessageDialog(calculatrice, "Bienvenue sur notre calculatrice développé par\n"
				+ "Ihab Oraby et Sacha Mouchon en Java !", "Welcome", JOptionPane.INFORMATION_MESSAGE);
	}
}