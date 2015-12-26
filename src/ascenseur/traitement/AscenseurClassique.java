package ascenseur.traitement;

public class AscenseurClassique implements FabriqueAscenseur{
	public VitesseAscenseur getVitesse() {
		return new VitesseNormale();
	}

	public MusiqueAscenseur getMusique() {
		return new MusiqueClassique();
	}
}
