package ascenseur.traitement;

import java.util.ArrayList;

public class GestionAscenseurs {

	public static void main(String[] args) {
		Ascenseur ascenseur = new Ascenseur(new AjoutSelonCreation());
		ascenseur.creerRequeteInterne(2);
		ascenseur.creerRequeteInterne(1);
		ascenseur.ajouterRequete(new RequeteExterne(3, Constantes.MONTANT));
		ascenseur.creerRequeteInterne(4);
		
		ArrayList<Requete> listeAscenseurs = ascenseur.requetes();
		for(Requete requete : listeAscenseurs){
			System.out.println(requete.etage() + "\t" + requete.getClass());
		}
	}

}
