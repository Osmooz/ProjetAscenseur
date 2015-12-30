package ascenseur.traitement;

public class MauvaiseConstanteChoisi extends Exception{
	private static final long serialVersionUID = 1L;
	private String mauvaiseConstante;
	public MauvaiseConstanteChoisi(String mauvaiseConstante){
		super();
		this.mauvaiseConstante = mauvaiseConstante;
	}
	
	public String mauvaiseConstante(){
		return "Mauvaise constante: " + mauvaiseConstante;
	}
}
