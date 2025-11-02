package tp;

public class Rectangle {
	public float longueur=10;
	public float largeur=8;
	public float surface;
	public Rectangle (float longueur , float largeur ) {
		this.longueur=longueur;
		this.largeur=largeur;
		
	}
	public Rectangle () {}
	
	public void AfficherDim() {
		System.out.println("la largeur ="+this.largeur+"et la longueur ="+this.longueur);
		
	}
	
	public void ModifierVal(float longueur , float largeur ) {
		if(longueur > 0 && largeur > 0) {
			this.longueur=longueur;
			this.largeur=largeur;
		}else{
			System.out.println("ecrire des valeurs positives");
		}}
		
	public float Calculer(float longueur , float largeur) {
		return longueur*largeur;
	}
	 public void typeRectangle() {
	        if (longueur == largeur) {
	            System.out.println("Je suis un Carré.");
	        } else {
	            System.out.println("Je suis un Rectangle.");
	        }
	    }
	}
	