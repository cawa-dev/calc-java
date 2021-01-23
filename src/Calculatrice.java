import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTextField;

public class Calculatrice extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	// Parser = calculation, Equals = answer, JTextField number = number
	double number, answer;
	int calculation;

	// Opérations
	private JButton btnAC = new JButton("AC");
	private JButton btnNeg = new JButton("+/-");
	private JButton btnPerc = new JButton("%");
	private JButton btnDiv = new JButton("÷");
	private JButton btnMult = new JButton("×");
	private JButton btnSous = new JButton("-");
	private JButton btnAddi = new JButton("+");
	private JButton btnEquals = new JButton("=");
	private JButton btnVirg = new JButton(",");

	// Nombres
	private JButton b0 = new JButton("0");
	private JButton b1 = new JButton("1");
	private JButton b2 = new JButton("2");
	private JButton b3 = new JButton("3");
	private JButton b4 = new JButton("4");
	private JButton b5 = new JButton("5");
	private JButton b6 = new JButton("6");
	private JButton b7 = new JButton("7");
	private JButton b8 = new JButton("8");
	private JButton b9 = new JButton("9");

	// JTextField result
	private JTextField result = new JTextField("");

	// JLabel label (champs de texte)
	private JLabel label = new JLabel();

	// Font des boutons et des chiffres
	private Font font = new Font("SansSerif", Font.PLAIN, 18);

	// Constructeur de la classe
	public Calculatrice() {
		// Fenêtre Attributs
		this.setTitle("Calculatrice");
		this.setBounds(415, 56, 270, 360);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.white);
		this.setLayout(null);


		//result Attributs
		this.result.setBounds(10, 10, 250, 50);
		this.add(result);
		//btnAc Attributs
		this.btnAC.setBounds(10, 61, 53, 53);
		this.btnAC.setFont(font);
		this.add(btnAC);
		//btnNeg Attributs
		this.btnNeg.setBounds(74, 61, 53, 53);
		this.btnNeg.setFont(font);
		this.add(btnNeg);
		//btnPerc Attributs
		this.btnPerc.setBounds(138, 61, 53, 53);
		this.btnPerc.setFont(font);
		this.add(btnPerc);
		//btnDiv Attributs 
		this.btnDiv.setBounds(202, 61, 53, 53);
		this.btnDiv.setFont(font);
		this.add(btnDiv);
		//b7 Attributs
		this.b7.setBounds(10, 114, 53, 53);
		this.b7.setFont(font);
		this.add(b7);
		//b8 Attributs
		this.b8.setBounds(74, 114, 53, 53);
		this.b8.setFont(font);
		this.add(b8);
		//b9 Attributs
		this.b9.setBounds(138, 114, 53, 53);
		this.b9.setFont(font);
		this.add(b9);
		//btnMult Attributs
		this.btnMult.setBounds(202, 114, 53, 53);
		this.btnMult.setFont(font);
		this.add(btnMult);
		//b4 Attributs
		this.b4.setBounds(10, 167, 53, 53);
		this.add(b4);
		this.b4.setFont(font);
		//b5 Attributs
		this.b5.setBounds(74, 167, 53, 53);
		this.b5.setFont(font);
		this.add(b5);
		//b6 Attributs
		this.b6.setBounds(138, 167, 53, 53);
		this.b6.setFont(font);
		this.add(b6);
		//btnSous Attributs
		this.btnSous.setBounds(202, 167, 53, 53);
		this.btnSous.setFont(font);
		this.add(btnSous);
		//b1 Attributs
		this.b1.setBounds(10, 220, 53, 53);
		this.b1.setFont(font);
		this.add(b1);
		//b2 Attributs
		this.b2.setBounds(74, 220, 53, 53);
		this.b2.setFont(font);
		this.add(b2);
		//b3 Attributs
		this.b3.setBounds(138, 220, 53, 53);
		this.b3.setFont(font);
		this.add(b3);
		//btnAddi Attributs
		this.btnAddi.setBounds(202, 220, 53, 53);
		this.btnAddi.setFont(font);
		this.add(btnAddi);
		//b0 Attributs
		this.b0.setBounds(10, 273, 118, 53);
		this.b0.setFont(font);
		this.add(b0);
		//btnVirg Attributs
		this.btnVirg.setBounds(138, 273, 53, 53);
		this.btnVirg.setFont(font);
		this.add(btnVirg);
		//btnEquals Attributs
		this.btnEquals.setBounds(202, 273, 53, 53);
		this.btnEquals.setFont(font);
		this.add(btnEquals);

		// JTextField Attributs
		this.result.setEditable(false);
		this.result.setHorizontalAlignment(JTextField.RIGHT);
		this.result.setFont(font);

		// ActionListener sur tout les boutons
		this.b0.addActionListener(this);
		this.b1.addActionListener(this);
		this.b2.addActionListener(this);
		this.b3.addActionListener(this);
		this.b4.addActionListener(this);
		this.b5.addActionListener(this);
		this.b6.addActionListener(this);
		this.b7.addActionListener(this);
		this.b8.addActionListener(this);
		this.b9.addActionListener(this);
		this.btnAC.addActionListener(this);
		this.btnNeg.addActionListener(this);
		this.btnPerc.addActionListener(this);
		this.btnDiv.addActionListener(this);
		this.btnMult.addActionListener(this);
		this.btnSous.addActionListener(this);
		this.btnAddi.addActionListener(this);
		this.btnEquals.addActionListener(this);
		this.btnVirg.addActionListener(this);

		// Afficher la fenêtre
		this.setVisible(true);
	}
	// Fonction sur les boutons rendues écoutables
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		/* Try Catch sur l'ensemble des boutons
		 * de la calculatrice pour récupérer
		 * les erreurs sur les nombres ou leurs formats */
		try {
			// Écoute Bouton AC (Clear All)
			if(source == btnAC) {
				result.setText("");
			}
			// Écoute Bouton 0
			else if (source == b0) {
				result.setText(result.getText() + "0");
			}
			// Écoute Bouton 1
			else if (source == b1) {
				result.setText(result.getText() + "1");
			} 
			// Écoute Bouton 2
			else if (source == b2) {
				result.setText(result.getText() + "2");
			} 
			// Écoute Bouton 3
			else if (source == b3) {
				result.setText(result.getText() + "3");
			} 
			// Écoute Bouton 4
			else if (source == b4) {
				result.setText(result.getText() + "4");
			} 
			// Écoute Bouton 5
			else if (source == b5) {
				result.setText(result.getText() + "5");
			} 
			// Écoute Bouton 6
			else if (source == b6) {
				result.setText(result.getText() + "6");
			} 
			// Écoute Bouton 7
			else if (source == b7) {
				result.setText(result.getText() + "7");
			} 
			// Écoute Bouton 8
			else if (source == b8) {
				result.setText(result.getText() + "8");
			} 
			// Écoute Bouton 9
			else if (source == b9) {
				result.setText(result.getText() + "9");
			} 
			// Écoute Bouton Virgule
			else if (source == btnVirg) {
				if (result.getText().contains(".")) {
					result.setText(".");
				} else {
					result.setText(result.getText() + ".");
				}
			}		
			// Écoute Bouton Addition
			else if (source == btnAddi) {
				String str = result.getText();
				number = Double.parseDouble(result.getText());
				result.setText("");
				label.setText(str + "+");
				calculation = 1;
			} 
			// Écoute Bouton Negative
			else if(source == btnNeg) {
				if(Float.parseFloat(result.getText()) == 0) {
					result.setText("0");
				} else if (result.getText().startsWith("-") == true) {
					String str = result.getText();
					number = Float.parseFloat(result.getText());
					result.setText("" + Math.round(number));
					label.setText("-" + str);
				} else {
					String str = result.getText();
					number = Float.parseFloat(result.getText());
					result.setText("-" + Math.round(number));
					label.setText("-" + str);
				}
			}  
			// Écoute Bouton Pourcentage
			else if(source == btnPerc) {
				String str = result.getText();
				number = Float.parseFloat(result.getText());
				result.setText("" + (double) number / 100);
				label.setText("-" + str);
			} 
			// Écoute Bouton Soustraction
			else if (source == btnSous) {
				String str = result.getText();
				number = Double.parseDouble(result.getText());
				result.setText("");
				label.setText(str + "-");
				calculation = 2;
			}
			// Écoute Bouton Multiplié
			else if (source == btnMult) {
				String str = result.getText();
				number = Double.parseDouble(result.getText());
				result.setText("");
				label.setText(str + "X");
				calculation = 3;
			} 
			// Écoute Bouton Divisé
			else if (source == btnDiv) {
				String str = result.getText();
				number = Double.parseDouble(result.getText());
				result.setText("");
				label.setText(str + "/");
				calculation = 4;
			} 
			//Condition sur le bouton appuyé en fonction de la variable calculation 
			else if (source == btnEquals) {
				switch (calculation) {
				// Addition
				case 1:
					answer = number + Double.parseDouble(result.getText());
					if (Double.toString(answer).endsWith(".0")) {
						result.setText(Double.toString(answer).replace(".0", ""));
					} else {
						result.setText(Double.toString(answer));
					}
					label.setText("");
					break;
					// Soustraction
				case 2:
					answer = number - Double.parseDouble(result.getText());
					if (Double.toString(answer).endsWith(".0")) {
						result.setText(Double.toString(answer).replace(".0", ""));
					} else {
						result.setText(Double.toString(answer));
					}
					label.setText("");
					break;
					// Multiplication
				case 3:
					answer = number * Double.parseDouble(result.getText());
					if (Double.toString(answer).endsWith(".0")) {
						result.setText(Double.toString(answer).replace(".0", ""));
					} else {
						result.setText(Double.toString(answer));
					}
					label.setText("");
					break;
					//Division
				case 4:
					answer = number / Double.parseDouble(result.getText());
					boolean bool = false;
					if(Double.isInfinite(answer) || Double.isNaN(answer) || answer == 0) {
						bool = true;
						result.setText("Division impossible");
						JOptionPane.showMessageDialog(this, "Divison par zéro sur un double résulte forcément l'Infini ou Not a Number\n" 
								+"qui est un n'est pas un chriffre éxistant !", "Error", JOptionPane.ERROR_MESSAGE);
						if (bool == true) {
							result.setText("");
						}
					} else if (Double.toString(answer).endsWith(".0")) {
						result.setText(Double.toString(answer).replace(".0", ""));
					} else {
						result.setText(Double.toString(answer));
					}
					label.setText("");
					break;
				}
			}
		}catch (NumberFormatException exp) {
			System.out.println("Something gone wrong with " + exp);
		}
	}
}