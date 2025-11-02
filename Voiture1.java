package tp;

public class Voiture1 extends Vehicule1 {
	  private int nbrporte;
	   public Voiture1(String marque, int annee, double prix,int nbrporte) {
	        super(marque, annee, prix);
	        this.nbrporte = nbrporte;
	    }
	    @Override
	    public void afficherDetails(){
	        super.afficherDetails();
	        System.out.println("Nombre de portes : " + nbrporte);
	    }
	    
}
