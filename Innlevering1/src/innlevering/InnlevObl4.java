package innlevering;

import static javax.swing.JOptionPane.showInputDialog;

public class InnlevObl4 {

	public static void main(String[] args) {
		int inntekt = Integer.parseInt(showInputDialog("bruttoinntekt"));
		
		if (inntekt >164100 && inntekt <230950)
			System.out.println(inntekt * 0.093 + " er trinnskatten");
		if (inntekt <580651 && inntekt >230951)
			System.out.println(inntekt * 0.0241 + " er trinnskatten");
		if (inntekt < 934050 && inntekt > 580651)
			System.out.println(inntekt * 0.1152 + " er trinnskatten");
		if (inntekt > 934050)
			System.out.println(inntekt * 0.1450 + " er trinnskatten");
		if (inntekt < 164100)
			System.out.println(inntekt * 0 + "Du betaler ikke trinnskatt");
		
	}

}
