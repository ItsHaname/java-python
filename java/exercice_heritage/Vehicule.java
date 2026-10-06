import java.time.Year;

public class Vehicule {
	private String matricule;
	private int annee;
	private double prix;

    public Vehicule(String m, int a, double p) {
    	this.matricule=m;
    	this.annee=a;
    	this.prix=p;
    }

    public String getMatricule(){
    	return this.matricule;
    }
    public int getAnnee(){
    	return this.annee;
    }
    public double getPrix(){
    	return this.prix;
    }

    public void setMatricule(String m){
    	this.matricule=m;
    }
    public void setAnnee(int a){
    	this.annee=a;
    }
    public void setPrix(double p){
    	this.prix=p;
    }

    public int calculerAge(){
    	return Year.now().getValue()-this.annee;
    }

    public void afficher(){
    	System.out.println("Matricule : "+this.matricule);
    	System.out.println("Annee : "+this.annee);
    	System.out.println("Prix : "+this.prix);
    	System.out.println("Age : "+calculerAge()+" ans");
    }
}
