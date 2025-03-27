package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom,int argent){
		super(nom,"th�",argent);
	}
	
	public int seFaireExtorquer() {
		int arg=getArgent();
		setArgent(0);
		parler("J�ai tout perdu! Le monde est trop injuste...");
		return arg;
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		parler(String.format("%d sous ! Je te remercie g�n�reux donateur!", argent));
	}
}
