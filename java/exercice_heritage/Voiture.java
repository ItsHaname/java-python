public class Voiture extends Vehicule {
	private int nombrePlaces;
	private int vitesseMax;
	private int nombreRapportsVitesse;
	private int nombreChevaux;

    public Voiture(String m, int a, double p, int places, int vMax, int rapports, int chevaux) {
    	super(m, a, p);
    	this.nombrePlaces=places;
    	this.vitesseMax=vMax;
    	this.nombreRapportsVitesse=rapports;
    	this.nombreChevaux=chevaux;
    }

    public int getNombrePlaces(){
    	return this.nombrePlaces;
    }
    public int getVitesseMax(){
    	return this.vitesseMax;
    }
    public int getNombreRapportsVitesse(){
    	return this.nombreRapportsVitesse;
    }
    public int getNombreChevaux(){
    	return this.nombreChevaux;
    }

    public void setNombrePlaces(int places){
    	this.nombrePlaces=places;
    }
    public void setVitesseMax(int vMax){
    	this.vitesseMax=vMax;
    }
    public void setNombreRapportsVitesse(int rapports){
    	this.nombreRapportsVitesse=rapports;
    }
    public void setNombreChevaux(int chevaux){
    	this.nombreChevaux=chevaux;
    }

    @Override
    public void afficher(){
    	super.afficher();
    	System.out.println("Nombre de places : "+this.nombrePlaces);
    	System.out.println("Vitesse max : "+this.vitesseMax+" km/h");
    	System.out.println("Nombre de rapports : "+this.nombreRapportsVitesse);
    	System.out.println("Nombre de chevaux : "+this.nombreChevaux+" ch");
    }
}
