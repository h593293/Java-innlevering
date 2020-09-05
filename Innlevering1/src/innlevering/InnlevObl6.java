package innlevering;

import static javax.swing.JOptionPane.showInputDialog;

public class InnlevObl6 {

		public static void main(String[] args) {
			
			int n = Integer.parseInt(showInputDialog("Skriv inn heltall"));
			int svar = 1;
			
			for ( int i=1; i<=n; i++) {
				svar = svar*i;
			}
			
				System.out.println("Fakultetet av " + "!" + n + " er " + svar);

		}
	}

