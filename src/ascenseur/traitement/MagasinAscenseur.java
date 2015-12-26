package ascenseur.traitement;

public class MagasinAscenseur {
	FabriqueAscenseur categorie;
	
	public MagasinAscenseur (FabriqueAscenseur categorie) {
		this.categorie = categorie;
	}
	
	public void assemblerOptions() {
		VitesseAscenseur vitesse = categorie.getVitesse();
		MusiqueAscenseur musique = categorie.getMusique();
		
		vitesse.ajouterVitesse();
		musique.ajouterMusique();
	}
}
