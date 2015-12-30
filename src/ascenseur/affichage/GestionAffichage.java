package ascenseur.affichage;

import java.util.Scanner;

public class GestionAffichage {
		
		final char ascenseurEnDescente = 'D';
		final char ascenseurEnMontee = 'M';
		final char ascenseurOuvert = 'O';
		final char ascenseurFerme = 'F';
		final char appelMonter = 'm';
		final char appelDecsendre = 'd';

		private String[][] preparerImmeuble() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nb etage : ");
			int nbEtage = sc.nextInt();
			
			System.out.println("Nb ascenseur : ");
			int nbAscenseur = sc.nextInt();
			
			String[][] immeuble = new String[(nbAscenseur * 3) + 1][nbEtage]; // ici aussi
			for (int i = 0; i < immeuble.length - 1; ++i) {
					for (int j = 0; j < immeuble[i].length; ++j) {
						immeuble[i][j] = " "; // faut qu'on se mette daccord sur la tete de l'affichage
				}
			}
			
			return immeuble;
		}
		
		public static void main(String[] args) {
			
		}
}
