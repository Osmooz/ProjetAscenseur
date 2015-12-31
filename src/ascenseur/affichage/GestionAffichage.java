package ascenseur.affichage;

import java.util.Scanner;

public class GestionAffichage { // FAUDRA GERER LES EXCEPTIONS
		
		final static char ASCENSEUR_EN_DESCENTE = 'D';
		final static char ASCENSEUR_EN_MONTE = 'M';
		final static char ASCENSEUR_OUVERT = 'O';
		final static char ASCENSEUR_FERME = 'F';
		final static char APPEL_MONTER = 'm';
		final static char APPEL_DESCENDRE = 'd';
		final static char PAS_APPEL = '0';
		final static char ETAGE = '_';

		protected static char[][] preparerImmeuble() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nb etage : ");
			int nbEtage = sc.nextInt();
			
			System.out.println("Nb ascenseur : ");
			int nbAscenseur = sc.nextInt();
			
			char[][] immeuble = new char[(nbAscenseur * 2) + 1][nbEtage - 1]; 
			for (int i = 0; i < immeuble.length - 1; ++i) {					//initialiser les étages
				for (int j = 0; j < immeuble[i].length - 1; ++j) {
					immeuble[i][j] = ETAGE; 
				}
			}
			for (int i = immeuble.length - 1; i < immeuble.length; ++i) {	//initialiser les ascenseurs fermés
				for (int j = 0; j < immeuble[i].length - 1; ++j) {			// à l'étage 0
					if (j % 2 == 0)
						immeuble[i][j] = ASCENSEUR_FERME; 
					else
						immeuble[i][j] = ETAGE;
				}
			}
			for (int i = 0; i < immeuble.length; ++i) {						//initialiser les boutons d'appel à 0
				for (int j = immeuble[i].length - 1; j < immeuble[i].length; ++j) {
					immeuble[i][j] = PAS_APPEL;
				}
			}
			for (int i = 0; i < immeuble.length; ++i) {						//afficher l'immeuble
				for (int j = 0; j < immeuble[i].length; ++j) {
					System.out.print(immeuble[i][j]);
				}
				System.out.println('\r');
			}
			
			return immeuble;
		}
		
		public static void main(String[] args) {
			char[][] im = preparerImmeuble();
		}
}
