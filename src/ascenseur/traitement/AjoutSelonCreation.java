package ascenseur.traitement;

import java.util.ArrayList;
import java.util.Collections;

public class AjoutSelonCreation implements StrategieAjoutRequete{

	public ArrayList<Requete> ajouterRequete(ArrayList<Requete> listeRequetes,Requete requete) {
		listeRequetes.add(requete);
		if(requete.getClass() == RequeteInterne.class && listeRequetes.size() > 1)
			for(int i = listeRequetes.size() - 1; i > 0 &&
			  listeRequetes.get(i-1).getClass() != requete.getClass(); --i)
				Collections.swap(listeRequetes, i, i-1);
		return listeRequetes;
	}

}
