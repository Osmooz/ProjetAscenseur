package ascenseur.traitement;

import java.util.ArrayList;
import java.util.Collections;

public class Ascenseur{
	private String etat;/*valeur: IMMOBILE_OUVERT; IMMOBILE_FERME; MONTANT; DESCENDANT
						  de la classe Constantes */
	private boolean bloque;
	private int etage;
	private ArrayList<Requete> listeRequetes; // A determiner quel type de collection
	private StrategieAjoutRequete strategieAjoutRequete;
	
	public Ascenseur(StrategieAjoutRequete strategieAjoutRequete){
		etat = Constantes.IMMOBILE_FERME;
		bloque = false;
		etage = 0;
		listeRequetes = new ArrayList<Requete>();
		this.strategieAjoutRequete = strategieAjoutRequete;
	}
	
	public void bloquer(){
		//A faire
		bloque = true;
	}
	
	public void debloquer(){
		bloque = false;
	}
	
	public void ajouterRequete(Requete requete){
		listeRequetes = strategieAjoutRequete.ajouterRequete(listeRequetes, requete);
	}
	
	public void creerRequeteInterne(int etage){
		ajouterRequete(new RequeteInterne(etage));
	}
	
	public void action(){
		
	}
	
	public ArrayList<Requete> requetes(){
		return listeRequetes;
	}
}
