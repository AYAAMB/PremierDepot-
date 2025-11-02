package tp;

public class Document {

	String titre;
	String auteur ;
	int anneePublication;
	public Document (String titre , String auteur , int anneePublication) {
	this.titre=titre;
	this.auteur=auteur;
	this.anneePublication=anneePublication;
	}
    public void afficherDetails(){
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Annee de publication : " + anneePublication);
    }
	
	
	
}

