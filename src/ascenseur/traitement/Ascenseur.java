package ascenseur.traitement;

import java.util.ArrayList;
import java.util.Collections;

public class Ascenseur{
	private String etat; /*valeur: IMMOBILE_OUVERT; IMMOBILE_FERME; MONTANT; DESCENDANT
						   de la classe Constantes */
	private boolean bloque;
	private int etage;
	private ArrayList<Requete> listeRequetes; // A determiner quel type de collection
	private StrategieAjoutRequete strategieAjoutRequete;
	
	private void changerEtat(String etat) throws MauvaiseConstanteChoisi{
		if(!(etat.equals(Constantes.IMMOBILE_FERME) || etat.equals(Constantes.IMMOBILE_OUVERT)
		|| etat.equals(Constantes.MONTANT) || etat.equals(Constantes.DESCENDANT))){
			throw new MauvaiseConstanteChoisi(etat);
		}
		this.etat = etat;
	}
	private void detruireRequete(){
		listeRequetes.remove(0);
	}
	
	public Ascenseur(StrategieAjoutRequete strategieAjoutRequete){
		etat = Constantes.IMMOBILE_FERME;
		bloque = false;
		etage = 0;
		listeRequetes = new ArrayList<Requete>();
		this.strategieAjoutRequete = strategieAjoutRequete;
	}
	
	public void bloquer(){
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
		try{
			if(!bloque && !listeRequetes.isEmpty()){
				Requete requete = listeRequetes.get(0);
				//cas IMMOBILE_FERME
				if(etat == Constantes.IMMOBILE_FERME){
					//si l'etage destination est superieur a l'etage de l'ascenseur
					if (requete.etage() > etage){
						changerEtat(Constantes.MONTANT);
						++etage;
					}
					//si l'etage destination est inferieur a l'etage de l'ascenseur
					else if (requete.etage() < etage){
						changerEtat(Constantes.DESCENDANT);
						--etage;
					}
					//sinon on ouvre l'ascenseur
					else{
						changerEtat(Constantes.IMMOBILE_OUVERT);
					}
				}
				//cas IMMOBILE_OUVERT
				else if(etat == Constantes.IMMOBILE_OUVERT && requete.etage() != etage){
					changerEtat(Constantes.IMMOBILE_FERME);
				}
				//cas MONTANT
				else if(etat == Constantes.MONTANT){
					if(requete.etage() == etage){
						changerEtat(Constantes.IMMOBILE_OUVERT);
						//detruireRequete();
					}
					else
						++etage;
				}
				//cas DESCENDANT
				else if(etat == Constantes.DESCENDANT){
					if(requete.etage() == etage){
						changerEtat(Constantes.IMMOBILE_OUVERT);
						//detruireRequete();
					}
					else
						--etage;
				}
			}
		}catch(MauvaiseConstanteChoisi excpetion){
			System.out.println(excpetion.mauvaiseConstante());
		}
	}//action()
	
	public ArrayList<Requete> requetes(){
		return listeRequetes;
	}
	
	public String etat(){
		return etat;
	}
	
	public int etage(){
		return etage;
	}
}
