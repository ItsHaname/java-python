/**
 * @(#)Voiture.java
 *
 *
 * @author
 * @version 1.00 2026/10/6
 */


public class Voiture extends Vehicule {
    private int nbrePlaces;
    private int vitesseMax;
    private int nombreRapportsVitesse;
    private int nombreChevaux;

    public Voiture(String matr, String mr, int a, int np) {
        super(mr, matr, a);
        this.nbrePlaces=np;
    }
    public Voiture(String mr, String mtr, int vm){
        super(mr, mtr);
        this.vitesseMax=vm;
    }
    public Voiture(int a, int np){
        super(a);
        this.nbrePlaces=np;
    }
    public Voiture(String matr, String mr, int a, int np, int vm, int nr, int nc) {
        super(mr, matr, a);
        this.nbrePlaces=np;
        this.vitesseMax=vm;
        this.nombreRapportsVitesse=nr;
        this.nombreChevaux=nc;
    }

    // Getters
    public int getNbrePlaces(){
        return this.nbrePlaces;
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

    // Setters
    public void setNbrePlaces(int np){
        this.nbrePlaces=np;
    }
    public void setVitesseMax(int vm){
        this.vitesseMax=vm;
    }
    public void setNombreRapportsVitesse(int nr){
        this.nombreRapportsVitesse=nr;
    }
    public void setNombreChevaux(int nc){
        this.nombreChevaux=nc;
    }

    // Les attributs de Vehicule sont prives : on passe par les getters
    @Override
    public void afficher(){
        System.out.println("Marque : "+getMarq()+" Matricule :"+getMatr()+" Annee : "+getAnnee()+" Age : "+calculerAge()+" ans"
            +" Nombre de Places ="+this.nbrePlaces+" Vitesse Max ="+this.vitesseMax
            +" Rapports ="+this.nombreRapportsVitesse+" Chevaux ="+this.nombreChevaux);
    }
}
