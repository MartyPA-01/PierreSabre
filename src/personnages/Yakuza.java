package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;

    public Yakuza(String nom, String clan) {
        super(nom, "whisky", 30);
        this.clan = clan;
        this.reputation = 0;
    }

    public void extorquer(Commercant victime) {
        int argentPique = victime.seFaireExtorquer();
        this.gagnerArgent(argentPique);
        this.reputation++;
        parler("J'ai piqu� les " + argentPique + " sous de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " sous dans ma poche. Hi ! Hi !");
    }

    public void perdre() {
    	int arg=this.getArgent();
        this.perdreArgent(arg);
        this.reputation--;
        parler("J'ai perdu mon duel et mes " + arg + " sous, snif... J'ai d�shonor� le clan de " + this.clan + ".");
    }

    public void gagner(int gain) {
        this.gagnerArgent(gain);
        this.reputation++;
        parler("Je l'ai d�pouill� de ses " + gain + " sous. Hi ! Hi !");
    }

    public int getReputation() {
        return reputation;
    }
}

