package tp;

public class Vehicule1 {
	
	    private String marque;
	    private int annee;
	    private double prix;
	    public Vehicule1(String marque, int annee, double prix){
	        this.marque = marque;
	        this.annee = annee;
	        this.prix = prix;
	    }
	    public void afficherDetails(){
	        System.out.println("Marque : " + marque);
	        System.out.println("Annee : " + annee);
	        System.out.println("Prix : " + prix);
	    }
}
