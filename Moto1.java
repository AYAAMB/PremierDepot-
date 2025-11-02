package tp;

public class Moto1 extends Vehicule1{
	  private boolean asideCar;

	    public Moto1(String marque, int annee, double prix, boolean asideCar) {
	        super(marque, annee, prix);
	        this.asideCar = asideCar;
	    }
	    @Override
	    public void afficherDetails() {
	        super.afficherDetails();
	        System.out.println("Aside car : " + asideCar);
	    }
}
