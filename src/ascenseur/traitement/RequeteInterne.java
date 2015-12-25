package ascenseur.traitement;

public class RequeteInterne implements Requete, Comparable<Requete>{
	private int etage;
	
	public RequeteInterne(int etage){
		this.etage = etage;
	}
	public int etage(){
		return etage;
	}

	public int compareTo(Requete requete2) {
		if(requete2.getClass() != this.getClass())
			return -1;
		return 0;
	}
}
