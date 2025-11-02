package tp;

public class Livre extends Document {
	 private int NombrePage;
	    public Livre(String titre,String auteur ,int anneePublication, int nombrePage) {
	        super(titre,auteur, anneePublication);
	        this.NombrePage = nombrePage;
	    }
	    public void afficherDetails(){
	        super.afficherDetails();
	        System.out.println("Nombre de pages : " + NombrePage);
	    }
	
	
}
