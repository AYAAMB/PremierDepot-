package tp;

public class Magasin extends Document {
	 private int numero;
	    public Magasin (String titre, String auteur, int  annee,int numero) {
	        super(titre, auteur,annee);
	        this.numero = numero;
	    }
	    public void afficherDetails(){
	        super.afficherDetails();
	        System.out.println("Nombre de pages Magazin : " + numero);
	    }
}
