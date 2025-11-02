package tp;



public class Main {

	public static void main(String[] args) {
		//Rectangle rectangle =new Rectangle();
		
		//System.out.println(rectangle.longueur);
		//Cercle c=new  Cercle(5);
		//Rectangle2 r =new Rectangle2(5,10);
		//Form [] forme= {c,r};
		//for(Form f : forme) {
			
		//	System.out.print("clacul air est"+f.calculerAire());
			
		//}
		
		//	Compteur var1=new  Compteur();
		//	Compteur var2=new  Compteur();
		//Compteur var3=new  Compteur();
		////System.out.println(var1.id);
		//System.out.println(var2.id);
		//System.out.println(var3.id);
		//System.out.println(Compteur.compteur);
		//System.out.println(MathUtils.addition(1,2));
		//System.out.println(MathUtils.multiplication(1,2));
				//float P=point.Avancer(5);  
		//System.out.println(P);
		
		
		
		  Document[] documents = new Document[3];

	       
	        documents[0] = new Livre("Les Misérables", "Victor Hugo", 1862, 1488);
	        documents[1] = new Magasin("National Geographic", "John Doe", 2025, 129);
	        documents[2] = new These("L'intelligence artificielle", "Hamza ElKina", 2023, "Université ENSIASD");

	        
	        for (Document doc : documents) {
	            doc.afficherDetails();
	            System.out.println("-----------------------");
	        }
	}

}
