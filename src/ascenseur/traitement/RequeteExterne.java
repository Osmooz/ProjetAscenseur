package ascenseur.traitement;

public class RequeteExterne implements Requete {
	public static final String MONTER = "monter";
	public static final String DESCENDRE = "descendre";
	String demande;//={MONTER; DESCENDRE}
	int etage;//etage ou la demande a ete faite
	
	public RequeteExterne(int etage, String demande){
		this.etage = etage;
		this.demande = demande;
	}
}
