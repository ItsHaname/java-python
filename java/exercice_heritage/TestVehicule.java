/**
 * @(#)TestVehicule.java
 *
 *
 * @author
 * @version 1.00 2026/10/6
 */


public class TestVehicule {
    public static void main(String [] args){
        // a. Creer des vehicules et des voitures
        Vehicule ve1 = new Vehicule("FIAT", "V1", 2015);
        Vehicule ve2 = new Vehicule("RENAULT", "V2");
        Voiture vo1 = new Voiture("V3", "FORD", 2018, 5, 180, 6, 110);
        Voiture vo2 = new Voiture("BMW", "V4", 250);
        Voiture vo3 = new Voiture(2022, 4);
        Vehicule ve3 = new Voiture("V5", "AUDI", 2020, 5);

        // b. Appeler les differentes methodes
        System.out.println("=== afficher() ===");
        ve1.afficher();
        ve2.afficher();
        vo1.afficher();
        vo2.afficher();
        vo3.afficher();
        ve3.afficher(); // c'est afficher() de Voiture qui est appelee

        System.out.println("\n=== Getters ===");
        System.out.println("Marque de ve1 : "+ve1.getMarq());
        System.out.println("Age de ve1 : "+ve1.calculerAge()+" ans");
        System.out.println("Matricule de vo1 : "+vo1.getMatr());
        System.out.println("Vitesse max de vo1 : "+vo1.getVitesseMax());
        System.out.println("Chevaux de vo1 : "+vo1.getNombreChevaux());

        System.out.println("\n=== Setters ===");
        ve2.setAnnee(2010);
        vo3.setMarq("PEUGEOT");
        vo3.setMatr("V6");
        vo3.setVitesseMax(190);
        vo3.setNombreRapportsVitesse(5);
        vo3.setNombreChevaux(90);
        ve2.afficher();
        vo3.afficher();
    }
}
