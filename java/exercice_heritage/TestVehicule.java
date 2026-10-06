public class TestVehicule {
    public static void main(String[] args) {
    	// Creation de vehicules
    	Vehicule v1 = new Vehicule("12345-A-1", 2015, 80000);
    	Vehicule v2 = new Vehicule("67890-B-6", 2020, 120000);

    	// Creation de voitures
    	Voiture c1 = new Voiture("11111-C-3", 2018, 150000, 5, 180, 6, 110);
    	Voiture c2 = new Voiture("22222-D-9", 2022, 300000, 2, 250, 7, 300);

    	System.out.println("=== Vehicule 1 ===");
    	v1.afficher();
    	System.out.println("\n=== Vehicule 2 ===");
    	v2.afficher();

    	System.out.println("\n=== Voiture 1 ===");
    	c1.afficher();
    	System.out.println("\n=== Voiture 2 ===");
    	c2.afficher();

    	// Test des getters et setters
    	System.out.println("\n=== Modification avec les setters ===");
    	v1.setPrix(75000);
    	v1.setAnnee(2016);
    	System.out.println("Nouveau prix de v1 : "+v1.getPrix());
    	System.out.println("Nouvel age de v1 : "+v1.calculerAge()+" ans");

    	c1.setVitesseMax(200);
    	c1.setNombreChevaux(130);
    	System.out.println("Nouvelle vitesse max de c1 : "+c1.getVitesseMax()+" km/h");
    	System.out.println("Nouveaux chevaux de c1 : "+c1.getNombreChevaux()+" ch");
    	System.out.println("Matricule de c1 (methode heritee) : "+c1.getMatricule());

    	// Polymorphisme : afficher() redefinie
    	System.out.println("\n=== Polymorphisme ===");
    	Vehicule v3 = c2;
    	v3.afficher();
    }
}
