package tp;

	class These extends Document {
	    private String universite;

	    public These(String titre, String auteur, int anneePublication, String universite) {
	        super(titre, auteur, anneePublication);
	        this.universite = universite;
	    }

	    
	    @Override
	    public void afficherDetails() {
	        super.afficherDetails(); 
	        System.out.println("Université: " + universite);
	    }
}
