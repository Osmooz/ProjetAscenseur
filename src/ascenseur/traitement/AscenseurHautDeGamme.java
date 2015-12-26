package ascenseur.traitement;

public class AscenseurHautDeGamme implements FabriqueAscenseur{
	public VitesseAscenseur getVitesse() {
		return new VitesseRapide();
	}

	public MusiqueAscenseur getMusique() {
		return new MusiqueClassique();
	}
}
