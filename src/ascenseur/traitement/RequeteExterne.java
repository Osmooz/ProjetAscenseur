package ascenseur.traitement;

public class RequeteExterne implements Requete, Comparable<Requete>{
	private String demande;//valeurs: MONTER; DESCENDRE de la classe Constantes
						   
	private int etage;//etage ou la demande a ete faite
	
	public RequeteExterne(int etage, String demande){
		this.etage = etage;
		this.demande = demande;
	}
	
	public int etage(){
		return etage;
	}
	
	public String demande(){
		return demande;
	}


	public int compareTo(Requete requete2) {
		if(requete2.getClass() != this.getClass()){
			System.out.println("compare");
			return 1;
		}
		return 0;
	}
}
