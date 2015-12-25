package ascenseur.traitement;

import java.util.ArrayList;

public class Ascenseur {
	public static final String IMMOBILE_OUVERT = "immobile_ouvert";
	public static final String IMMOBILE_FERME = "immobile_ferme";
	public static final String MONTANT = "monte";
	public static final String DESCENDANT = "descendant";
	String etat;//= { IMMOBILE_OUVERT; IMMOBILE_FERME; MONTANT; DESCENDANT}
	boolean bloque;
	int etage;
	ArrayList<Requete> listeRequete; // A determiner quel type de collection
	
	public void bloquer(){
		bloque = true;
	}
	
	public void debloquer(){
		bloque = false;
	}
	
	public void ajouterRequete(Requete requete){
		
	}
	
	public void creerRequeteInterne(int etage){
		
	}
	
	public void action(){
		
	}
}
