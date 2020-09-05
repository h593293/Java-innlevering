package innlevering;

import static javax.swing.JOptionPane.showInputDialog;

public class InnlevObl5 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			int poeng = 0;
			{
				poeng = Integer.parseInt(showInputDialog(+i + " Skriv inn poengsum"));
			}
			while (poeng < 1 || poeng > 100) {
				poeng = Integer.parseInt(showInputDialog("Poengsum må være mellom 0 og 100"));
			}

			if (poeng >= 90 && poeng <= 100)
				System.out.println(i + " Du fikk Karakter A");
			if (poeng <= 89 && poeng >= 80)
				System.out.println(i + " Du fikk Karakter B");
			if (poeng <= 79 && poeng >= 60)
				System.out.println(i + " Du fikkarakter C");
			if (poeng <= 59 && poeng >= 50)
				System.out.println(i + " Du fikk Karakter D");
			if (poeng <= 49 && poeng >= 40)
				System.out.println(i + " Du fikkkarakter E");
			if (poeng <= 39 && poeng >= 1)
				System.out.println(i + " Du fikk karakter F");
			if (poeng >= 101)
				System.out.println(i + " Ugyldig poengsum");
			if (poeng <= 0)
				System.out.println(i + " Ugyldig poengsum");

		}

	}

}
