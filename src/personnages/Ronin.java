package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	public Ronin(String n,String boisson,int arg) {
		super(n,boisson,arg);
	}
	public void donner(Commercant beneficiaire) {
		parler(String.format("%s prend ces %d sous.", beneficiaire.getNom(),this.getArgent()));
		int dixPourArg=this.getArgent()/10;
		beneficiaire.recevoir(dixPourArg);
		this.setArgent(this.getArgent()-dixPourArg);
	}
}
