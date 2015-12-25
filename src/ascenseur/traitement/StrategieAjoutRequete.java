package ascenseur.traitement;

import java.util.ArrayList;

public interface StrategieAjoutRequete {
	public ArrayList<Requete> ajouterRequete(ArrayList<Requete> listeRequetes, Requete requete);
}
